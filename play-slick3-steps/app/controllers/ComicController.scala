package controllers

import model.{Comic, ComicForm}
import play.api.mvc._
import scala.concurrent.Future
import service.ComicService
import scala.concurrent.ExecutionContext.Implicits.global
import java.sql.Date;

class ComicController extends Controller {

  def comic = Action.async { implicit request =>
    ComicService.listAllComics map { comics =>
      Ok(views.html.comic(ComicForm.form, comics))
    }
    implicit request =>
    SubscriptionService.listAllSubscriptions map { comics =>
      Ok(views.html.comic(ComicForm.form, comics))
    }
  }

  def addComic() = Action.async { implicit request =>
    ComicForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => Future.successful(Ok(views.html.comic(errorForm, Seq.empty[Comic]))),
      data => {
        val newComic = Comic(0, data.name, data.description, data.publishedOn, data.categories)
        ComicService.addComic(newComic).map(res =>
          Redirect(routes.ComicController.comic())
        )
      })
  }

  def deleteComic(id: Long) = Action.async { implicit request =>
    ComicService.deleteComic(id) map { res =>
      Redirect(routes.ComicController.comic())
    }
  }

}


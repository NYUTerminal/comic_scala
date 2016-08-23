package controllers

import model.{Subscription, SubscriptionForm}
import play.api.mvc._
import scala.concurrent.Future
import service.SubscriptionService
import scala.concurrent.ExecutionContext.Implicits.global

class SubscriptionController extends Controller {

  def subscription = Action.async { implicit request =>
    SubscriptionService.listAllSubscription map { subscription =>
      Ok(views.html.subscription(SubscriptionForm.form, subscription))
    }
  }

  def addSubscription() = Action.async { implicit request =>
    SubscriptionForm.form.bindFromRequest.fold(
      // if any error in submitted data
      errorForm => Future.successful(Ok(views.html.subscription(errorForm, Seq.empty[Subscription]))),
      data => {
        val newSubscription = Subscription(0, data.userId, data.publishedOn, data.heroes, data.authors,data.comicTypes)
        SubscriptionService.addSubscription(newSubscription).map(res =>
          Redirect(routes.SubscriptionController.subscription())
        )
      })
  }

  def deleteSubscription(id: Long) = Action.async { implicit request =>
    SubscriptionService.deleteSubscription(id) map { res =>
      Redirect(routes.SubscriptionController.subscription())
    }
  }

}


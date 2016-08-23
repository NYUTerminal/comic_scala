package service

import model.{Comic, Comics}
import scala.concurrent.Future

object ComicService {

  def addComic(comic: Comic): Future[String] = {
    Comics.add(comic)
  }

  def deleteComic(id: Long): Future[Int] = {
    Comics.delete(id)
  }

  def getComic(id: Long): Future[Option[Comic]] = {
    Comics.get(id)
  }

  def listAllComics: Future[Seq[Comic]] = {
    Comics.listAll
  }
}

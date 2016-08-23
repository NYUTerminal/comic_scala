package model

import play.api.Play
import play.api.data.Form
import play.api.data.Forms._
import play.api.db.slick.DatabaseConfigProvider
import scala.concurrent.Future
import slick.driver.JdbcProfile
import slick.driver.MySQLDriver.api._
import scala.concurrent.ExecutionContext.Implicits.global
import java.sql.Date
// ,authors: List[String],heroes:List[String],status:String
case class Subscription(id: Long, userId: Long, publishedOn : Date, heroes : String, authors : String , comicTypes:String)

case class SubscriptionFormData(userId: Long, publishedOn : Date, heroes: String, authors: String , comicTypes: String)

object SubscriptionForm {
  val form = Form(
    mapping(
      "userId" -> longNumber,
      "publishedOn" -> sqlDate,
      "heroes" -> text,
      "authors" -> text,
      "comicTypes" -> text
    )(SubscriptionFormData.apply)(SubscriptionFormData.unapply)
  )
}

class SubscriptionTableDef(tag: Tag) extends Table[Subscription](tag, "user_comics_subscription") {

  def id = column[Long]("id", O.PrimaryKey,O.AutoInc)
  def userId = column[Long]("user_id")
  def publishedOn = column[Date]("published_on")
  def heroes = column[String]("heroes")
  def authors = column[String]("authors")
  def comicTypes = column[String]("comic_types")
  override def * =
    (id, userId, publishedOn,heroes,authors,comicTypes) <> ((Subscription.apply _).tupled, Subscription.unapply)
}

object Subscriptions {

  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  val user_comic_subscription = TableQuery[SubscriptionTableDef]

  def add(subscription: Subscription): Future[String] = {
    dbConfig.db.run(user_comic_subscription += subscription).map(res => "subscriptions successfully added").recover {
      case ex: Exception => ex.getCause.getMessage
    }
  }

  def delete(id: Long): Future[Int] = {
    dbConfig.db.run(user_comic_subscription.filter(_.id === id).delete)
  }

  def get(id: Long): Future[Option[Subscription]] = {
    dbConfig.db.run(user_comic_subscription.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[Subscription]] = {
    dbConfig.db.run(user_comic_subscription.result)
  }

}

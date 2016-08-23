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
case class Comic(id: Long, name: String, description: String, publishedOn: Date, categories: String)

case class ComicFormData(name: String, description: String, publishedOn: Date, categories: String)

object ComicForm {
  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "description" -> text,
      "publishedOn" -> sqlDate,
      "categories" -> text
    )(ComicFormData.apply)(ComicFormData.unapply)
  )
}

class ComicTableDef(tag: Tag) extends Table[Comic](tag, "comics") {

  def id = column[Long]("id", O.PrimaryKey,O.AutoInc)
  def name = column[String]("name")
  def description = column[String]("description")
  def publishedOn = column[Date]("published_on")
  def categories = column[String]("categories")

  override def * =
    (id, name, description, publishedOn, categories) <>(Comic.tupled, Comic.unapply)
}

object Comics {

  val dbConfig = DatabaseConfigProvider.get[JdbcProfile](Play.current)

  val comics = TableQuery[ComicTableDef]

  def add(comic: Comic): Future[String] = {
    dbConfig.db.run(comics += comic).map(res => "Comic successfully added").recover {
      case ex: Exception => ex.getCause.getMessage
    }
  }

  def delete(id: Long): Future[Int] = {
    dbConfig.db.run(comics.filter(_.id === id).delete)
  }

  def get(id: Long): Future[Option[Comic]] = {
    dbConfig.db.run(comics.filter(_.id === id).result.headOption)
  }

  def listAll: Future[Seq[Comic]] = {
    dbConfig.db.run(comics.result)
  }

}

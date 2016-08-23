package service

import model.{Subscription, Subscriptions}
import scala.concurrent.Future

object SubscriptionService {

  def addSubscription(subscription: Subscription): Future[String] = {
    Subscriptions.add(subscription)
  }

  def deleteSubscription(id: Long): Future[Int] = {
    Subscriptions.delete(id)
  }

  def getSubscription(id: Long): Future[Option[Subscription]] = {
    Subscriptions.get(id)
  }

  def listAllSubscription: Future[Seq[Subscription]] = {
    Subscriptions.listAll
  }
}

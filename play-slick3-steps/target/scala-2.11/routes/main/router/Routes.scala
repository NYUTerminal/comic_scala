
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/MeanMachine/Desktop/x.ai/play-slick3-steps/conf/routes
// @DATE:Sat Aug 06 17:41:18 EDT 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:11
  UserController_1: controllers.UserController,
  // @LINE:16
  ComicController_0: controllers.ComicController,
  // @LINE:21
  SubscriptionController_3: controllers.SubscriptionController,
  // @LINE:27
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:11
    UserController_1: controllers.UserController,
    // @LINE:16
    ComicController_0: controllers.ComicController,
    // @LINE:21
    SubscriptionController_3: controllers.SubscriptionController,
    // @LINE:27
    Assets_2: controllers.Assets
  ) = this(errorHandler, UserController_1, ComicController_0, SubscriptionController_3, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, UserController_1, ComicController_0, SubscriptionController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/add""", """controllers.UserController.addUser"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users/delete/$id<[^/]+>""", """controllers.UserController.deleteUser(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comics""", """controllers.ComicController.comic"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comics/add""", """controllers.ComicController.addComic"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comics/delete/$id<[^/]+>""", """controllers.ComicController.deleteComic(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions""", """controllers.SubscriptionController.subscription"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/add/""", """controllers.SubscriptionController.addSubscription"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subscriptions/delete/$id<[^/]+>""", """controllers.SubscriptionController.deleteSubscription(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:11
  private[this] lazy val controllers_UserController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_index0_invoker = createInvoker(
    UserController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "index",
      Nil,
      "GET",
      """ User pages""",
      this.prefix + """users"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_addUser1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/add")))
  )
  private[this] lazy val controllers_UserController_addUser1_invoker = createInvoker(
    UserController_1.addUser,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """users/add"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_deleteUser2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_deleteUser2_invoker = createInvoker(
    UserController_1.deleteUser(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "deleteUser",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """users/delete/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ComicController_comic3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comics")))
  )
  private[this] lazy val controllers_ComicController_comic3_invoker = createInvoker(
    ComicController_0.comic,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComicController",
      "comic",
      Nil,
      "GET",
      """ Commic pages""",
      this.prefix + """comics"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ComicController_addComic4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comics/add")))
  )
  private[this] lazy val controllers_ComicController_addComic4_invoker = createInvoker(
    ComicController_0.addComic,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComicController",
      "addComic",
      Nil,
      "POST",
      """""",
      this.prefix + """comics/add"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_ComicController_deleteComic5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comics/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ComicController_deleteComic5_invoker = createInvoker(
    ComicController_0.deleteComic(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ComicController",
      "deleteComic",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """comics/delete/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_SubscriptionController_subscription6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions")))
  )
  private[this] lazy val controllers_SubscriptionController_subscription6_invoker = createInvoker(
    SubscriptionController_3.subscription,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubscriptionController",
      "subscription",
      Nil,
      "GET",
      """ Subscription pages""",
      this.prefix + """subscriptions"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_SubscriptionController_addSubscription7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/add/")))
  )
  private[this] lazy val controllers_SubscriptionController_addSubscription7_invoker = createInvoker(
    SubscriptionController_3.addSubscription,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubscriptionController",
      "addSubscription",
      Nil,
      "POST",
      """""",
      this.prefix + """subscriptions/add/"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_SubscriptionController_deleteSubscription8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subscriptions/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_SubscriptionController_deleteSubscription8_invoker = createInvoker(
    SubscriptionController_3.deleteSubscription(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SubscriptionController",
      "deleteSubscription",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """subscriptions/delete/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned9_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:11
    case controllers_UserController_index0_route(params) =>
      call { 
        controllers_UserController_index0_invoker.call(UserController_1.index)
      }
  
    // @LINE:12
    case controllers_UserController_addUser1_route(params) =>
      call { 
        controllers_UserController_addUser1_invoker.call(UserController_1.addUser)
      }
  
    // @LINE:13
    case controllers_UserController_deleteUser2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_deleteUser2_invoker.call(UserController_1.deleteUser(id))
      }
  
    // @LINE:16
    case controllers_ComicController_comic3_route(params) =>
      call { 
        controllers_ComicController_comic3_invoker.call(ComicController_0.comic)
      }
  
    // @LINE:17
    case controllers_ComicController_addComic4_route(params) =>
      call { 
        controllers_ComicController_addComic4_invoker.call(ComicController_0.addComic)
      }
  
    // @LINE:18
    case controllers_ComicController_deleteComic5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ComicController_deleteComic5_invoker.call(ComicController_0.deleteComic(id))
      }
  
    // @LINE:21
    case controllers_SubscriptionController_subscription6_route(params) =>
      call { 
        controllers_SubscriptionController_subscription6_invoker.call(SubscriptionController_3.subscription)
      }
  
    // @LINE:22
    case controllers_SubscriptionController_addSubscription7_route(params) =>
      call { 
        controllers_SubscriptionController_addSubscription7_invoker.call(SubscriptionController_3.addSubscription)
      }
  
    // @LINE:23
    case controllers_SubscriptionController_deleteSubscription8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_SubscriptionController_deleteSubscription8_invoker.call(SubscriptionController_3.deleteSubscription(id))
      }
  
    // @LINE:27
    case controllers_Assets_versioned9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned9_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
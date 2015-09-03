
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Jesus/Desktop/prueba/conf/routes
// @DATE:Thu Sep 03 12:03:15 CDT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

object Routes extends Routes

class Routes extends GeneratedRouter {

  import ReverseRouteContext.empty

  override val errorHandler: play.api.http.HttpErrorHandler = play.api.http.LazyHttpErrorHandler

  private var _prefix = "/"

  def withPrefix(prefix: String): Routes = {
    _prefix = prefix
    router.RoutesPrefix.setPrefix(prefix)
    
    this
  }

  def prefix: String = _prefix

  lazy val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation: Seq[(String, String, String)] = List(
    ("""GET""", prefix, """controllers.Application.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/index""", """controllers.Distritos.index()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/list""", """controllers.Distritos.list()"""),
    ("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/show/$id<[^/]+>""", """controllers.Distritos.show(id:Long)"""),
    ("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito""", """controllers.Distritos.create()"""),
    ("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/$id<[^/]+>""", """controllers.Distritos.update(id:Long)"""),
    ("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """distrito/$id<[^/]+>""", """controllers.Distritos.delete(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    controllers.Application.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    controllers.Assets.versioned(fakeValue[String], fakeValue[Asset]),
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

  // @LINE:11
  private[this] lazy val controllers_Distritos_index2_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/index")))
  )
  private[this] lazy val controllers_Distritos_index2_invoker = createInvoker(
    controllers.Distritos.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """distrito/index"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Distritos_list3_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/list")))
  )
  private[this] lazy val controllers_Distritos_list3_invoker = createInvoker(
    controllers.Distritos.list(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "list",
      Nil,
      "GET",
      """""",
      this.prefix + """distrito/list"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Distritos_show4_route: Route.ParamsExtractor = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/show/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_show4_invoker = createInvoker(
    controllers.Distritos.show(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "show",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """distrito/show/$id<[^/]+>"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Distritos_create5_route: Route.ParamsExtractor = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito")))
  )
  private[this] lazy val controllers_Distritos_create5_invoker = createInvoker(
    controllers.Distritos.create(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """distrito"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Distritos_update6_route: Route.ParamsExtractor = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_update6_invoker = createInvoker(
    controllers.Distritos.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "update",
      Seq(classOf[Long]),
      "PUT",
      """""",
      this.prefix + """distrito/$id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Distritos_delete7_route: Route.ParamsExtractor = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("distrito/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Distritos_delete7_invoker = createInvoker(
    controllers.Distritos.delete(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Distritos",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      """""",
      this.prefix + """distrito/$id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(controllers.Assets.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Distritos_index2_route(params) =>
      call { 
        controllers_Distritos_index2_invoker.call(controllers.Distritos.index())
      }
  
    // @LINE:12
    case controllers_Distritos_list3_route(params) =>
      call { 
        controllers_Distritos_list3_invoker.call(controllers.Distritos.list())
      }
  
    // @LINE:13
    case controllers_Distritos_show4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_show4_invoker.call(controllers.Distritos.show(id))
      }
  
    // @LINE:14
    case controllers_Distritos_create5_route(params) =>
      call { 
        controllers_Distritos_create5_invoker.call(controllers.Distritos.create())
      }
  
    // @LINE:15
    case controllers_Distritos_update6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_update6_invoker.call(controllers.Distritos.update(id))
      }
  
    // @LINE:16
    case controllers_Distritos_delete7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Distritos_delete7_invoker.call(controllers.Distritos.delete(id))
      }
  }
}

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Welcome to Java")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""

	"""),format.raw/*5.2*/("""<h1>Evomatik done hola mundo</h1>
    """),_display_(/*6.6*/play20/*6.12*/.welcome(message, style = "Java")),format.raw/*6.45*/("""
""")))}),format.raw/*7.2*/("""
"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 12:03:20 CDT 2015
                  SOURCE: C:/Users/Jesus/Desktop/prueba/app/views/index.scala.html
                  HASH: e0f6385118a030064bc8abf1459a9e646accc2a4
                  MATRIX: 745->1|857->18|885->21|916->44|955->46|984->49|1048->88|1062->94|1115->127|1146->129
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6|38->7
                  -- GENERATED --
              */
          
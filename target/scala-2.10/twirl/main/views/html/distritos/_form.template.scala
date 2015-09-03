
package views.html.distritos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _form_Scope0 {
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

class _form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.3*/(element: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
	"""),format.raw/*2.2*/("""<div class="twelve columns">
		<div class="field">
			"""),_display_(/*4.5*/if(element.equals("editModal"))/*4.36*/{_display_(Seq[Any](format.raw/*4.37*/(""" 
				"""),format.raw/*5.5*/("""<input type="hidden" id="id" name="id" />
			""")))}),format.raw/*6.5*/("""
		  	"""),format.raw/*7.6*/("""<label class="inline" for="distrito">Distrito</label>
		    <input class="input" type="text" id="distrito" name="distrito" """),_display_(/*8.71*/if(element.equals("editModal"))/*8.102*/{_display_(Seq[Any](format.raw/*8.103*/(""" """),format.raw/*8.104*/("""data-edit="true"""")))}),format.raw/*8.121*/(""" """),format.raw/*8.122*/("""placeholder="Distrito" />

		</div>
	</div>
	<div class="twelve columns">
		<div class="six columns text-right">
			<div class="btn secondary medium">
			"""),_display_(/*15.5*/if(element.equals("editModal"))/*15.36*/{_display_(Seq[Any](format.raw/*15.37*/(""" 
				"""),format.raw/*16.5*/("""<a href="#" class="editAction">Editar</a></div>
			""")))}),format.raw/*17.5*/("""
			"""),_display_(/*18.5*/if(element.equals("newModal"))/*18.35*/{_display_(Seq[Any](format.raw/*18.36*/(""" 
				"""),format.raw/*19.5*/("""<a href="#" class="createAction">Crear</a></div>
			""")))}),format.raw/*20.5*/("""
		"""),format.raw/*21.3*/("""</div>
		<div class="six columns text-left">
			<div class="btn primary medium"><a href="#" class="cancelAction">Cancelar</a></div>
		</div>
	</div>
"""))
      }
    }
  }

  def render(element:String): play.twirl.api.HtmlFormat.Appendable = apply(element)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (element) => apply(element)

  def ref: this.type = this

}


}

/**/
object _form extends _form_Scope0._form
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 12:03:22 CDT 2015
                  SOURCE: C:/Users/Jesus/Desktop/prueba/app/views/distritos/_form.scala.html
                  HASH: 0ba193e050857884ed385dbbb74d7b1b0e0151a2
                  MATRIX: 755->2|867->19|895->21|975->76|1014->107|1052->108|1084->114|1159->160|1191->166|1341->290|1381->321|1420->322|1449->323|1497->340|1526->341|1707->496|1747->527|1786->528|1819->534|1901->586|1932->591|1971->621|2010->622|2043->628|2126->681|2156->684
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|36->5|37->6|38->7|39->8|39->8|39->8|39->8|39->8|39->8|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|50->19|51->20|52->21
                  -- GENERATED --
              */
          
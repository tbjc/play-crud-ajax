
package views.html.distritos

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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
	<title></title>
	<link rel="stylesheet" href=""""),_display_(/*5.32*/routes/*5.38*/.Assets.versioned("css/gumby.css")),format.raw/*5.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*6.32*/routes/*6.38*/.Assets.versioned("css/style.css")),format.raw/*6.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*7.32*/routes/*7.38*/.Assets.versioned("css/rev.css")),format.raw/*7.70*/("""" media="screen">
	<link rel="stylesheet" href=""""),_display_(/*8.32*/routes/*8.38*/.Assets.versioned("css/sidebar.css")),format.raw/*8.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*9.32*/routes/*9.38*/.Assets.versioned("css/icons.css")),format.raw/*9.72*/("""">
	<link rel="stylesheet" href=""""),_display_(/*10.32*/routes/*10.38*/.Assets.versioned("css/sweetalert.css")),format.raw/*10.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*11.32*/routes/*11.38*/.Assets.versioned("css/jquery.dataTables.css")),format.raw/*11.84*/("""">
	<link rel="stylesheet" href=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("css/dataTables.responsive.css")),format.raw/*12.88*/("""">
	<link rel="stylesheet" href=""""),_display_(/*13.32*/routes/*13.38*/.Assets.versioned("css/style-tabs.css")),format.raw/*13.77*/("""">
	<link rel="stylesheet" href=""""),_display_(/*14.32*/routes/*14.38*/.Assets.versioned("css/classic.css")),format.raw/*14.74*/("""">
	<link rel="stylesheet" href=""""),_display_(/*15.32*/routes/*15.38*/.Assets.versioned("css/classic.date.css")),format.raw/*15.79*/("""">
	<link rel="stylesheet" href=""""),_display_(/*16.32*/routes/*16.38*/.Assets.versioned("css/token-input.css")),format.raw/*16.78*/("""">
	<!-- <link href=""""),_display_(/*17.20*/routes/*17.26*/.Assets.versioned("css/ionicons.css")),format.raw/*17.63*/("""" rel="stylesheet" type="text/css" /> -->
	<!-- <link href=""""),_display_(/*18.20*/routes/*18.26*/.Assets.versioned("css/gridstack.min.css")),format.raw/*18.68*/("""" rel="stylesheet" type="text/css" /> -->

	<!-- Grab Google CDN's jQuery, fall back to local if offline -->
	<!-- 2.0 for modern browsers, 1.10 for .oldie -->
	<script type="text/javascript">
	var oldieCheck = Boolean(document.getElementsByTagName('html')[0].className.match(/\soldie\s/g));
	if(!oldieCheck) """),format.raw/*24.18*/("""{"""),format.raw/*24.19*/("""
	"""),format.raw/*25.2*/("""document.write('<script src=""""),_display_(/*25.32*/routes/*25.38*/.Assets.versioned("js/jquery-2.0.2.min.js")),format.raw/*25.81*/(""""><\/script>');
	"""),format.raw/*26.2*/("""}"""),format.raw/*26.3*/(""" """),format.raw/*26.4*/("""else """),format.raw/*26.9*/("""{"""),format.raw/*26.10*/("""
	"""),format.raw/*27.2*/("""document.write('<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"><\/script>');
	"""),format.raw/*28.2*/("""}"""),format.raw/*28.3*/("""
	"""),format.raw/*29.2*/("""</script>
	<script>
	if(!window.jQuery) """),format.raw/*31.21*/("""{"""),format.raw/*31.22*/("""
	"""),format.raw/*32.2*/("""if(!oldieCheck) """),format.raw/*32.18*/("""{"""),format.raw/*32.19*/("""
	  """),format.raw/*33.4*/("""document.write('<script src=""""),_display_(/*33.34*/routes/*33.40*/.Assets.versioned("js/jquery-2.1.3.min.js")),format.raw/*33.83*/(""""><\/script>');
	"""),format.raw/*34.2*/("""}"""),format.raw/*34.3*/(""" """),format.raw/*34.4*/("""else """),format.raw/*34.9*/("""{"""),format.raw/*34.10*/("""
	  """),format.raw/*35.4*/("""document.write('<script src=""""),_display_(/*35.34*/routes/*35.40*/.Assets.versioned("js/libs/jquery-1.10.1.min.js")),format.raw/*35.89*/(""""><\/script>');
	"""),format.raw/*36.2*/("""}"""),format.raw/*36.3*/("""
	"""),format.raw/*37.2*/("""}"""),format.raw/*37.3*/("""
	"""),format.raw/*38.2*/("""</script>

	<script src=""""),_display_(/*40.16*/routes/*40.22*/.Assets.versioned("js/jquery-ui.min.js")),format.raw/*40.62*/(""""></script>
	<script src=""""),_display_(/*41.16*/routes/*41.22*/.Assets.versioned("js/libs/modernizr-2.6.2.min.js")),format.raw/*41.73*/(""""></script>
	<script src=""""),_display_(/*42.16*/routes/*42.22*/.Assets.versioned("js/jquery.dataTables.min.js")),format.raw/*42.70*/(""""></script>
	<script src=""""),_display_(/*43.16*/routes/*43.22*/.Assets.versioned("js/dataTables.responsive.js")),format.raw/*43.70*/(""""></script>
	<script>
		var config = """),format.raw/*45.16*/("""{"""),format.raw/*45.17*/("""
			"""),format.raw/*46.4*/("""environment: '"""),_display_(/*46.19*/play/*46.23*/.Play.application().configuration().getString("Evomatik.Logger.js")),format.raw/*46.90*/("""',
		"""),format.raw/*47.3*/("""}"""),format.raw/*47.4*/("""
	"""),format.raw/*48.2*/("""</script>
	<script src=""""),_display_(/*49.16*/routes/*49.22*/.Assets.versioned("js/utilerias.js")),format.raw/*49.58*/(""""></script>
</head>
<body>



<div class="row">
	   	<div class="six columns">
	   		 <h2>Distritos</h2>
	   	</div>
	   	<div class="six columns text-right">
	   		  <div class="medium primary btn">
			 	<a href="#" class="switch newAction" gumby-trigger="#newModal"><i class="icon ion-plus"></i> Nuevo</a>
			 </div>
	   	</div>

	   	</div>
	   	<div class="row">
		<div class="twelve columns">
	   		<table class="contentTable list-table display responsive no-wrap" width="100%" id="distritoTable">
				<thead>
					<tr>
						<th>ID</th>
						<th>Distrito</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody class="construct-content list-table display responsive no-wrap" width="100%" id="distritooBody">
					
				</tbody>
			</table>
			<div class="text-center">
				<div class="pagination"></div>
			</div>
	   	</div>
	   </div>
	</div>

<div class="modal" id="newModal">
	  <div class="content">
	    <a class="close switch" gumby-trigger="|#newModal"><i class="icon-cancel" /></i></a>
	    <div class="row">
	      <div class="ten centered columns">
	        """),_display_(/*92.11*/form("newModal", "createForm")),format.raw/*92.41*/("""
	      """),format.raw/*93.8*/("""</div>
	    </div>
	  </div>
	</div>

	<div class="modal" id="editModal">
	  <div class="content">
	    <a class="close switch" gumby-trigger="|#editModal"><i class="icon-cancel" /></i></a>
	    <div class="row">
	      <div class="ten centered columns">
	        """),_display_(/*103.11*/form("editModal", "editForm")),format.raw/*103.40*/("""
	      """),format.raw/*104.8*/("""</div>
	    </div>
	  </div>
	</div>
<script type="text/template" id="object-Template">
	<% _.each(Objects, function(object)"""),format.raw/*109.37*/("""{"""),format.raw/*109.38*/(""" """),format.raw/*109.39*/("""%>
		<tr class="object" data-row="_<%= object.id %>">
			<td><span id="_<%= object.id %>"><%= object.id %></td>
			<td><span id="dis_<%= object.id %>"><%= object.distrito %></span></td>
			<td>
	     <div class="medium warning btn icon-right icon-pencil"><a href="#" id="editActionbtn" data-id="<%= object.id %>"> Editar</a></div>
	     <div class="medium danger btn icon-right icon-cancel-circled"><a href="#" id="deleteAction" data-id="<%= object.id %>"> Eliminar</a></div> 
	   </td>
		</tr>
	<% """),format.raw/*118.5*/("""}"""),format.raw/*118.6*/("""); %>
</script>
<script src=""""),_display_(/*120.15*/routes/*120.21*/.Assets.versioned("js/underscore.js")),format.raw/*120.58*/(""""></script>
	<script gumby-touch=""""),_display_(/*121.24*/routes/*121.30*/.Assets.versioned("js/libs")),format.raw/*121.58*/("""" src=""""),_display_(/*121.66*/routes/*121.72*/.Assets.versioned("js/libs/gumby.min.js")),format.raw/*121.113*/(""""></script>
	<script src=""""),_display_(/*122.16*/routes/*122.22*/.Assets.versioned("js/libs/ui/jquery.validation.js")),format.raw/*122.74*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*123.16*/routes/*123.22*/.Assets.versioned("js/sweetalert.min.js")),format.raw/*123.63*/(""""></script>
	<script src=""""),_display_(/*124.16*/routes/*124.22*/.Assets.versioned("js/modernizr.custom.js")),format.raw/*124.65*/(""""></script>
	<script src=""""),_display_(/*125.16*/routes/*125.22*/.Assets.versioned("js/plugins.js")),format.raw/*125.56*/(""""></script>
	<script src=""""),_display_(/*126.16*/routes/*126.22*/.Assets.versioned("js/main.js")),format.raw/*126.53*/(""""></script>
	<script src=""""),_display_(/*127.16*/routes/*127.22*/.Assets.versioned("js/classie.js")),format.raw/*127.56*/(""""></script>
	<script src=""""),_display_(/*128.16*/routes/*128.22*/.Assets.versioned("js/sidebarEffects.js")),format.raw/*128.63*/(""""></script>
	<script src=""""),_display_(/*129.16*/routes/*129.22*/.Assets.versioned("js/resetForm.js")),format.raw/*129.58*/(""""></script>
	<script src=""""),_display_(/*130.16*/routes/*130.22*/.Assets.versioned("js/tabs-responsive.js")),format.raw/*130.64*/(""""></script>
	<script src=""""),_display_(/*131.16*/routes/*131.22*/.Assets.versioned("js/modernizr.js")),format.raw/*131.58*/(""""></script>
	
	<script src=""""),_display_(/*133.16*/routes/*133.22*/.Assets.versioned("js/jquery.slimscroll.min.js")),format.raw/*133.70*/(""""></script>
	<!-- <script src=""""),_display_(/*134.21*/routes/*134.27*/.Assets.versioned("javascripts/main/mainLayoutController.js")),format.raw/*134.88*/(""""></script> -->
	<script src=""""),_display_(/*135.16*/routes/*135.22*/.Assets.versioned("js/jquery.cookie.js")),format.raw/*135.62*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*136.16*/routes/*136.22*/.Assets.versioned("js/picker.js")),format.raw/*136.55*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*137.16*/routes/*137.22*/.Assets.versioned("js/picker.date.js")),format.raw/*137.60*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*138.16*/routes/*138.22*/.Assets.versioned("js/jquery.inputmask.js")),format.raw/*138.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*139.16*/routes/*139.22*/.Assets.versioned("js/jquery.maskMoney.js")),format.raw/*139.65*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*140.16*/routes/*140.22*/.Assets.versioned("js/jquery.inputmask.date.extensions.js")),format.raw/*140.81*/("""" type="text/javascript"></script>
	<script src=""""),_display_(/*141.16*/routes/*141.22*/.Assets.versioned("js/jquery.tokeninput.js")),format.raw/*141.66*/("""" type="text/javascript"></script>

<script src=""""),_display_(/*143.15*/routes/*143.21*/.Assets.versioned("javascripts/distrito.js")),format.raw/*143.65*/(""""></script>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Sep 03 12:03:22 CDT 2015
                  SOURCE: C:/Users/Jesus/Desktop/prueba/app/views/distritos/index.scala.html
                  HASH: f70d941dcdb643a78adce64c2be30a50332c3d5a
                  MATRIX: 837->0|941->78|955->84|1009->118|1069->152|1083->158|1137->192|1197->226|1211->232|1263->264|1338->313|1352->319|1408->355|1468->389|1482->395|1536->429|1597->463|1612->469|1672->508|1733->542|1748->548|1815->594|1876->628|1891->634|1962->684|2023->718|2038->724|2098->763|2159->797|2174->803|2231->839|2292->873|2307->879|2369->920|2430->954|2445->960|2506->1000|2555->1022|2570->1028|2628->1065|2716->1126|2731->1132|2794->1174|3131->1483|3160->1484|3189->1486|3246->1516|3261->1522|3325->1565|3369->1582|3397->1583|3425->1584|3457->1589|3486->1590|3515->1592|3653->1703|3681->1704|3710->1706|3778->1746|3807->1747|3836->1749|3880->1765|3909->1766|3940->1770|3997->1800|4012->1806|4076->1849|4120->1866|4148->1867|4176->1868|4208->1873|4237->1874|4268->1878|4325->1908|4340->1914|4410->1963|4454->1980|4482->1981|4511->1983|4539->1984|4568->1986|4621->2012|4636->2018|4697->2058|4751->2085|4766->2091|4838->2142|4892->2169|4907->2175|4976->2223|5030->2250|5045->2256|5114->2304|5179->2341|5208->2342|5239->2346|5281->2361|5294->2365|5382->2432|5414->2437|5442->2438|5471->2440|5523->2465|5538->2471|5595->2507|6706->3591|6757->3621|6792->3629|7085->3894|7136->3923|7172->3931|7325->4055|7355->4056|7385->4057|7912->4556|7941->4557|7999->4587|8015->4593|8074->4630|8137->4665|8153->4671|8203->4699|8239->4707|8255->4713|8319->4754|8374->4781|8390->4787|8464->4839|8542->4889|8558->4895|8621->4936|8676->4963|8692->4969|8757->5012|8812->5039|8828->5045|8884->5079|8939->5106|8955->5112|9008->5143|9063->5170|9079->5176|9135->5210|9190->5237|9206->5243|9269->5284|9324->5311|9340->5317|9398->5353|9453->5380|9469->5386|9533->5428|9588->5455|9604->5461|9662->5497|9719->5526|9735->5532|9805->5580|9865->5612|9881->5618|9964->5679|10023->5710|10039->5716|10101->5756|10179->5806|10195->5812|10250->5845|10328->5895|10344->5901|10404->5939|10482->5989|10498->5995|10563->6038|10641->6088|10657->6094|10722->6137|10800->6187|10816->6193|10897->6252|10975->6302|10991->6308|11057->6352|11135->6402|11151->6408|11217->6452
                  LINES: 32->1|36->5|36->5|36->5|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|58->27|59->28|59->28|60->29|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|64->33|65->34|65->34|65->34|65->34|65->34|66->35|66->35|66->35|66->35|67->36|67->36|68->37|68->37|69->38|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|76->45|76->45|77->46|77->46|77->46|77->46|78->47|78->47|79->48|80->49|80->49|80->49|123->92|123->92|124->93|134->103|134->103|135->104|140->109|140->109|140->109|149->118|149->118|151->120|151->120|151->120|152->121|152->121|152->121|152->121|152->121|152->121|153->122|153->122|153->122|154->123|154->123|154->123|155->124|155->124|155->124|156->125|156->125|156->125|157->126|157->126|157->126|158->127|158->127|158->127|159->128|159->128|159->128|160->129|160->129|160->129|161->130|161->130|161->130|162->131|162->131|162->131|164->133|164->133|164->133|165->134|165->134|165->134|166->135|166->135|166->135|167->136|167->136|167->136|168->137|168->137|168->137|169->138|169->138|169->138|170->139|170->139|170->139|171->140|171->140|171->140|172->141|172->141|172->141|174->143|174->143|174->143
                  -- GENERATED --
              */
          
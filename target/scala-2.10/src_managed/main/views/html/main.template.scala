
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html ng-app>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*8.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*9.114*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">


    </head>
    <body>
        """),_display_(Seq[Any](/*16.10*/content)),format.raw/*16.17*/("""
        <script src=""""),_display_(Seq[Any](/*17.23*/routes/*17.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*17.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*18.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*19.23*/routes/*19.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*19.71*/(""""></script>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.Html = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 16 22:42:40 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/main.scala.html
                    HASH: f48083f84a0b69546bae53ffc2f5238fa535d528
                    MATRIX: 727->1|834->31|929->91|955->96|1052->158|1066->164|1131->207|1222->263|1236->269|1312->323|1404->379|1419->385|1475->419|1572->480|1587->486|1641->518|1714->555|1743->562|1802->585|1817->591|1884->636|1977->693|1992->699|2054->739|2124->773|2139->779|2203->821
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19
                    -- GENERATED --
                */
            
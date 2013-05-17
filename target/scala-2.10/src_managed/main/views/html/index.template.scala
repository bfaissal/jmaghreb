
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.1")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    <div class="well-large">JMaghreb web site ! 2</div>
    <div class="row">
        <div class="span12">
            <button class="btn-danger">Allo</button>
        </div>

    </div>
    
""")))})),format.raw/*12.2*/("""
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu May 16 22:46:46 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/index.scala.html
                    HASH: 4519bdda09a8ec4a7a1193ab2dcb8acc68fb3e94
                    MATRIX: 723->1|817->18|854->21|889->48|928->50|1153->244
                    LINES: 26->1|29->1|31->3|31->3|31->3|40->12
                    -- GENERATED --
                */
            
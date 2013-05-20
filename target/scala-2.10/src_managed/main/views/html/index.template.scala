
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
<html ng-app>
<head>
<title>JMaghreb</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.50*/routes/*5.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*5.95*/(""""  />
    <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*6.107*/(""""  />
    <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.51*/routes/*7.57*/.Assets.at("stylesheets/main.css"))),format.raw/*7.91*/(""""  />
</head>
<bod>

        <!-- NAVBAR
    ================================================== -->
    <div class="navbar-wrapper">
            <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
        <div class="container">

            <div class="navbar navbar-inverse navbar-fixed-top">
                <div class="navbar-inner">
                        <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
                    <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="brand" href="#">JMaghreb</a>
                        <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
                    <div class="nav-collapse collapse">
                        <ul class="nav">
                            <li class="active"><a href="#">Home</a></li>
                            <li><a href="#about">Our speakers</a></li>
                            <li><a href="#about">Register</a></li>
                            <li><a href="#contact">Schedules</a></li>
                            <li><a href="#contact">Hosting</a></li>

                        </ul>
                    </div><!--/.nav-collapse -->
                </div><!-- /.navbar-inner -->
            </div><!-- /.navbar -->

        </div> <!-- /.container -->
    </div><!-- /.navbar-wrapper -->

    <!-- Carousel
    ================================================== -->
    <div id="myCarousel" class="carousel slide">
        <div class="carousel-inner">
            <div class="item active">
                <img src=""""),_display_(Seq[Any](/*48.28*/routes/*48.34*/.Assets.at("images/DSC_0272.JPG"))),format.raw/*48.67*/("""" alt="" style="-webkit-filter:blur(7px);">
                <div class="container">
                    <div class="carousel-caption">
                        <h1>JMaghreb 2013</h1>
                        <p class="lead">The biggest conference in North Africa.</p>
                        <a class="btn btn-large btn-primary" href="#">Register Now</a>
                    </div>
                </div>
            </div>
        </div>

    </div><!-- /.carousel -->
    <div class="container" >
        <div class="row marketing">
            <div class="span4">
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*63.48*/routes/*63.54*/.Assets.at("images/jugMorocco_reasonably_small.png"))),format.raw/*63.106*/("""">
                <h2>Community driven</h2>
                <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
            <div class="span4">
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*69.48*/routes/*69.54*/.Assets.at("images/java.jpg"))),format.raw/*69.83*/("""">
                <h2>JAVA focused</h2>
                <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
            <div class="span4">
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*75.48*/routes/*75.54*/.Assets.at("images/web_design.png"))),format.raw/*75.89*/("""">
                <h2>Related technologies</h2>
                <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
        </div><!-- /.row -->
        <!-- START THE FEATURETTES -->

        <hr class="featurette-divider">

        <div class="featurette">
            <img class="featurette-image pull-left" src=""""),_display_(Seq[Any](/*86.59*/routes/*86.65*/.Assets.at("images/community.png"))),format.raw/*86.99*/("""">
            <h2 class="featurette-heading">Oh yeah, it's that good. <span class="muted">Check last year's edition.</span></h2>
            <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
        </div>

        <iframe src="http://player.vimeo.com/video/31953775" width="90%" height="100%" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
        <hr class="featurette-divider">


            <!-- /END THE FEATURETTES  -->


            <!-- FOOTER -->
        <footer>

            <p>&copy; 2013 JMaghreb, Inc. &middot;</p>
        </footer>
    </div>
        <!-- javascript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->


    <script src=""""),_display_(Seq[Any](/*109.19*/routes/*109.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*109.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*110.19*/routes/*110.25*/.Assets.at("javascripts/angular.min.js"))),format.raw/*110.65*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*111.19*/routes/*111.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*111.67*/(""""></script>
    <script>
        !function ($) """),format.raw/*113.23*/("""{"""),format.raw/*113.24*/("""
        $(function()"""),format.raw/*114.21*/("""{"""),format.raw/*114.22*/("""
        // carousel demo
        $('#myCarousel').carousel()
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/(""")
        """),format.raw/*118.9*/("""}"""),format.raw/*118.10*/("""(window.jQuery)
    </script>
</bod>
</html>
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 20 00:11:17 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/index.scala.html
                    HASH: 88184a35fd1982d4e0afc118ce5b183fb1d8e9dc
                    MATRIX: 723->1|817->18|947->113|961->119|1021->158|1112->214|1126->220|1198->270|1289->326|1303->332|1358->366|3355->2327|3370->2333|3425->2366|4073->2978|4088->2984|4163->3036|4706->3543|4721->3549|4772->3578|5319->4089|5334->4095|5391->4130|6051->4754|6066->4760|6122->4794|7110->5745|7126->5751|7194->5796|7284->5849|7300->5855|7363->5895|7430->5925|7446->5931|7511->5973|7587->6020|7617->6021|7667->6042|7697->6043|7795->6113|7825->6114|7863->6124|7893->6125
                    LINES: 26->1|29->1|33->5|33->5|33->5|34->6|34->6|34->6|35->7|35->7|35->7|76->48|76->48|76->48|91->63|91->63|91->63|97->69|97->69|97->69|103->75|103->75|103->75|114->86|114->86|114->86|137->109|137->109|137->109|138->110|138->110|138->110|139->111|139->111|139->111|141->113|141->113|142->114|142->114|145->117|145->117|146->118|146->118
                    -- GENERATED --
                */
            
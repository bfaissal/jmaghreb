
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
    <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*4.50*/routes/*4.56*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*4.95*/(""""  />
    <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.51*/routes/*5.57*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*5.107*/(""""  />
    <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.51*/routes/*6.57*/.Assets.at("stylesheets/main.css"))),format.raw/*6.91*/(""""  />
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
                <img src=""""),_display_(Seq[Any](/*47.28*/routes/*47.34*/.Assets.at("/images/DSC_0272.JPG"))),format.raw/*47.68*/("""" alt="" style="-webkit-filter:blur(7px);">
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
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*62.48*/routes/*62.54*/.Assets.at("images/jugMorocco_reasonably_small.png"))),format.raw/*62.106*/("""">
                <h2>Community driven</h2>
                <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
            <div class="span4">
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*68.48*/routes/*68.54*/.Assets.at("images/java.jpg"))),format.raw/*68.83*/("""">
                <h2>JAVA focused</h2>
                <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
            <div class="span4">
                <img class="img-rounded" src=""""),_display_(Seq[Any](/*74.48*/routes/*74.54*/.Assets.at("images/web_design.png"))),format.raw/*74.89*/("""">
                <h2>Related technologies</h2>
                <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                <p><a class="btn" href="#">View details &raquo;</a></p>
            </div><!-- /.span4 -->
        </div><!-- /.row -->
        <!-- START THE FEATURETTES -->

        <hr class="featurette-divider">

        <div class="featurette">
            <img class="featurette-image pull-left" src=""""),_display_(Seq[Any](/*85.59*/routes/*85.65*/.Assets.at("images/community.png"))),format.raw/*85.99*/("""">
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


    <script src=""""),_display_(Seq[Any](/*108.19*/routes/*108.25*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*108.70*/("""" type="text/javascript"></script>
    <script src=""""),_display_(Seq[Any](/*109.19*/routes/*109.25*/.Assets.at("javascripts/angular.min.js"))),format.raw/*109.65*/(""""></script>
    <script src=""""),_display_(Seq[Any](/*110.19*/routes/*110.25*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*110.67*/(""""></script>
    <script>
        !function ($) """),format.raw/*112.23*/("""{"""),format.raw/*112.24*/("""
        $(function()"""),format.raw/*113.21*/("""{"""),format.raw/*113.22*/("""
        // carousel demo
        $('#myCarousel').carousel()
        """),format.raw/*116.9*/("""}"""),format.raw/*116.10*/(""")
        """),format.raw/*117.9*/("""}"""),format.raw/*117.10*/("""(window.jQuery)
    </script>
</bod>
</html>"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun May 19 23:25:32 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/index.scala.html
                    HASH: d7a586a7ee9f01e98c7e8e7c3a599b03add5cd82
                    MATRIX: 723->1|817->18|923->89|937->95|997->134|1088->190|1102->196|1174->246|1265->302|1279->308|1334->342|3331->2303|3346->2309|3402->2343|4050->2955|4065->2961|4140->3013|4683->3520|4698->3526|4749->3555|5296->4066|5311->4072|5368->4107|6028->4731|6043->4737|6099->4771|7087->5722|7103->5728|7171->5773|7261->5826|7277->5832|7340->5872|7407->5902|7423->5908|7488->5950|7564->5997|7594->5998|7644->6019|7674->6020|7772->6090|7802->6091|7840->6101|7870->6102
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|75->47|75->47|75->47|90->62|90->62|90->62|96->68|96->68|96->68|102->74|102->74|102->74|113->85|113->85|113->85|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|140->112|140->112|141->113|141->113|144->116|144->116|145->117|145->117
                    -- GENERATED --
                */
            
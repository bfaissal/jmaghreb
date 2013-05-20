
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
object test extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<html ng-app>
    <head>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*4.54*/routes/*4.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*4.99*/(""""  />
        <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*5.55*/routes/*5.61*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*5.111*/(""""  />
        <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.55*/routes/*6.61*/.Assets.at("stylesheets/main.css"))),format.raw/*6.95*/(""""  />
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
                    <img src=""""),_display_(Seq[Any](/*47.32*/routes/*47.38*/.Assets.at("/images/DSC_0272.JPG"))),format.raw/*47.72*/("""" alt="" style="-webkit-filter:blur(7px);">
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
                     <img class="img-rounded" src=""""),_display_(Seq[Any](/*62.53*/routes/*62.59*/.Assets.at("images/jugMorocco_reasonably_small.png"))),format.raw/*62.111*/("""">
                     <h2>Community driven</h2>
                     <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
                     <p><a class="btn" href="#">View details &raquo;</a></p>
                 </div><!-- /.span4 -->
                 <div class="span4">
                     <img class="img-rounded" src=""""),_display_(Seq[Any](/*68.53*/routes/*68.59*/.Assets.at("images/java.jpg"))),format.raw/*68.88*/("""">
                     <h2>JAVA focused</h2>
                     <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                     <p><a class="btn" href="#">View details &raquo;</a></p>
                 </div><!-- /.span4 -->
                 <div class="span4">
                     <img class="img-rounded" src=""""),_display_(Seq[Any](/*74.53*/routes/*74.59*/.Assets.at("images/web_design.png"))),format.raw/*74.94*/("""">
                     <h2>Related technologies</h2>
                     <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                     <p><a class="btn" href="#">View details &raquo;</a></p>
                 </div><!-- /.span4 -->
             </div><!-- /.row -->
             <!-- START THE FEATURETTES -->

             <hr class="featurette-divider">

             <div class="featurette">
                 <img class="featurette-image pull-left" src=""""),_display_(Seq[Any](/*85.64*/routes/*85.70*/.Assets.at("images/community.png"))),format.raw/*85.104*/("""">
                 <h2 class="featurette-heading">Oh yeah, it's that good. <span class="muted">Check last year edition.</span></h2>
                 <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
             </div>

             <iframe src="http://player.vimeo.com/video/31953775" width="90%" height="100%" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
             <hr class="featurette-divider">


                 <!-- /END THE FEATURETTES -->


                 <!-- FOOTER -->
             <footer>

                 <p>&copy; 2013 JMaghreb, Inc. &middot;</p>
             </footer>
         </div>
            <!-- javascript
    ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->


        <script src=""""),_display_(Seq[Any](/*108.23*/routes/*108.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*108.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*109.23*/routes/*109.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*109.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*110.23*/routes/*110.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*110.71*/(""""></script>
        <script>
            !function ($) """),format.raw/*112.27*/("""{"""),format.raw/*112.28*/("""
            $(function()"""),format.raw/*113.25*/("""{"""),format.raw/*113.26*/("""
            // carousel demo
            $('#myCarousel').carousel()
            """),format.raw/*116.13*/("""}"""),format.raw/*116.14*/(""")
            """),format.raw/*117.13*/("""}"""),format.raw/*117.14*/("""(window.jQuery)
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
                    DATE: Mon May 20 00:11:18 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/test.scala.html
                    HASH: 474109b71fb576a3926a8a093010bdacf7dd2bf5
                    MATRIX: 722->1|816->18|930->97|944->103|1004->142|1099->202|1113->208|1185->258|1280->318|1294->324|1349->358|3482->2455|3497->2461|3553->2495|4261->3167|4276->3173|4351->3225|4924->3762|4939->3768|4990->3797|5567->4338|5582->4344|5639->4379|6344->5048|6359->5054|6416->5088|7468->6103|7484->6109|7552->6154|7646->6211|7662->6217|7725->6257|7796->6291|7812->6297|7877->6339|7961->6394|7991->6395|8045->6420|8075->6421|8186->6503|8216->6504|8259->6518|8289->6519
                    LINES: 26->1|29->1|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|75->47|75->47|75->47|90->62|90->62|90->62|96->68|96->68|96->68|102->74|102->74|102->74|113->85|113->85|113->85|136->108|136->108|136->108|137->109|137->109|137->109|138->110|138->110|138->110|140->112|140->112|141->113|141->113|144->116|144->116|145->117|145->117
                    -- GENERATED --
                */
            
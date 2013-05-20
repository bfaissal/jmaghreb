
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
        <title>JMaghreb</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*6.54*/routes/*6.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*6.99*/(""""  />
        <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*7.55*/routes/*7.61*/.Assets.at("stylesheets/bootstrap-responsive.css"))),format.raw/*7.111*/(""""  />
        <link  rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.55*/routes/*8.61*/.Assets.at("stylesheets/main.css"))),format.raw/*8.95*/(""""  />
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.54*/routes/*9.60*/.Assets.at("stylesheets/animations.css"))),format.raw/*9.100*/(""""  />
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/component.css"))),format.raw/*10.99*/(""""  />
    </head>
    <body ng-controller="mainController">

            <!-- NAVBAR
    ================================================== -->
        <div class="navbar-wrapper">
                <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
            <div class="container">

                <div class="navbar navbar-inverse navbar-fixed-top">
                    <div class="navbar-inner">
                        <div class="container">
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
                                <li  id="iterateEffects" ng-click="goToPage(0)"><a href="#">Home</a></li>
                                <li><a href="#about" ng-click="goToPage(1)">Our speakers</a></li>
                                <li><a href="#register" ng-click="goToPage(2)">Register</a></li>
                                <li><a href="#speakers" ng-click="goToPage(3)">Schedules</a></li>
                                <li><a href="#hosting" ng-click="goToPage(4)">Hosting</a></li>

                            </ul>
                        </div><!--/.nav-collapse -->
                        </div>
                    </div><!-- /.navbar-inner -->
                </div><!-- /.navbar -->

            </div> <!-- /.container -->
        </div><!-- /.navbar-wrapper -->
        <div id="pt-main" class="pt-perspective">
                <!-- pages -->
                <!-- page 1
    ===========================================================
    -->
            <div ng-controller="homeController" class="pt-page pt-page-1" id="page1">
                    <!-- Carousel
    ================================================== -->
                <div id="myCarousel" class="carousel slide">
                    <div class="carousel-inner">
                        <div class="item active">
                            <img src=""""),_display_(Seq[Any](/*58.40*/routes/*58.46*/.Assets.at("images/DSC_0272.JPG"))),format.raw/*58.79*/("""" alt="" style="-webkit-filter:blur(7px);">
                            <div class="container">
                                <div class="carousel-caption">
                                    <h1>JMaghreb 2013</h1>
                                    <p class="lead">The biggest JAVA conference in North Africa.</p>
                                    <a class="btn btn-large btn-primary" href="#">Register Now</a>
                                </div>
                            </div>
                        </div>
                    </div>

                </div><!-- /.carousel -->
                <div class="container" >
                    <div class="row marketing">
                        <div class="span4">
                            <img class="img-rounded" src=""""),_display_(Seq[Any](/*73.60*/routes/*73.66*/.Assets.at("images/jugMorocco_reasonably_small.png"))),format.raw/*73.118*/("""">
                            <h2>Community driven</h2>
                            <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
                            <p><a class="btn" href="#">View details &raquo;</a></p>
                        </div><!-- /.span4 -->
                        <div class="span4">
                            <img class="img-rounded" src=""""),_display_(Seq[Any](/*79.60*/routes/*79.66*/.Assets.at("images/java.jpg"))),format.raw/*79.95*/("""">
                            <h2>JAVA focused</h2>
                            <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                            <p><a class="btn" href="#">View details &raquo;</a></p>
                        </div><!-- /.span4 -->
                        <div class="span4">
                            <img class="img-rounded" src=""""),_display_(Seq[Any](/*85.60*/routes/*85.66*/.Assets.at("images/web_design.png"))),format.raw/*85.101*/("""">
                            <h2>Cutting edge technologies</h2>
                            <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                            <p><a class="btn" href="#">View details &raquo;</a></p>
                        </div><!-- /.span4 -->
                    </div><!-- /.row -->
                    <!-- START THE FEATURETTES -->

                    <hr class="featurette-divider">

                    <div class="featurette">
                        <img class="featurette-image pull-left" src=""""),_display_(Seq[Any](/*96.71*/routes/*96.77*/.Assets.at("images/community.png"))),format.raw/*96.111*/("""">
                        <h2 class="featurette-heading">Oh yeah, it's that good. <span class="muted">Check last year's edition.</span></h2>
                        <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
                    </div>
                        <!--
        <iframe src="http://player.vimeo.com/video/31953775" width="90%" height="100%" frameborder="0" webkitAllowFullScreen mozallowfullscreen allowFullScreen></iframe>
        -->
                    <hr class="featurette-divider">

                        <!-- /END THE FEATURETTES  -->
                </div>
            </div>
                <!-- end page 1
    ===========================================================
    -->
                <!-- page 2
    ===========================================================
    -->
            <div ng-controller="speakersController" class="pt-page pt-page-2" id="page2"  >
                <img src=""""),_display_(Seq[Any](/*115.28*/routes/*115.34*/.Assets.at("images/slide-01.jpg"))),format.raw/*115.67*/(""""/>
                Any thing about speakers  <br/>
            </div>

                <!-- end page 2
    ===========================================================
    -->

                <!-- page 3
    ===========================================================
    -->
            <div ng-controller="speakersController" class="pt-page pt-page-3" id="page3"  >
                <img src=""""),_display_(Seq[Any](/*127.28*/routes/*127.34*/.Assets.at("images/slide-02.jpg"))),format.raw/*127.67*/(""""/>

            </div>

                <!-- end page 3
    ===========================================================
    -->

                <!-- page 4
    ===========================================================
    -->
            <div ng-controller="speakersController" class="pt-page pt-page-4" id="page4"  >
                <img src=""""),_display_(Seq[Any](/*139.28*/routes/*139.34*/.Assets.at("images/crowd.jpg"))),format.raw/*139.64*/(""""/>

            </div>

                <!-- end page 4
    ===========================================================
    -->

                <!-- page 5
    ===========================================================
    -->
            <div ng-controller="speakersController" class="pt-page pt-page-5" id="page5"  >
                <img src=""""),_display_(Seq[Any](/*151.28*/routes/*151.34*/.Assets.at("images/community.png"))),format.raw/*151.68*/(""""/>

            </div>

                <!-- end page 5
    ===========================================================
    -->
                <!-- FOOTER -->
            <footer>

                <p>&copy; 2013 JMaghreb, Inc. &middot;</p>
            </footer>
        </div>
            <!-- javascript
    ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->



        <script src=""""),_display_(Seq[Any](/*170.23*/routes/*170.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*170.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*171.23*/routes/*171.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*171.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*172.23*/routes/*172.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*172.71*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*173.23*/routes/*173.29*/.Assets.at("javascripts/modernizr.custom.js"))),format.raw/*173.74*/(""""></script>

        <script src=""""),_display_(Seq[Any](/*175.23*/routes/*175.29*/.Assets.at("javascripts/pagetransitions.js"))),format.raw/*175.73*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*176.23*/routes/*176.29*/.Assets.at("javascripts/app.js"))),format.raw/*176.61*/(""""></script>

    </body>
</html>
"""))}
    }
    
    def render(message:String): play.api.templates.Html = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon May 20 16:23:30 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/test.scala.html
                    HASH: 60e62e71745ffce71f80d150c0cd5566a643d540
                    MATRIX: 722->1|816->18|1041->208|1055->214|1115->253|1210->313|1224->319|1296->369|1391->429|1405->435|1460->469|1554->528|1568->534|1630->574|1725->633|1740->639|1801->678|4480->3321|4495->3327|4550->3360|5371->4145|5386->4151|5461->4203|6076->4782|6091->4788|6142->4817|6761->5400|6776->5406|6834->5441|7607->6178|7622->6184|7679->6218|8820->7322|8836->7328|8892->7361|9325->7757|9341->7763|9397->7796|9783->8145|9799->8151|9852->8181|10238->8530|10254->8536|10311->8570|10819->9041|10835->9047|10903->9092|10997->9149|11013->9155|11076->9195|11147->9229|11163->9235|11228->9277|11299->9311|11315->9317|11383->9362|11455->9397|11471->9403|11538->9447|11632->9504|11648->9510|11703->9542
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|36->8|36->8|36->8|37->9|37->9|37->9|38->10|38->10|38->10|86->58|86->58|86->58|101->73|101->73|101->73|107->79|107->79|107->79|113->85|113->85|113->85|124->96|124->96|124->96|143->115|143->115|143->115|155->127|155->127|155->127|167->139|167->139|167->139|179->151|179->151|179->151|198->170|198->170|198->170|199->171|199->171|199->171|200->172|200->172|200->172|201->173|201->173|201->173|203->175|203->175|203->175|204->176|204->176|204->176
                    -- GENERATED --
                */
            
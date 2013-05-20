
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
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>Carousel Template &middot; Bootstrap</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

            <!-- Le styles -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap-responsive.min.css"))),format.raw/*13.114*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*14.103*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("stylesheets/main.css"))),format.raw/*15.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*16.59*/routes/*16.65*/.Assets.at("images/favicon.png"))),format.raw/*16.97*/("""">
        <style>


        </style>

            <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
            <!--[if lt IE 9]>
      <script src="../assets/js/html5shiv.js"></script>
    <![endif]-->

            <!-- Fav and touch icons -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
        <link rel="shortcut icon" href="../assets/ico/favicon.png">
    </head>

    <body>



            <!-- NAVBAR
    ================================================== -->
        <div class="navbar-wrapper">
                <!-- Wrap the .navbar in .container to center it within the absolutely positioned parent. -->
            <div class="container">

                <div class="navbar navbar-inverse">
                    <div class="navbar-inner">
                            <!-- Responsive Navbar Part 1: Button for triggering responsive navbar (not covered in tutorial). Include responsive CSS to utilize. -->
                        <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="brand" href="#">Project name</a>
                            <!-- Responsive Navbar Part 2: Place all navbar contents you want collapsed withing .navbar-collapse.collapse. -->
                        <div class="nav-collapse collapse">
                            <ul class="nav">
                                <li class="active"><a href="#">Home</a></li>
                                <li><a href="#about">About us</a></li>
                                <li><a href="#contact">Contact</a></li>
                                    <!-- Read about Bootstrap dropdowns at http://twitter.github.com/bootstrap/javascript.html#dropdowns -->
                                <li class="dropdown">
                                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown <b class="caret"></b></a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Action</a></li>
                                        <li><a href="#">Another action</a></li>
                                        <li><a href="#">Something else here</a></li>
                                        <li class="divider"></li>
                                        <li class="nav-header">Nav header</li>
                                        <li><a href="#">Separated link</a></li>
                                        <li><a href="#">One more separated link</a></li>
                                    </ul>
                                </li>
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
                    <img src=""""),_display_(Seq[Any](/*88.32*/routes/*88.38*/.Assets.at("/images/slide-01.jpg"))),format.raw/*88.72*/("""" alt="">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Example headline.</h1>
                            <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                            <a class="btn btn-large btn-primary" href="#">Sign up today</a>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src=""""),_display_(Seq[Any](/*98.32*/routes/*98.38*/.Assets.at("/images/slide-02.jpg"))),format.raw/*98.72*/("""" alt="">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>Another example headline.</h1>
                            <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                            <a class="btn btn-large btn-primary" href="#">Learn more</a>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <img src=""""),_display_(Seq[Any](/*108.32*/routes/*108.38*/.Assets.at("/images/slide-03.jpg"))),format.raw/*108.72*/("""" alt="">
                    <div class="container">
                        <div class="carousel-caption">
                            <h1>One more for good measure.</h1>
                            <p class="lead">Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.</p>
                            <a class="btn btn-large btn-primary" href="#">Browse gallery</a>
                        </div>
                    </div>
                </div>
            </div>
            <a class="left carousel-control" href="#myCarousel" data-slide="prev">&lsaquo;</a>
            <a class="right carousel-control" href="#myCarousel" data-slide="next">&rsaquo;</a>
        </div><!-- /.carousel -->



        <!-- Marketing messaging and featurettes
    ================================================== -->
        <!-- Wrap the rest of the page in another container to center all the content. -->

        <div class="container marketing">

                <!-- Three columns of text below the carousel -->
            <div class="row">
                <div class="span4">
                    <img class="img-circle" data-src="holder.js/140x140">
                    <h2>Heading</h2>
                    <p>Donec sed odio dui. Etiam porta sem malesuada magna mollis euismod. Nullam id dolor id nibh ultricies vehicula ut id elit. Morbi leo risus, porta ac consectetur ac, vestibulum at eros. Praesent commodo cursus magna, vel scelerisque nisl consectetur et.</p>
                    <p><a class="btn" href="#">View details &raquo;</a></p>
                </div><!-- /.span4 -->
                <div class="span4">
                    <img class="img-circle" data-src="holder.js/140x140">
                    <h2>Heading</h2>
                    <p>Duis mollis, est non commodo luctus, nisi erat porttitor ligula, eget lacinia odio sem nec elit. Cras mattis consectetur purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn" href="#">View details &raquo;</a></p>
                </div><!-- /.span4 -->
                <div class="span4">
                    <img class="img-circle" data-src="holder.js/140x140">
                    <h2>Heading</h2>
                    <p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis in, egestas eget quam. Vestibulum id ligula porta felis euismod semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus.</p>
                    <p><a class="btn" href="#">View details &raquo;</a></p>
                </div><!-- /.span4 -->
            </div><!-- /.row -->


            <!-- START THE FEATURETTES -->

            <hr class="featurette-divider">

            <div class="featurette">
                <img class="featurette-image pull-right" style="width: 35%" src=""""),_display_(Seq[Any](/*158.83*/routes/*158.89*/.Assets.at("images/big_logo_Mjug.gif"))),format.raw/*158.127*/("""">
                <h2 class="featurette-heading">First featurette headling. <span class="muted">It'll blow your mind.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>

            <hr class="featurette-divider">

            <div class="featurette">
                <img class="featurette-image pull-left" src=""""),_display_(Seq[Any](/*166.63*/routes/*166.69*/.Assets.at("images/community.png"))),format.raw/*166.103*/("""">
                <h2 class="featurette-heading">Oh yeah, it's that good. <span class="muted">See for yourself.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>

            <hr class="featurette-divider">

            <div class="featurette">
                <img class="featurette-image pull-right" src=""""),_display_(Seq[Any](/*174.64*/routes/*174.70*/.Assets.at("images/java.jpg"))),format.raw/*174.99*/("""">
                <h2 class="featurette-heading">And lastly, this one. <span class="muted">Checkmate.</span></h2>
                <p class="lead">Donec ullamcorper nulla non metus auctor fringilla. Vestibulum id ligula porta felis euismod semper. Praesent commodo cursus magna, vel scelerisque nisl consectetur. Fusce dapibus, tellus ac cursus commodo.</p>
            </div>

            <hr class="featurette-divider">

                <!-- /END THE FEATURETTES -->


                <!-- FOOTER -->
            <footer>
                <p class="pull-right"><a href="#">Back to top</a></p>
                <p>&copy; 2013 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
            </footer>

        </div><!-- /.container -->



        <!-- Le javascript
    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->

        """),_display_(Seq[Any](/*198.10*/content)),format.raw/*198.17*/("""
        <script src=""""),_display_(Seq[Any](/*199.23*/routes/*199.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*199.74*/("""" type="text/javascript"></script>
        <script src=""""),_display_(Seq[Any](/*200.23*/routes/*200.29*/.Assets.at("javascripts/angular.min.js"))),format.raw/*200.69*/(""""></script>
        <script src=""""),_display_(Seq[Any](/*201.23*/routes/*201.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*201.71*/(""""></script>
        <script>
            !function ($) """),format.raw/*203.27*/("""{"""),format.raw/*203.28*/("""
            $(function()"""),format.raw/*204.25*/("""{"""),format.raw/*204.26*/("""
            // carousel demo
            $('#myCarousel').carousel()
            """),format.raw/*207.13*/("""}"""),format.raw/*207.14*/(""")
            """),format.raw/*208.13*/("""}"""),format.raw/*208.14*/("""(window.jQuery)
        </script>
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
                    DATE: Mon May 20 00:11:17 EDT 2013
                    SOURCE: /Users/faissalboutaounte/work/JMaghreb/web/app/views/main.scala.html
                    HASH: 8ffb714ed66f47f206290f643b75dc8651e4ca93
                    MATRIX: 727->1|834->31|1256->417|1271->423|1348->477|1440->533|1455->539|1521->582|1613->638|1628->644|1684->678|1781->739|1796->745|1850->777|5636->4527|5651->4533|5707->4567|6360->5184|6375->5190|6431->5224|7090->5846|7106->5852|7163->5886|10215->8901|10231->8907|10293->8945|10868->9483|10884->9489|10942->9523|11512->10056|11528->10062|11580->10091|12557->11031|12587->11038|12647->11061|12663->11067|12731->11112|12825->11169|12841->11175|12904->11215|12975->11249|12991->11255|13056->11297|13140->11352|13170->11353|13224->11378|13254->11379|13365->11461|13395->11462|13438->11476|13468->11477
                    LINES: 26->1|29->1|41->13|41->13|41->13|42->14|42->14|42->14|43->15|43->15|43->15|44->16|44->16|44->16|116->88|116->88|116->88|126->98|126->98|126->98|136->108|136->108|136->108|186->158|186->158|186->158|194->166|194->166|194->166|202->174|202->174|202->174|226->198|226->198|227->199|227->199|227->199|228->200|228->200|228->200|229->201|229->201|229->201|231->203|231->203|232->204|232->204|235->207|235->207|236->208|236->208
                    -- GENERATED --
                */
            

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object comic_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class comic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[model.ComicFormData],Seq[model.Comic],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comicForm: Form[model.ComicFormData],comics : Seq[model.Comic])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.99*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""

    """),format.raw/*4.5*/("""<form id="comic-data-form" role="form" action='"""),_display_(/*4.53*/routes/*4.59*/.ComicController.addComic()),format.raw/*4.86*/("""' method="post" class="form-horizontal" align="center" autocomplete="off">

        <fieldset class="comic-fieldset">

            <div class="comic-form">
                <label class="form-title" style="color: #F8741B; font-size: 22px;font-weight: bold; text-decoration:none">Comics Store</label>
            </div>
            <br/>
            <table align="center" cellspacing="20">
                <tr>
                    <td align="left">
                        <div class="comic-form" id="firstName_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <strong>name</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="firstName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="name" name="name" value="" placeholder="First Name" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="comic-form" id="lastName_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <strong>description</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="lastName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="description" name="description" value="" placeholder="Last Name" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="comic-form" id="mobile_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <strong>published on</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="mobile_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="date" id="publishedOn" name="publishedOn" placeholder="Mobile" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="comic-form" id="email_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <strong>categories</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="email_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="categories" name="categories" placeholder="Email" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
            </table>
            <br/>
            <div class="form-actions controls ynt-btn-xlarge">
                <button type="submit" class="btn btn-primary ynt-btn-orange">Add</button>
            </div>

        </fieldset>
    </form>

    <div class="comic-display" >
        <fieldset>
            <legend align="center"><h3>Registered Comics</h3></legend>
            <table cellspacing="20">
                <tr>
                    <th>comicid</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Published On</th>
                    <th>Categories</th>
                </tr>
                """),_display_(/*121.18*/for(comic <- comics) yield /*121.38*/{_display_(Seq[Any](format.raw/*121.39*/("""
                    """),format.raw/*122.21*/("""<tr>
                        <td>"""),_display_(/*123.30*/comic/*123.35*/.id),format.raw/*123.38*/("""</td>
                        <td>"""),_display_(/*124.30*/comic/*124.35*/.name),format.raw/*124.40*/("""</td>
                        <td>"""),_display_(/*125.30*/comic/*125.35*/.description),format.raw/*125.47*/("""</td>
                        <td>"""),_display_(/*126.30*/comic/*126.35*/.publishedOn),format.raw/*126.47*/("""</td>
                        <td>"""),_display_(/*127.30*/comic/*127.35*/.categories),format.raw/*127.46*/("""</td>
                        <td><a href=""""),_display_(/*128.39*/routes/*128.45*/.ComicController.deleteComic(comic.id)),format.raw/*128.83*/("""">delete</a></td>
                    </tr>
                """)))}),format.raw/*130.18*/("""
            """),format.raw/*131.13*/("""</table>
        </fieldset>
    </div>

        <div class="comic-display" >
        <fieldset>
            <legend align="center"><h3>Registered Comics</h3></legend>
            <table cellspacing="20">
                <tr>
                    <th>Comicid</th>
                    <th>User id</th>
                    <th>Published On</th>
                    <th>Heroes</th>
                    <th>Authors</th>
                    <th>Categories</th>
                </tr>
                """),_display_(/*147.18*/for(subscription <- subscriptions) yield /*147.52*/{_display_(Seq[Any](format.raw/*147.53*/("""
                    """),format.raw/*148.21*/("""<tr>
                        <td>"""),_display_(/*149.30*/subscription/*149.42*/.id),format.raw/*149.45*/("""</td>
                        <td>"""),_display_(/*150.30*/subscription/*150.42*/.userId),format.raw/*150.49*/("""</td>
                        <td>"""),_display_(/*151.30*/subscription/*151.42*/.publishedOn),format.raw/*151.54*/("""</td>
                        <td>"""),_display_(/*152.30*/subscription/*152.42*/.heroes),format.raw/*152.49*/("""</td>
                        <td>"""),_display_(/*153.30*/subscription/*153.42*/.authors),format.raw/*153.50*/("""</td>
                        <td>"""),_display_(/*154.30*/subscription/*154.42*/.comicTypes),format.raw/*154.53*/("""</td>
                        <td><a href=""""),_display_(/*155.39*/routes/*155.45*/.SubscriptionController.deleteSubscription(subscription.id)),format.raw/*155.104*/("""">delete</a></td>
                    </tr>
                """)))}),format.raw/*157.18*/("""
            """),format.raw/*158.13*/("""</table>
        </fieldset>
    </div>

""")))}))
      }
    }
  }

  def render(comicForm:Form[model.ComicFormData],comics:Seq[model.Comic],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(comicForm,comics)(request)

  def f:((Form[model.ComicFormData],Seq[model.Comic]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (comicForm,comics) => (request) => apply(comicForm,comics)(request)

  def ref: this.type = this

}


}

/**/
object comic extends comic_Scope0.comic
              /*
                  -- GENERATED --
                  DATE: Sat Aug 06 23:55:14 EDT 2016
                  SOURCE: /Users/MeanMachine/Desktop/x.ai/play-slick3-steps/app/views/comic.scala.html
                  HASH: 21adca021359516945a7dbc38b86ae618c5c85cd
                  MATRIX: 577->1|769->98|796->100|809->106|848->108|880->114|954->162|968->168|1015->195|7147->6299|7184->6319|7224->6320|7274->6341|7336->6375|7351->6380|7376->6383|7439->6418|7454->6423|7481->6428|7544->6463|7559->6468|7593->6480|7656->6515|7671->6520|7705->6532|7768->6567|7783->6572|7816->6583|7888->6627|7904->6633|7964->6671|8057->6732|8099->6745|8621->7239|8672->7273|8712->7274|8762->7295|8824->7329|8846->7341|8871->7344|8934->7379|8956->7391|8985->7398|9048->7433|9070->7445|9104->7457|9167->7492|9189->7504|9218->7511|9281->7546|9303->7558|9333->7566|9396->7601|9418->7613|9451->7624|9523->7668|9539->7674|9621->7733|9714->7794|9756->7807
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|28->4|28->4|28->4|145->121|145->121|145->121|146->122|147->123|147->123|147->123|148->124|148->124|148->124|149->125|149->125|149->125|150->126|150->126|150->126|151->127|151->127|151->127|152->128|152->128|152->128|154->130|155->131|171->147|171->147|171->147|172->148|173->149|173->149|173->149|174->150|174->150|174->150|175->151|175->151|175->151|176->152|176->152|176->152|177->153|177->153|177->153|178->154|178->154|178->154|179->155|179->155|179->155|181->157|182->158
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object subscription_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class subscription extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[model.SubscriptionFormData],Seq[model.Subscription],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(subscriptionForm: Form[model.SubscriptionFormData],subscriptions : Seq[model.Subscription])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.127*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""

    """),format.raw/*4.5*/("""<form id="comic-data-form" role="form" action='"""),_display_(/*4.53*/routes/*4.59*/.SubscriptionController.addSubscription()),format.raw/*4.100*/("""' method="post" class="form-horizontal" align="center" autocomplete="off">

        <fieldset class="comic-fieldset">

            <div class="comic-form">
                <label class="form-title" style="color: #F8741B; font-size: 22px;font-weight: bold; text-decoration:none">Subscribe to you favourite comics</label>
            </div>
            <br/>
            <table align="center" cellspacing="20">
                <tr>
                    <td align="left">
                        <div class="comic-form" id="firstName_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <strong>user id </strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="firstName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="userId" name="userId" value="" placeholder="User Id" class="form-control input-lg" required>
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
                                    <input type="date" id="publishedOn" name="publishedOn" placeholder="Published On" class="form-control input-lg" required>
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
                                    <strong>heroes </strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="lastName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="heroes" name="heroes" value="" placeholder="heroes" class="form-control input-lg" required>
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
                                    <strong>authors </strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="email_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="authors" name="authors" placeholder="Authors" class="form-control input-lg" required>
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
                                    <strong>comicTypes </strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="comic-form" id="email_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-comic"></span></span>
                                    <input type="text" id="comicTypes" name="comicTypes" placeholder="comicTypes" class="form-control input-lg" required>
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
                    <th>Comicid</th>
                    <th>User id</th>
                    <th>Published On</th>
                    <th>Heroes</th>
                    <th>Authors</th>
                    <th>Categories</th>
                </tr>
                """),_display_(/*144.18*/for(subscription <- subscriptions) yield /*144.52*/{_display_(Seq[Any](format.raw/*144.53*/("""
                    """),format.raw/*145.21*/("""<tr>
                        <td>"""),_display_(/*146.30*/subscription/*146.42*/.id),format.raw/*146.45*/("""</td>
                        <td>"""),_display_(/*147.30*/subscription/*147.42*/.userId),format.raw/*147.49*/("""</td>
                        <td>"""),_display_(/*148.30*/subscription/*148.42*/.publishedOn),format.raw/*148.54*/("""</td>
                        <td>"""),_display_(/*149.30*/subscription/*149.42*/.heroes),format.raw/*149.49*/("""</td>
                        <td>"""),_display_(/*150.30*/subscription/*150.42*/.authors),format.raw/*150.50*/("""</td>
                        <td>"""),_display_(/*151.30*/subscription/*151.42*/.comicTypes),format.raw/*151.53*/("""</td>
                        <td><a href=""""),_display_(/*152.39*/routes/*152.45*/.SubscriptionController.deleteSubscription(subscription.id)),format.raw/*152.104*/("""">delete</a></td>
                    </tr>
                """)))}),format.raw/*154.18*/("""
            """),format.raw/*155.13*/("""</table>
        </fieldset>
    </div>

""")))}))
      }
    }
  }

  def render(subscriptionForm:Form[model.SubscriptionFormData],subscriptions:Seq[model.Subscription],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(subscriptionForm,subscriptions)(request)

  def f:((Form[model.SubscriptionFormData],Seq[model.Subscription]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (subscriptionForm,subscriptions) => (request) => apply(subscriptionForm,subscriptions)(request)

  def ref: this.type = this

}


}

/**/
object subscription extends subscription_Scope0.subscription
              /*
                  -- GENERATED --
                  DATE: Sat Aug 06 23:52:39 EDT 2016
                  SOURCE: /Users/MeanMachine/Desktop/x.ai/play-slick3-steps/app/views/subscription.scala.html
                  HASH: 4501f5076e37d73725b0203723c86b86942f09ef
                  MATRIX: 605->1|826->126|853->128|866->134|905->136|937->142|1011->190|1025->196|1087->237|8541->7663|8592->7697|8632->7698|8682->7719|8744->7753|8766->7765|8791->7768|8854->7803|8876->7815|8905->7822|8968->7857|8990->7869|9024->7881|9087->7916|9109->7928|9138->7935|9201->7970|9223->7982|9253->7990|9316->8025|9338->8037|9371->8048|9443->8092|9459->8098|9541->8157|9634->8218|9676->8231
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|28->4|28->4|28->4|168->144|168->144|168->144|169->145|170->146|170->146|170->146|171->147|171->147|171->147|172->148|172->148|172->148|173->149|173->149|173->149|174->150|174->150|174->150|175->151|175->151|175->151|176->152|176->152|176->152|178->154|179->155
                  -- GENERATED --
              */
          
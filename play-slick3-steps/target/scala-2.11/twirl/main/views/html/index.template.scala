
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Form[model.UserFormData],Seq[model.User],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[model.UserFormData],users : Seq[model.User])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""
"""),_display_(/*2.2*/main()/*2.8*/ {_display_(Seq[Any](format.raw/*2.10*/("""

    """),format.raw/*4.5*/("""<form id="user-data-form" role="form" action='"""),_display_(/*4.52*/routes/*4.58*/.UserController.addUser()),format.raw/*4.83*/("""' method="post" class="form-horizontal" align="center" autocomplete="off">

        <fieldset class="user-fieldset">

            <div class="user-form">
                <label class="form-title" style="color: #F8741B; font-size: 22px;font-weight: bold; text-decoration:none">title</label>
            </div>
            <br/>
            <table align="center" cellspacing="20">
                <tr>
                    <td align="left">
                        <div class="user-form" id="firstName_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <strong>firstname</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="user-form" id="firstName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="text" id="firstName" name="firstName" value="" placeholder="First Name" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="user-form" id="lastName_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <strong>lastname</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="user-form" id="lastName_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="text" id="lastName" name="lastName" value="" placeholder="Last Name" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="user-form" id="mobile_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <strong>mobile</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="user-form" id="mobile_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="tel" id="mobile" name="mobile" placeholder="Mobile" class="form-control input-lg" required>
                                </div>
                            </div>
                        </div>
                    </td>
                </tr>
                <tr>
                    <td align="left">
                        <div class="user-form" id="email_field_label">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <strong>email</strong> :
                                </div>
                            </div>
                        </div>
                    </td>
                    <td align="center">
                        <div class="user-form" id="email_field_value">
                            <div class="controls col-xs-offset-3 col-xs-9">
                                <div class="input-group">
                                    <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                                    <input type="email" id="email" name="email" placeholder="Email" class="form-control input-lg" required>
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

    <div class="user-display" >
        <fieldset>
            <legend align="center"><h3>Registered Users</h3></legend>
            <table cellspacing="20">
                <tr>
                    <th>userid</th>
                    <th>firstname</th>
                    <th>lastname</th>
                    <th>mobile</th>
                    <th>email</th>
                </tr>
                """),_display_(/*121.18*/for(user <- users) yield /*121.36*/{_display_(Seq[Any](format.raw/*121.37*/("""
                    """),format.raw/*122.21*/("""<tr>
                        <td>"""),_display_(/*123.30*/user/*123.34*/.id),format.raw/*123.37*/("""</td>
                        <td>"""),_display_(/*124.30*/user/*124.34*/.firstName),format.raw/*124.44*/("""</td>
                        <td>"""),_display_(/*125.30*/user/*125.34*/.lastName),format.raw/*125.43*/("""</td>
                        <td>"""),_display_(/*126.30*/user/*126.34*/.mobile),format.raw/*126.41*/("""</td>
                        <td>"""),_display_(/*127.30*/user/*127.34*/.email),format.raw/*127.40*/("""</td>
                        <td><a href=""""),_display_(/*128.39*/routes/*128.45*/.UserController.deleteUser(user.id)),format.raw/*128.80*/("""">delete</a></td>
                    </tr>
                """)))}),format.raw/*130.18*/("""
            """),format.raw/*131.13*/("""</table>
        </fieldset>
    </div>

""")))}))
      }
    }
  }

  def render(userForm:Form[model.UserFormData],users:Seq[model.User],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(userForm,users)(request)

  def f:((Form[model.UserFormData],Seq[model.User]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (userForm,users) => (request) => apply(userForm,users)(request)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Aug 06 23:41:38 EDT 2016
                  SOURCE: /Users/MeanMachine/Desktop/x.ai/play-slick3-steps/app/views/index.scala.html
                  HASH: 0339fad5da90cdca85c0f61b560d5cff12864bfe
                  MATRIX: 575->1|763->94|790->96|803->102|842->104|874->110|947->157|961->163|1006->188|7076->6230|7111->6248|7151->6249|7201->6270|7263->6304|7277->6308|7302->6311|7365->6346|7379->6350|7411->6360|7474->6395|7488->6399|7519->6408|7582->6443|7596->6447|7625->6454|7688->6489|7702->6493|7730->6499|7802->6543|7818->6549|7875->6584|7968->6645|8010->6658
                  LINES: 20->1|25->1|26->2|26->2|26->2|28->4|28->4|28->4|28->4|145->121|145->121|145->121|146->122|147->123|147->123|147->123|148->124|148->124|148->124|149->125|149->125|149->125|150->126|150->126|150->126|151->127|151->127|151->127|152->128|152->128|152->128|154->130|155->131
                  -- GENERATED --
              */
          
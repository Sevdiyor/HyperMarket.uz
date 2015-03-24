package controllers


import models.shirinlik
import play.api.mvc._
import play.api.db.slick.Config.driver.simple._
import play.api.db.slick._
import models._
import play.api.Logger
import scala.slick.lifted.TableQuery
/**
 * Created by hacker on 3/13/2015.
 */
class First extends  Controller{
//  def shirin = Action {
//    Ok(views.html.Shirinliklar(shirinlik.findall))
//  }
  val candies=TableQuery[Shirinlik]
  def list=DBAction{
    implicit rs=>
    Ok(views.html.Shirinliklar(candies.list))
  }
  def showAddForm=Action{
    Ok(views.html.add())
  }
  def add=new DBAction{ implicit request=>
    val formParam=request.body.asFormUrlEncoded
    val name=formParam.get("name")(0)
    val imgUrl=formParam.get("imgurl")(0)
    val narx=formParam.get("narx")(0)
    val candy_id=(candies returning candies.map(_.id)) += Shirinlik(None,name,imgUrl,narx)
    Redirect(routes.First.list())
  }

  def remove(id:Int)=DBAction{ implicit =>
  candies.filter(_.id===id).delete
  }

}

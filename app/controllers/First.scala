package controllers


import models.shirinlik
import play.api.mvc.{Action, Controller}

/**
 * Created by hacker on 3/13/2015.
 */
object First extends  Controller{
  def shirin = Action {
    Ok(views.html.Shirinliklar(shirinlik.findall))
  }
}

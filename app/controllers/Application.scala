package controllers

import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("home"))
  }

  def kafe = Action {
    Ok(views.html.Kafe())
  }


}
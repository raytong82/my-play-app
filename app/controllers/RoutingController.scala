package controllers

import javax.inject.{Inject, Singleton}

import play.api.mvc.{Action, Controller}

/**
  * Created by RayIntel on 2016/3/26.
  */
@Singleton
class RoutingController @Inject extends Controller {

  def show(id: Long) = Action { request =>
    Ok("Id is " + id)
  }

  def full(name: String) = Action { request =>
    Ok("name is " + name)
  }
  def custom(id: Long) = Action { request =>
    Ok("id is " + id)
  }
  def param(param: String) = Action { request =>
    Ok("param is " + param)
  }
  def fixed(param: String) = Action { request =>
    Ok("fixed param is " + param)
  }
  def default(param: String) = Action { request =>
    Ok("default param is " + param)
  }
  def option(param: Option[String]) = Action { request =>
    Ok("option param is " + param)
  }
}

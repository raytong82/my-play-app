package controllers

import javax.inject.{Inject, Singleton}

import akka.util.ByteString
import play.api.http.HttpEntity
import play.api.mvc.{Action, Controller, ResponseHeader, Result}

@Singleton
class HelloWorldController @Inject() extends Controller {

  def echo = Action { request =>
    Ok("Got request [" + request + "]")
  }

  def echoJson = Action(parse.json) { request =>
    Ok("Got request [" + request + "]")
  }

  def response = Action {
    Result (
      header = ResponseHeader(200, Map.empty),
      body = HttpEntity.Strict(ByteString("Hello World!"), Some("text/plain"))
    )
  }

  def redirect = Action {
    Redirect("/echo", MOVED_PERMANENTLY)
  }

  def to_do = TODO
}
package com.github.robinske

import org.scalatra._
import scalate.ScalateSupport
import org.json4s._
import org.json4s.jackson.JsonMethods._

object `package` {
  def jsonToMap(x: String): Map[String, Any] =
    fromJson(x) match {
      case Some(o) if o.isInstanceOf[Map[_, _]] => o.asInstanceOf[Map[String, Any]]
      case _ => Map.empty
    }

}



class Servlet extends WjhStack with ScalateSupport {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }
  
}

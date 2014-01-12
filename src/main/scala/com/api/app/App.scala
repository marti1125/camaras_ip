package com.api.app

import org.scalatra._
import scalate.ScalateSupport

class App extends SubeAlMetroApiStack {

	// admin
  get("/") {
    contentType="text/html"
    jade("index") // views
  } 

  // login
  get("/ingresar") {
    contentType="text/html"
    jade("index")
  }

  get("/administracion") {
    contentType="text/html"
    jade("index")
  }
  
}

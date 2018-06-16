package com.comp.job;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerResponse;

import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

public class SearchJobs extends AbstractVerticle {

	  @Override
	  public void start() {

	    Router router = Router.router(vertx);

	    router.route().handler(BodyHandler.create());
	    router.get("/getJobs").handler(this::handleGetJobs);
	    vertx.createHttpServer().requestHandler(router::accept).listen(8080);
	    
	  }

	  private void handleGetJobs(RoutingContext routingContext) {
		  HttpServerResponse response = routingContext.response();
		  
		  response.putHeader("content-type", "text").end("See All Jobs");
	  }

	  private void sendError(int statusCode, HttpServerResponse response) {
	    response.setStatusCode(statusCode).end();
	  }

}

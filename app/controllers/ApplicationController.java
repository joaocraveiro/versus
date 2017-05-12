package controllers;

import authenticators.RESTAuth;

import play.mvc.*;

import views.html.*;


public class ApplicationController extends Controller {

    public Result index() {
        System.out.println("index");
        if(session().get("email") != null) {
            return redirect("/index2");
        }
        return ok(index.render());
    }

    @Security.Authenticated(RESTAuth.class)
    public Result index2() {
        System.out.println("index2");
        return ok(index2.render());
    }

    public Result login() {
        System.out.println("login");
        session("email", "test@abc.com");
        return ok();
    }

    @Security.Authenticated(RESTAuth.class)
    public Result logout(){
        System.out.println("logout");
        session().clear();
        return ok();
    }

}

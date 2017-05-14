package controllers;

import authenticators.RESTAuth;

import modules.StartConfig;
import play.mvc.*;

import views.html.*;

import javax.inject.Inject;


public class ApplicationController extends Controller {

    StartConfig scfg;

    @Inject
    public ApplicationController(StartConfig scfg){
        this.scfg = scfg;
    }

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

    @Security.Authenticated(RESTAuth.class) // The bug is here. If logout is not authenticated works.
    public Result logout(){
        System.out.println("logout");
        session().clear();
        return ok();
    }

}

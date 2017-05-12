package authenticators;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;

import models.*;

public class RESTAuth extends Security.Authenticator {

    @Override
    public String getUsername(Context ctx) {
        return ctx.session().get("email");
    }

    @Override
    public Result onUnauthorized(Context ctx) {
        System.out.println("Unauthorized access");
        return unauthorized();
    }
    
}

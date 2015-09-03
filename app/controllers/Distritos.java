package controllers;

import models.*;
import play.*;
import play.mvc.*;
import play.libs.Json;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.JsonNode;
import views.html.*;
import play.data.*;
import static play.data.Form.*;
import play.mvc.BodyParser;
import java.util.*;
import play.db.*;
import com.avaje.ebean.*;

import play.mvc.Http.RequestBody;

public class Distritos extends Controller {

    public static Result index()
    {
    	return ok(views.html.distritos.index.render());
    }

    public static Result list()
    {
	    return ok(Distrito.list() );
    }

    public static Result show(Long id)
    {
    	Distrito distrito = Distrito.find.byId(id);
	    return distrito == null ? notFound() : ok(Json.toJson(distrito));
    }

	public static Result create()
	{
	    play.Logger.debug("REQUEST: "+request().body());
		Distrito distrito = Json.fromJson(request().body().asJson(), Distrito.class);
        distrito.save();
        return ok(Json.toJson(distrito));
	}

	public static Result update(Long id)
	{
		play.Logger.info("REQUEST: "+request().body().asJson());
		Distrito distrito = Json.fromJson(request().body().asJson(), Distrito.class);
		distrito.id = id;
	    distrito.update();
	    return ok(Json.toJson(distrito));
	}

	public static Result delete(Long id)
	{
		Distrito toDelete = Distrito.find.byId(id);
	    toDelete.delete();
	    return noContent();
	}
}
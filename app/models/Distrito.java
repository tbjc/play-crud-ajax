package models;

import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;


import play.libs.Json;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.JsonNode;


/**
 * Project entity managed by Ebean
 */
@Entity
public class Distrito extends Model {

	@Id
	public Long id;

	public String distrito;

  //FINDER FOR MODEL EBEAN
  public static Finder<Long, Distrito> find = new Finder<Long, Distrito>(Long.class, Distrito.class);

  public static JsonNode list(){
    List<Distrito> distritos = Distrito.find.all();
    play.Logger.info("Distritos List: "+distritos);
    play.Logger.info("Distritos Json: "+Json.toJson(distritos));
    return Json.toJson(distritos);
  }
}

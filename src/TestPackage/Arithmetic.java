package TestPackage;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import javax.ws.rs.PathParam;

@Path("/")

public class Arithmetic
{
  @GET
  @Path("sum/{a}/{b}")

  @Produces({"application/json"})
  public JSONObject sum(@PathParam("a") double a, @PathParam("b") double b) throws JSONException
   
  {
	    JSONObject j = new JSONObject();
    double sum = a + b;
   
    j.put("Sum",sum);
    return j;
  }
  
  @GET
  @Path("/subtraction/{a}/{b}")

  @Produces({"application/json"})
  public JSONObject subtraction(@PathParam("a") double a, @PathParam("b") double b) throws JSONException
   
  {

	    JSONObject j = new JSONObject();
  double subtraction = a - b;
  j.put("Subtraction", subtraction);
  return j;
  }
  
}
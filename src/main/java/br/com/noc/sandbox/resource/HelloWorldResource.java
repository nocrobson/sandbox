package br.com.noc.sandbox.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldResource {

    @GET
    @Path("/{nome}")
    public Response getMsg(@PathParam("nome") String nome) {
        String output = "Hello " + nome;
        return Response.status(200).entity(output).build();

    }

}
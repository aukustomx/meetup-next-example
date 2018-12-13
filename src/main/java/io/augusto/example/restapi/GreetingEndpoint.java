package io.augusto.example.restapi;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/greeting")
public class GreetingEndpoint {

    @GET
    public Response greeting() {
        return Response.ok("Greetings from Thorntail!").build();
    }
}

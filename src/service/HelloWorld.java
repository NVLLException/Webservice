package service;



import javax.jws.WebService;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@WebService
public interface HelloWorld {
    @Produces({"application/json;charset=utf-8", MediaType.APPLICATION_XML})
    @Path("/sayHello/{name}")
    public User sayHello(@PathParam("name")String name,User user);

    public String printUer(String name,User user);
}

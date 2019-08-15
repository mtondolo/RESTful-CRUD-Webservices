package RESTfulCRUDWebServices;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public String displayHello_JSON() {
		String resource = "Hello JSON";
		return resource;
	}

}

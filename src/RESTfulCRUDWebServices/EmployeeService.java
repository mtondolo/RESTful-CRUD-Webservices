package RESTfulCRUDWebServices;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employees")
public class EmployeeService {
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Employee> getAllEmployees_JSON() {
		List<Employee> listOfEmployees = EmployeeDAO.getAllEmployees();
		return listOfEmployees;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_JSON})
	public Employee addEmployee(Employee emp) {
		return EmployeeDAO.addEmployee(emp);
	}
	
	@GET
	@Path("/{empNO}")
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getEmployee(@PathParam("empNO")String empNO) {
		return EmployeeDAO.getEmployee(empNO);
	}
		
	@PUT
	@Produces({MediaType.APPLICATION_JSON})
	public Employee updateEmployee(Employee emp) {
		return EmployeeDAO.updateEmployee(emp);
	}
	
	@DELETE
	@Path("/{empNO}")
	@Produces({MediaType.APPLICATION_JSON})
	public void deleteEmployee(@PathParam("empNO")String empNO) {
		EmployeeDAO.deleteEmployee(empNO);
	}

}

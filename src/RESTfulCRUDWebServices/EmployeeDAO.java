package RESTfulCRUDWebServices;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDAO {
	
	private static final Map<String, Employee> empMap= new HashMap<String, Employee>();
	
	static {
		initEmps();
	}

	private static void initEmps() {
		Employee emp1 = new Employee("E01", "John", "Accountant");
		Employee emp2 = new Employee("E02", "Eddie", "Sales");
		Employee emp3 = new Employee("E03", "Dave", "Driver");	
	}
	
	public List<Employee> getAllEmployees(){
		Collection<Employee> c = empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		return list;
	}
	
	List<Employee>list;

}
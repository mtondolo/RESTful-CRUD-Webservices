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
	
	// Pumping-in some default data
	private static void initEmps() {
		Employee emp1 = new Employee("E01", "John", "Accountant");
		Employee emp2 = new Employee("E02", "Eddie", "Sales");
		Employee emp3 = new Employee("E03", "Dave", "Driver");	
		
		empMap.put(emp1.getEmpNO(), emp1);
		empMap.put(emp2.getEmpNO(), emp2);
		empMap.put(emp3.getEmpNO(), emp3);
		
	}
	
	public static List<Employee> getAllEmployees(){
		Collection<Employee> c = empMap.values();
		List<Employee> list = new ArrayList<Employee>();
		list.addAll(c);
		return list;
	}
	
	public static Employee addEmployee(Employee emp) {
		empMap.put(emp.getEmpNO(), emp);
		return emp;
	}
	
	List<Employee>list;

}

package java8features1.java8features1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethodEmployee {
	public static void main(String[] args) {
		  List<Employee> employeeList = new ArrayList<>();

	        // Adding Employee objects to the list
	        employeeList.add(new Employee("E001", "John", "Doe", "john.doe@example.com", "Male", "Yes", 50000, 4));
	        employeeList.add(new Employee("E002", "Jane", "Smith", "jane.smith@example.com", "Female", "No", 60000, 5));
	        employeeList.add(new Employee("E003", "Tom", "Brown", "tom.brown@example.com", "Male", "Yes", 55000, 3));
	        employeeList.add(new Employee("E004", "Lucy", "Taylor", "lucy.taylor@example.com", "Female", "No", 45000, 4));

	        // Print each employee object
	      
	        List<Employee> employeeLi= employeeList.stream().filter(n->n.getGender().equals("Male")).collect(Collectors.toList());
	      //  employeeLi.forEach(System.out::println);
	        
	        
	        
	        List<Employee> Emp = employeeList.stream().filter(n->n.getSalary()>1000).collect(Collectors.toList());
	      // Emp.forEach(System.out::println);
	        employeeList.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
	        
	        
	        
	        
	        
	        
 	}

}

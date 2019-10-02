package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
//comment and uncomment code as per the requirement
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		//vector is synchronized and provides thread safety mechanisam
//		List<Employee> employeeList = new Vector<Employee>();

		employeeList.add(new Employee("Hansraj", "Pabbati", "1234"));
		employeeList.add(new Employee("John", "Snow", "1235"));
		employeeList.add(new Employee("Michel", "Jordan", "1236"));
		employeeList.add(new Employee("Gemma", "arterton", "1237"));
		
		
		Employee test =  new Employee("Hansraj", "Pabbati", "1234");
		
		
		//Lambda Expression
//		System.out.println("Printing ArrayList with Lambda expression");
//		employeeList.forEach(x -> System.out.println(x));
		
		employeeList.set(1, new Employee("Jennifer", "Lawrence", "1238"));
		
		
//		System.out.println();
//		System.out.println("Printing ArrayList after setting 1st index");

		
//		for(int i =0 ; i < employeeList.size() ; i++)
//		{
//			System.out.println(employeeList.get(i));
//		}
			
		
		employeeList.add(2, new Employee("John", "Snow", "1235"));
//		System.out.println();
//		System.out.println("Printing ArrayList after adding 2st index");
//		employeeList.forEach(y -> System.out.println(y));

		
		// converting arraylist to array 
		Employee[] empArray=employeeList.toArray(new Employee[employeeList.size()]);
		for(int i =0 ; i < empArray.length ; i++)
		{
			System.out.println(empArray[i]);
		}
		
		
		//contains method
		System.out.println("List Contains --> " + employeeList.get(0) + " = " +employeeList.contains(test));
		System.out.println("List Contains --> " + employeeList.get(0) + " at index of " +employeeList.indexOf(test));
		
		
		//remove
		
//		employeeList.remove(1);
	}

}

//testing class for Employee
import java.io.*;
public class EmployeeTest {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[])throws Exception
	{
		System.out.println("Enter Employee ID, Employee Name and Employee Basic ");
		Employee employee=new Employee(101, "Jay", 50000);
		
		System.out.println("The Employee details are as follows:");
		
		System.out.println("Employee ID "+employee.getId());
		System.out.println("Employee Name "+employee.getName());
		System.out.println("Employee Monthly Basic "+employee.getMonthlyBasic());
		System.out.println("AnnualBasic "+employee.getAnnualBasic());
		System.out.println("Monthly Gross Salary "+employee.getMonthlyGrossSalary());
		System.out.println("Monthly Deductions "+employee.getMonthlyDeductions());
		System.out.println("Monthly Take Home "+employee.getMonthlyTakeHome());
		System.out.println("Annual Take Home "+employee.getAnnualTakeHome());
	}
}

package OOP;

public class SingleInheritence {
	String name="Lakshmi Narayana";
	String company="Techouts Slotions Pvt Ltd, Gachibowli, Hyderabad";
	float salary=30124.14*12;
	public class Employee extends SingleInheritence{
		float bonus=3000.0;
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		System.out.println("Name of the employee="+employee.name);
		System.out.println("Name of the company="+employee.company);
		System.out.println("Salary="+employee.salary);
		System.out.println("Bonus Recieved="+employee.bonus);
                                            
	}

}

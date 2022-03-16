package OOP;

 class Single4 {
	String name="Lakshmi Narayana";
	String company="Techouts Slotions Pvt Ltd, Gachibowli, Hyderabad";
	float salary=(float) (30124.14*12);


}
class Employee4 extends Single4{	
	float bonus=(float) 3000.0;}
public class Java{
	
	public static void main(String[] args)
	{
		Employee4 emp=new Employee4();
		System.out.println("Name of the employee="+emp.name);
		System.out.println("Name of the company="+emp.company);
		System.out.println("Salary="+emp.salary);
		System.out.println("Bonus Recieved="+emp.bonus);

	}
}








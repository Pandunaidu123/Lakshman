package JavaExceptionHandlingTutorial;

public class TestCustomException
{  

	// method to check the age  
	 void validate (int age) throws InvalidAgeException{    
		if(age < 18){ 
			throw new InvalidAgeException("Person is not eligible to vote");

		}
		else
		{
			System.out.println("Person is eligible to vote");

		}
	}
	public static void main(String[] args)
	{
		try
		{
			TestCustomException c =new TestCustomException();
			
			c.validate(15);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception caught");
			System.out.println("Exception Occured: "+e);
		}
		System.out.println("Rest of the code");
	}
}

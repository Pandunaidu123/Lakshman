package JavaExceptionHandlingTutorial;

    

public class CustomException
{  
  
   
    void validate (int age) throws InvalidAgeException{    
       if(age < 18){  
  
     
        throw new InvalidAgeException("age is not valid to vote");    
    }  
       else {   
        System.out.println("welcome to vote");   
        }   
     }    
  
    // main method  
    public static void main(String args[])  
    {  
        try  
        {  
          CustomException ec=new CustomException();
          
            ec.validate(13);  
        }  
        catch (InvalidAgeException ex)  
        {  
            
    
         
            System.out.println("Exception occured: \n" + "Exception is :" + ex);  
            System.out.println("We also call it as Invalid Age exception, if required..!!");  

            System.out.println("Caught the exception");  
        }  
  
        System.out.println("rest of the code...");    
    }  
}  
package JavaExceptionHandlingTutorial;

public class Excep {
	 public static void main(String[] args) {  
         
         try{    
              int a[] = {1,2,3,4,5,6,7,8,9};
              int length = a.length;
              for(int i=0;i<=length;i++)
              {
            	  System.out.println(a[i]);
              }
                  
             }    
             catch(ArithmeticException e)  
                {  
                 System.out.println("Arithmetic Exception occurs");  
                }    
             catch(ArrayIndexOutOfBoundsException e)  
                {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                 e.printStackTrace();
                }    
             catch(Exception e)  
                {  
                 System.out.println("Parent Exception occurs");  
                }             
             System.out.println("rest of the code");    
  }  
}  
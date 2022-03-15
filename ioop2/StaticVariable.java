package ioop2;

public class StaticVariable{
	   static int my_count=4;
	   public void increment(){
	      my_count++;
	   }
	   public static void main(String args[]){
	     StaticVariable obj_1=new StaticVariable();
	     StaticVariable obj_2=new StaticVariable();
	      obj_1.increment();
	      obj_2.increment();
	      System.out.println("The count of first object is "+obj_1.my_count);
	      System.out.println("The count of second object is "+obj_2.my_count);
	   }
	}
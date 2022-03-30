package JavaMethodOverloadingVsMethodOverriding;

class DataClass {
    public  String strname; 
    private int a;
    protected float b;
 

    public String getName() {
        return this.strname;
       
    }

    public int getVariable() {
        return this.a;
       
    }
    public float getVariable1() {
        return this.b;
       
    }
   
    public void setName(String name) {
        this.strname= name;
    }
    public void setVariable(int a) {
        this.a= a;
    }
    
    
    public void setVariable1(float b) {
        this.b= b;
    }
    
}
public class AccessModifiers {
    public static void main(String[] main){
        DataClass d = new DataClass();       
 
        d.setName("Java Programming");
        d.setVariable(10);
        d.setVariable1(11);
        System.out.println(d.getName());
        System.out.println(d.getVariable());
        System.out.println(d.getVariable1());
    }
}
package ioop2;

class Student{
int id=120;
int id1=121;
String name="Lakshmi Narayana";
String name1="Satya Narayana";

void display()
{
System.out.println(id+" "+name);
System.out.println(id1+" "+name1);
}
public static void main(String args[]){
Student3 s1=new Student3();
Student3 s2=new Student3();
s1.display();

}
}

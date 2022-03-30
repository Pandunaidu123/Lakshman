package JavaOOps;

class Default_constructor{
int id;
String name;

void display()
{
	System.out.println(id+" "+name);
}

public static void main(String args[])
{
	Default_constructor s1=new Default_constructor();
	Default_constructor s2=new Default_constructor();
s1.display();
s2.display();
}
}

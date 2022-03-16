package ass;

import java.util.Scanner;



public class employee {
	String name;
	int age;
	float salary;
	Scanner s;
	void add()
	{
		s= new Scanner(System.in);
		System.out.println("enter name ");
		name= s.next();//take string as input from user
		System.out.println("enter age ");
		age= s.nextInt();
		System.out.println("enter salary ");
		salary= s.nextFloat();
	}
	void display()
	{
		System.out.println(name +"\n "+ age+"\n "+salary);
	}
	public static void main(String[] args) {
	   employee e= new employee();
	   e.add();
	   e.display();
}
}

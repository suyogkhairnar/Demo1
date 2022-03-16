package ass;

import java.util.Scanner;

public class ternary {
	int marks;
	String result;
	
	void input()
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the marks");
		marks=s.nextInt();
		String result=marks>=40 ? "pass"  :"fail";
	      System.out.println(result);
		
	}

	public static void main(String[] args) {
		
	      ternary k= new ternary();
	      k.input();
	      
		

	}

}

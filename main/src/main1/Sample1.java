package main1;

import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args)
	{
		int studentID;
		String name;
		String age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ID");
		studentID=s.nextInt();
		System.out.println("Enter name");
		s.nextLine();
		name=s.nextLine();
		System.out.println("Enter age");
		age=s.next();
		if(name.equals(age))
			{
			System.out.println("equal");
		}
		
		//System.out.println("STUDENT DETAILS");
		//System.out.println("ID:"+studentID);
		//System.out.println("name:"+name);
	//	System.out.println("age:"+age);
	}
}

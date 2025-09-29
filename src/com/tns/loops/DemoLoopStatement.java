package com.tns.loops;

public class DemoLoopStatement {
	public static void main(String[] args) {
		//code for the gradeCalculator
		int marks =88;
		if (marks >=0 && marks<35)
		{
			System.out.println("Result :Fail");
		}
		else if(marks >= 35 && marks <= 65)
		{
		   System.out.println("Grade :D");	
		}
	
		else if(marks >= 65 && marks <= 80)
		{
		   System.out.println("Grade :C");	
		}
		else if(marks >= 80 && marks <= 90)
		{
		   System.out.println("Grade :B");	
		}
		else if(marks >= 90 && marks <= 100)
		{
		   System.out.println("Grade :A");	
		}
		
		else {
			System.out.println("invalid marks ");
		}
	}
}
	



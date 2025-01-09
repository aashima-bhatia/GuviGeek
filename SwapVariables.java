package java1;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        
        // get input from user
        System.out.println("Enter the first number: ");
        double num1 = myObj.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = myObj.nextDouble();
        System.out.println("Before swapping....");
        System.out.println("First number: "+ num1);
        System.out.println("Second number: "+ num2);
        
        //swap numbers using a temporary vairaable
        double temp = num1;
        num1=num2;
        num2=temp;
        System.out.println("                     ");
        System.out.println("After swapping.....");
        System.out.println("First number: "+ num1);
        System.out.println("Second number: "+ num2);
	}

}

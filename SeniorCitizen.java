package java1;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=myObj.nextInt();
        if(num>=60) {
        	System.out.println("Is a senior citizen...");
        }else
        	System.out.println("Not a senior citizen...");
	}

}

package java1;

import java.util.Scanner;

public class VariablestoreInteger2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int a = myObj.nextInt();
        
        if(a%2==0) {
        	System.out.println("Its an even number.");
        }else {
        	System.out.println("Its odd numbder.");
        }
	}

}

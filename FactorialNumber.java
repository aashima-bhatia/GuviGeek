package java1;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,fact=1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=myObj.nextInt();
        for(i=1;i<=num;i++) {
        	fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
	}

}

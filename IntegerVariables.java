package java1;

import java.util.Scanner;

public class IntegerVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int aa = myObj.nextInt();
        System.out.println("Enter the value of b : ");
        int bb = myObj.nextInt();
        System.out.println("Enter the value of c : ");
        int cc = myObj.nextInt();
        System.out.println("Enter the value of d : ");
        int dd = myObj.nextInt();
        int sum = aa + bb;
        int sum1 = cc + dd;
        if(sum>sum1) {
        	System.out.println("The sum of a and b is greater than the sum of c and d.");
        }else {
        	System.out.println("Not greater.");
        }
                
	}

}

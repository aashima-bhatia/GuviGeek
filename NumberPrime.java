package java1;

import java.util.Scanner;

public class NumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        boolean flag=false;
        
        System.out.println("Enter a number: ");
        int num = myObj.nextInt();
        
        // 0 and 1 are not prime numbers
        if(num==0||num==1) {
        	flag=true;
        }
        for(int i=2;i<=num/2;++i) {
        	// condition for nonprime number
        	if(num%i==0) {
        		flag=true;
        		break;
        	}
        }
        if(!flag) 
        	System.out.println(num + " is a prime number.");
        else
        	System.out.println(num + " is not a prime number.");
	}

}

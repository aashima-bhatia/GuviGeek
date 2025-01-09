package java1;

import java.util.Scanner;

public class CountNoofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner myObj = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = myObj.nextInt();
        int count=0;
        if(num==0) {
        	count=1;   // specail case for 0
        }else {
        	while(num>0) {
        		num /=10;
        		count++;
        	}
        }
        System.out.println("No of digits  "+count);
	}

}

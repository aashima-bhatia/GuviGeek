package java1;

import java.util.Scanner;

public class PrintCharactersAToZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ch & h are variables  // we use single quotes for chars
        for(char ch='a'; ch<='z'; ch++) {
        	System.out.print(ch + " "); // print each character followed bya a space
        }
        System.out.println("  ");
        for(char h='A'; h<='Z'; h++) {
        	System.out.print(h + " ");
        }
	}

}

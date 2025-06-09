package day1;

import java.util.Scanner;

public class Palindrome {
	public static void main(String []args) {
		System.out.println("enter a string:");
		Scanner sc=new Scanner(System.in);
		String a;
		a=sc.nextLine();
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b+=a.charAt(i);
		}
		if(a.equals(b)) {
			System.out.println("it is a palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
	}
}

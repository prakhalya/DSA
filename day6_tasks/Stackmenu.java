package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class Stackmenu {
	
	int[] mystack=new int[5];
	int top=-1;
	public void push(int data) {
		if(top==4) {
			System.out.println("stack overflow");
		}
		else {
			mystack[++top]=data;
		}
		
	}
	public void display() {
		for(int i=0;i<mystack.length;i++) {  
			System.out.println(mystack[i]);
		}
	}
	public void pop() {
		if(top==-1) {
			System.out.println("stack underflow");
		}
		else {
			int poppedValue = mystack[top];
			mystack[top] = 0;
			top--;
			System.out.println("Popped value: " + poppedValue);
		}
	}
	public static void main(String []args) {
		Stackop sc=new Stackop();
		Scanner s= new Scanner(System.in);
		int op=s.nextInt();
		System.out.println("stack menus");
		System.out.println("enter a menu");
		System.out.println("1.insert");
		System.out.println("2.pop");
		System.out.println("3.display");
		switch(op) {
		case 1:
			System.out.println("enter a number to be inserted:");
			int num=s.nextInt();
			sc.push(num);
		case 2:
			sc.pop();
		case 3:
			sc.display();
		}
		
	}
}

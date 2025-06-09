package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayop {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int[] num = new int[n];  

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        
        System.out.println(Arrays.toString(num));
        System.out.println("enter the num to be inserted:");
        int newval=sc.nextInt();
        int[] num1 = new int[n+1];
        for(int i=0;i<n;i++) {
        	num1[i]=num[i];
        }
        num1[n]=newval;
        System.out.println(Arrays.toString(num1));
        System.out.println("array deletion");
        System.out.println("enter the position to be deletd:");
        int del=sc.nextInt();
        num1[del-1]=0;
        for(int pos=del+1;pos<=n;pos++) {
        	num1[pos]=num1[pos+1];
        }
        n--;
        System.out.println(Arrays.toString(num1));
        
	}
}

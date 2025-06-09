package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Minmax {
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
       int temp=0;
       for(int i=0;i<n;i++)
	   {
		for(int j=0;j<n;j++) {
			if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
       System.out.println("maximum:"+num[0]);
       System.out.println("minimum:"+num[n-1]);
	}
}

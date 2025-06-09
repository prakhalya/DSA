package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
        int[] num = {8,4,14,3,7,2,1};

        System.out.println(Arrays.toString(num));
       int temp=0;
       for(int i=0;i<num.length;i++)
	   {
		for(int j=0;j<num.length;j++) {
			if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
       System.out.println(Arrays.toString(num));  

	}
}
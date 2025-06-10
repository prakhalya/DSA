package day1;

import java.util.Arrays;
import java.util.Scanner;

public class Duplicates {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 2, 4, 1, 5};
	        int n = arr.length; 
	        int[] temp = new int[n]; 
	        int j = 0; 
	        for (int i = 0; i < n; i++) {
	            boolean isDuplicate = false; 
	            for (int k = 0; k < j; k++) {
	                if (arr[i] == temp[k]) {
	                    isDuplicate = true; 
	                   break;
	                }
	            }
	            if (!isDuplicate) {
	                temp[j++] = arr[i]; 
	            }
	        }
	        for (int i = 0; i < j; i++) {
	            System.out.print(temp[i] + " ");
	        }
	    }
	}


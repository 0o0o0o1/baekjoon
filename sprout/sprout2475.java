package test;

import java.util.Scanner;

public class sprout2475 {

	 public static void main(String[] args) {
		 int sum = 0;
		 int[] arr = new int[5];
		 Scanner sc = new Scanner(System.in);
		 
		 for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			arr[i] *= arr[i];
		}
		 for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
		 System.out.println(sum%10);
	}
}
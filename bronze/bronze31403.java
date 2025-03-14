package bronze;

import java.util.Scanner;

public class bronze31403 {

	public static void main(String[] args) {
		int A;
		int B;
		int C;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println(A+B-C);
		if(B<10) {
			A *= 10;
		} else if(B<100) {
			A *= 100;
		} else if(B<1000) {
			A *= 1000;
		}else {
			A *= 10000;
		}
		System.out.println(A+B-C);
	}

}

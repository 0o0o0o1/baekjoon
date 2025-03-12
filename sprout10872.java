package Baekjoon;

import java.util.Scanner;

public class sprout10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println(P(N));
    }

    public static int P(int n){

        if(n <= 1){
            return 1;
        }
        return n * P(n-1);
    }

}

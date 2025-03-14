package Baekjoon;

import java.util.Scanner;

public class sprout2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long min;

        min = a- b;
        if(min<0){
            min = -min;
        }
        System.out.println(min);
    }
}

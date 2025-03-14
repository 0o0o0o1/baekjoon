package Baekjoon;

import java.util.Scanner;

public class sprout2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] charArr = str.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            if((int)charArr[i] >= 65 && (int)charArr[i] <= 90 ){
                charArr[i] = Character.toLowerCase(charArr[i]);
            } else {
                charArr[i] = Character.toUpperCase(charArr[i]);
            }
            System.out.print(charArr[i]);
        }
    }
}

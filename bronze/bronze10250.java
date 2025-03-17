package bronze;

import java.util.Iterator;
import java.util.Scanner;

public class bronze10250 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int H, W, N;

      int cnt;
      
      
      cnt = sc.nextInt();
      int[][] HWN = new int[cnt][4];
      
      for (int count = 0; count < HWN.length; count++) {
         int ho = 101;
         HWN[count][0] = sc.nextInt();
         HWN[count][1] = sc.nextInt();
         HWN[count][2] = sc.nextInt();
         
         int[][] room = new int[HWN[count][0]][HWN[count][1]];
         
         for (int i = 0; i < HWN[count][0]; i++) {
            for (int j = 0; j < HWN[count][1]; j++) {
               room[i][j] = ho;
               ho++;
            }
            ho += 100 - HWN[count][1];
         }
         int x = HWN[count][2] / HWN[count][0];
         int y = HWN[count][2] % HWN[count][0];
         if (y == 0) { 
        	    y = HWN[count][0]; // 마지막 층으로 설정
        	    x -= 1;  // 호 수를 한 칸 낮춰줌
        	}

         HWN[count][3] = room[y-1][x];
      }
      for (int i = 0; i < HWN.length; i++) {
    	  System.out.println(HWN[i][3]); 
	}


//      for (int i = H - 1; i >= 0; i--) {
//         for (int j = 0; j < W; j++) {
//            room[i][j] = ho;
//            ho++;
//            System.out.print(room[i][j] + " ");
//         }
//         ho += 100 - W;
//         System.out.println();
//      }

   }
   }

       

   
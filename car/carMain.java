package car;

import java.sql.SQLOutput;
import java.util.Scanner;

public class carMain {
    public static void main(String[] args) {
        int[][] Road = new int[5][5];
        Road[2][2] = 1;
        CarController CC = new CarController();
        Scanner sc = new Scanner(System.in);

        int act;

        CC.carTypes = "boo";
        CC.state = 1;

        while (true) {

            for (int i = 0; i < Road.length; i++) {
                for (int j = 0; j < Road[i].length; j++) {
                    if (Road[i][j] == 1) {
                        if(CC.state==1){
                            System.out.print("△ ");
                        }else if(CC.state==2){
                            System.out.print("▷ ");
                        }else if(CC.state==3){
                            System.out.print("▽ ");
                        }else if(CC.state==4){
                            System.out.print("◁ ");
                        }
                        continue;
                    }
                    System.out.print(Road[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("1. 전진\n2. 후진\n3. 좌회전\n4. 우회전");
            act = sc.nextInt();
            switch (act) {
                case 1:
                    Road = CC.forward(Road);
                    break;
                case 2:
                    Road = CC.backward(Road);
                    break;
                case 3:
                    CC.left();
                    break;
                case 4:
                    CC.right();
                    break;
                default:
                    break;
            }
        }
    }
}


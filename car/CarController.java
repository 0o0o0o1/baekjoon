package car;

public class CarController {
    String carTypes;
    int state;
    int x = 2;
    int y = 2;


    int[][] forward(int[][] road) {
        System.out.println("Current state: " + state);
        road[x][y] = 0;
        if(state == 1){
            x--;
        }else if(state == 2){
            y++;
        } else if(state == 3){
            x++;
        } else if(state == 4){
            y--;
        }
        road[x][y] = 1;
        return road;

    }
    int[][] backward(int[][] road) {
        System.out.println("Current state: " + state);
        road[x][y] = 0;
        if(state == 1){
            x++;
        }else if(state == 2){
            y--;
        } else if(state == 3){
            x--;
        } else if(state == 4){
            y++;
        }
        road[x][y] = 1;
        return road;

    }
    void left(){
        if(state == 1){
            state = 4;
            return;
        }
        state = state - 1;
    }
    void right(){
        if(state == 4){
            state = 1;
            return;
        }
        state = state + 1;
    }
}

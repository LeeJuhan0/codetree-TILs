import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int curr_x = 0 , curr_y = 0, time = 0;        
        boolean arrive = false;
        for (int i = 0 ; i < n ; i++) {
            char dir = sc.next().charAt(0);
            int disctance = sc.nextInt();
            for (int j = 0 ; j < disctance ; j++) {
                if (dir == 'N') {
                    curr_y++;
                    time++;
                }
                else if (dir == 'S') {
                    curr_y--;
                    time++;
                } 
                else if (dir == 'E') {
                    curr_x++;
                    time++;
                }
                else if (dir == 'W') {
                    curr_x--; 
                    time++;
                }
                if(curr_x == 0 && curr_y == 0) {
                    arrive = true;
                    break;
                }
            }
            if(curr_x == 0 && curr_y == 0) 
                break;        
        }
        System.out.print((arrive) ? time : "-1");
    }
}
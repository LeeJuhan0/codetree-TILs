import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int start_hour = sc.nextInt();
        int start_minute = sc.nextInt();
        int goal_hour = sc.nextInt();
        int goal_minute = sc.nextInt();
        int elapsedTime = 0;

        while (true) {
            if (start_hour == goal_hour && start_minute == goal_minute) {
                break;
            }
            start_minute++;
            elapsedTime++;
            if (start_minute == 60) {
                start_hour++;
                start_minute=0;    
            }
        }

        System.out.print(elapsedTime);

        
    }
}
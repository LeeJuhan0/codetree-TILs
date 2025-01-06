import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        double cnt = 0;
        
        
        for (int i = 1 ; i <= n ; i++ ) {
            int a = sc.nextInt();
            sum += a;
            cnt += 1;
        
        }

        System.out.printf("%d %.1f",sum , sum/cnt );
    }
}
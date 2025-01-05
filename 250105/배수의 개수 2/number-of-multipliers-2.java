import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int cnt = 0 ;

        for (int i = 10 ; i > 0 ; i --) {
            int a = sc.nextInt();
            if (a%2==1) {
                cnt += 1;
            }
        }

        System.out.print(cnt);
    }
}
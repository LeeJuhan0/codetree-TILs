import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1 ; i <= n; i++) {
            int a = sc.nextInt();
            if(a%3==0 && a%2==1) {
                sum += a;

            }
            
        }

        System.out.print(sum);

    }
}
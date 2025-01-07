import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++) {
            for (int j = i ; j > 1 ; j--) {
                System.out.print("  ");
            }

            for (int j = (n-i)*2+1 ; j > 0 ; j--) {
                System.out.print("* ");
            }
            
            System.out.println();

        }

        for (int i = 2 ; i <= n ; i++) {
            for (int j = i ; j < n ; j++) {
                System.out.print("  ");
            }

            for (int j = i*2-1 ; j > 0 ; j--) {
                System.out.print("* ");
            }
            
            System.out.println();

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = a ;

        while (a >= 1) {
            System.out.print((c-(a-1)) + " ");
            a--;
        }
    }
}
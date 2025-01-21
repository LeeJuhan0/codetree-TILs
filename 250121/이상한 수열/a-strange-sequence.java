import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(seq(n));
    }
    public static int seq(int n) {
        if (n==1) {
            return 1;
        }
        else if (n==2) {
            return 2;
        }

        return seq(n/3)+seq(n-1);
    }
}
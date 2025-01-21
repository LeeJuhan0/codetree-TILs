import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(seq(n));
    }
    public static int seq(int n) {
        if (n==1) {
            return cnt;
        }
        if (n%2==0) {
            cnt++;
            return seq(n/2);
        }
        else {
            cnt++;
            return seq(n*3+1);

        }
    }

}
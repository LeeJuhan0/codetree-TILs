import java.util.Scanner;

public class Main {
    public static int cnt = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        print(n);
    }
    public static void print(int n) {
        if (n==0) {
            System.out.println();
            return ;
        }

        System.out.print(cnt+" ");
        cnt++;
        print(n-1);
        System.out.print(cnt-n+" ");
    }
}
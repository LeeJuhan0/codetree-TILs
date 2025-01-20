import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(min(a,b,c));
    }

    public static int min (int a, int b, int c) {
        int minnum ;
        if (a < b && a < c) {
            minnum = a;
        }
        else if (b < c) {
            minnum = b ;
        }
        else {
            minnum = c ;
        }
        return minnum;
    }
}
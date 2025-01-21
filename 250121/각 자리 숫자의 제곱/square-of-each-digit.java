import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sqrt(n));
    }
    public static int sqrt (int n) {
        if (n==0) {
            return n;
        }
        
        return sqrt(n/10) + (n%10)*(n%10);
    }
}
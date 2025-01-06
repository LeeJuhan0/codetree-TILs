import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = false;
        int n = sc.nextInt();
        for (int i = 2; i<=n-1; i++) {
            if (n%i==0) {
                satisfied = true;
            }
        }

        if (satisfied) {
            System.out.print("C");
        }

        else {
            System.out.print("N");
        }
    }
}
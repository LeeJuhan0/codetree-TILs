import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean satisfied = false;

        for (int i = a; i <= b; i++) {
            if (1920 % i == 0 && 2880 % i == 0) {
                satisfied = true;
                break;
            }
            
        }

        if (satisfied) {
            System.out.print(1);
        }
        else {
            System.out.print(0);
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean satisfied = false;

        for (int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            if (a % 3 != 0) {
                satisfied = true;
                break;
            }
            
        }

        if (satisfied) {
            System.out.print("0");
        }
        else {
            System.out.print("1");
        }
    }
}
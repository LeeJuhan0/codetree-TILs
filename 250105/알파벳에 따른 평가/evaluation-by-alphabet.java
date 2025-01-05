import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        char x = a.charAt(0);
        if (x == 'S') {
            System.out.print("Superior");
        }

        else if (x == 'A') {
            System.out.print("Excellent");
        }

        else if (x == 'B') {
            System.out.print("Good");
        }

        else if (x == 'C') {
            System.out.print("Usually");
        }

        else if (x == 'D') {
            System.out.print("Effort");
        }

        else {
            System.out.print("Failure");
        }
    }
}
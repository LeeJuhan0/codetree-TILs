import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if ( a % 400 != 0) {
            if (a % 4 == 0 && a % 100 != 0)
            System.out.print("true");
            else {
                System.out.print("false");
            }
        }

        else 
        System.out.print("true");

    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int as = sc.nextInt();
        int a = sc.nextInt();

        if (as == 0 && a >= 19) {
            System.out.print("MAN");
        }

        else if (as == 0 && a < 19) {
            System.out.print("BOY");
        }

        else if (a < 19) {
            System.out.print("GIRL");
        }

        else {
            System.out.print("WOMAN");
        }

    }
}
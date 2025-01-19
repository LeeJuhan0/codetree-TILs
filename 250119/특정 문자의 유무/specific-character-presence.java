import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean ee_exist = false;
        boolean ab_exist = false;

        for (int i = 1 ; i < str.length(); i++) {
            if (str.charAt(i)=='e' && str.charAt(i-1)=='e') {
                ee_exist = true;
            }
        }

        for (int i = 1 ; i < str.length(); i++) {
            if (str.charAt(i)=='b' &&str.charAt(i-1)=='a') {
                ab_exist = true;
            }
        }

        System.out.print((ee_exist == true) ? "Yes " : "No " );
        System.out.print((ab_exist == true) ? "Yes " : "No " );
    }
}
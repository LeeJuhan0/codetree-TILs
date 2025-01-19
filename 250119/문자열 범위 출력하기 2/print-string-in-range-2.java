import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int n = sc.nextInt();
        int max;
        if (str.length() >= n) {
            max = str.length();
        }

        else {
            max = n;
        }
        for(int i = max-1; i >= max-n; i--)
            System.out.print(str.charAt(i));
    }
}
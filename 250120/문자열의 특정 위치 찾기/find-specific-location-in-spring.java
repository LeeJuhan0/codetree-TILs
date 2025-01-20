import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char Alphabet = sc.next().charAt(0);
        int idx = -1;
        boolean exist = false;

        for (int i = 0; i < str.length() ; i++) {
            if (Alphabet==str.charAt(i)) {
                idx = i;
                System.out.print(idx);
                exist = true;
                break;
            }
        }

        if (exist==false) {
            System.out.print("No");
        }
    }
}
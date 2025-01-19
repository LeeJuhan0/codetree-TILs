import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char Alphabet = sc.next().charAt(0);
        int cnt = 0;
        for (int i = 0 ; i < str.length() ; i++) {
            if(str.charAt(i) == Alphabet) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
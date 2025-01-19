import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        char Alphabet = 'a';
        int length = 0 ;
        int cnt = 0;

        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.next();
            length +=arr[i].length();
            if (arr[i].charAt(0) == Alphabet ) {
                cnt++;
            }
        }
        System.out.print(length+ " " +cnt);
    }
}
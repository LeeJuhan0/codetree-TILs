import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = "";
        String[] arr = new String[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.next();
            str += arr[i];
        }

        for(int i = 0 ; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if((i+1)%5==0) {
                System.out.println();
            }
        }
    }
}
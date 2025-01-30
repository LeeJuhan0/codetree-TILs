import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[100];
        String parentheses = sc.next();
        int cnt = 0 ;
        for(int i = 0 ; i < parentheses.length() ; i++) {
            arr[i] = parentheses.charAt(i);
        }

        for(int i = 0 ; i < parentheses.length()-3 ; i++) {
            for(int j = i+1 ; j < parentheses.length()-1 ; j++) {
                if (arr[i] == '(' && arr[i+1] == '(' && arr[j] == ')' && arr[j+1] == ')') {
                    cnt++;
                }
            }
        }

        System.out.print(cnt);
    }
}
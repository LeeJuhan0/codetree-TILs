import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next();
        char[] arr = str.toCharArray();
        arr[1] = 'a';
        arr[str.length()-2] = 'a';
        for (int i = 0 ; i <arr.length;i++) {
            System.out.print(arr[i]);
        }
    }
}
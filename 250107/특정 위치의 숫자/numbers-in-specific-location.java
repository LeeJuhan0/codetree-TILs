import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in) ;
        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0 ; i < 10 ; i++) {
            arr[i] = sc.nextInt();
        }
        sum += arr[2];
        sum += arr[4];
        sum += arr[9];
        System.out.print(sum);
    }
}
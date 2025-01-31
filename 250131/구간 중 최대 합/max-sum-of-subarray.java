import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int maxsum = 0 , cursum = 0 ;

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i <= n-k ; i++) {
            for(int j = i ; j < i+k ; j++) {
                cursum += arr[j];
            }
            maxsum = Math.max(cursum, maxsum);
            cursum = 0;
        }
        System.out.print(maxsum);
    }
}
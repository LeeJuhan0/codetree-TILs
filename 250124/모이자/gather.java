import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int min_value = 100000 ;
        for(int i = 0 ; i < n ; i++) {
            int sum = 0 ;
            for(int j = 0; j < n ; j++) {
                sum += Math.abs(arr[j]*(i-j));
            }
            if(sum <= min_value) {
                min_value = sum;
            }
        }
        System.out.println(min_value);
    }
}
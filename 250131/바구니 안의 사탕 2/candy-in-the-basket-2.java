import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100];
        
        for(int i = 0 ; i < n ; i++){
            int value = sc.nextInt();
            int idx = sc.nextInt();
            arr[idx] = value;
        }
       
        int maxsum = 0, sum = 0;
        for(int i = k ; i < 100-k ; i++){
            for(int j = i-k ; j <= i+k ; j++) {
                sum += arr[j];
            }
            maxsum = Math.max(sum, maxsum);
            sum = 0;
        }
        System.out.print(maxsum);
    }
}
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
            if(arr[idx-1] == 0) {
                arr[idx-1] = value;
            }
            else {
                arr[idx-1] += value;
            }
        }
       
        int maxsum = 0, sum = 0, cnt = 0;
        for(int i = k ; i < 100-k ; i++){
            for(int j = i-k ; j <= i+k ; j++) {
                sum += arr[j];
            }
            maxsum = Math.max(sum, maxsum);
            sum = 0;
        }
        if(k >= 50) {
            for(int i = 0 ; i < 100 ; i++) {
                maxsum += arr[i];
            }
        }
        System.out.print(maxsum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int cnt = 0, ans = 0, sum = 0;
        for(int i = 0 ; i < n ; i++) {
            for(int j = i ; j < n ; j++) {
                for(int k = i ; k <= j ; k++) {
                    sum += arr[k];
                    cnt++;
                }
                double avg = (double)sum/cnt;
                for(int k = i ; k <= j ; k++) {
                    if(avg == arr[k]) {
                        ans++;
                        break;
                    }
                }
                cnt = 0;
                sum = 0;
            }
        }
        System.out.print(ans);

    }
}
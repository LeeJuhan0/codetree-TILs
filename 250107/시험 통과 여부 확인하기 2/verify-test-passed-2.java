import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int n = sc.nextInt();
        int cnt = 0;
        for (int i = 0 ; i < n ; i++) {
            int sum=0;
            for (int j = 0 ; j < 4; j++){
            arr[j] = sc.nextInt();
            sum += arr[j];
            }
            double avg = (double)sum/4;
            if (avg >= 60) {
                cnt++;
                System.out.println("pass");
            }
            else {
                System.out.println("fail");
            }
        }
        System.out.println(cnt);
    }
}
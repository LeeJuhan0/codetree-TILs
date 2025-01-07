import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt =0 ,sum=0;
        for (int i = 0 ; i < 10 ; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                arr[i] = n;
                sum += arr[i];
            }
        }
        for (int i = 0; i < 10 ; i++){
            if (arr[i]>0) {
                cnt++;
            }
        }
        System.out.print(cnt+" "+sum);
    }
}
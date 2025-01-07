import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt = -1;
        
        for (int i = 0 ; i < 10 ; i++) {
            int n = sc.nextInt();
            if (n > 0) {
                arr[i] = n;
                cnt++;
            }

            else if (n == 0) {
                break;
            }
            
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
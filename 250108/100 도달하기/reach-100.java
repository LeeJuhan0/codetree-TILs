import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        
        for (int i = 0 ; i < 100 ; i++) {
            if (i < 2) {
                System.out.print(arr[i]+" ");
            }

            else {
                arr[i] = arr[i-1]+arr[i-2];
                System.out.print(arr[i]+ " ");
            }

            if (arr[i]>=100) {
                break;
            }

        }
    }
}
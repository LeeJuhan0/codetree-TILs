import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int val = 1;

        for(int col = n-1 ; col >= 0 ; col--) {
            if((n-col)%2==1) {
                for(int row = n-1 ; row >= 0 ; row--) {
                arr[row][col] = val;
                val++;
                }
            }
            else {
                for(int row = 0 ; row < n ; row++) {
                arr[row][col] = val;
                val++;
                }
            }
        }

        for(int row = 0 ; row < n ; row++) {
            for(int col = 0 ; col < n ; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
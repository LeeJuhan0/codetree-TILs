import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0 ; i < n ; i++) {
            arr[i][i] = 1;
        }

        for(int row = 0; row < n ; row++) {
            arr[row][0] = 1;
        }

        for(int row = 2; row < n ; row++) {
            for(int col = 1; col < n; col++) {
                arr[row][col] = arr[row-1][col-1]+arr[row-1][col];
            }
        }
        for(int row = 0; row < n ; row++) {
            for(int col = 0; col < n ; col++) {
                if(arr[row][col] != 0) {
                    System.out.print(arr[row][col]+" ");
                }
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][n+1];
        int cnt = 0;

        for (int i = 0 ; i < m ; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            cnt++;
            arr[row][col] = cnt;
        }

        for (int i = 1 ; i < n+1 ; i++) {
            for (int j = 1 ; j < n+1 ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
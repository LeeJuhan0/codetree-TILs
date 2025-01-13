import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] firstarr2d = new int[n][m];
        int[][] secondarr2d = new int[n][m];
        int[][] resultarr2d = new int[n][m];

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                firstarr2d[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                secondarr2d[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if (firstarr2d[i][j] != secondarr2d[i][j]) {
                    resultarr2d[i][j] = 1 ;
                }
                else {
                    resultarr2d[i][j] = 0;
                }
                System.out.print(resultarr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int val = 0;
        int[][] arr2d = new int[n][m];

        for(int i = 0 ; i < m ; i++) {
            if (i%2==0) {
                for(int j = 0 ; j < n ; j++) {
                    arr2d[j][i] = val;
                    val += 1;
                }
            }
            else {
                for(int j = 0 ; j < n ; j++) {
                    arr2d[n-1-j][i] = val;
                    val += 1;
                }
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 1;
        int[][] arr2d = new int[n][n];

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr2d[j][i] = val;
                val += 1;
            }
        }

        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
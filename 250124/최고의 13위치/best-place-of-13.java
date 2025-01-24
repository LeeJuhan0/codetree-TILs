import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < n; j++ ) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max_cnt = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < n-2; j++ ) {
                max_cnt = Math.max(max_cnt,arr[i][j]+arr[i][j+1]+arr[i][j+2]);
            }
        }
        System.out.print(max_cnt);
        
    }
}
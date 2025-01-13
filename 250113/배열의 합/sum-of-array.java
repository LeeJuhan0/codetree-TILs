import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            int val = 0 ;
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
                val += arr[i][j];
            }
            System.out.println(val);
        }
        
    }
}
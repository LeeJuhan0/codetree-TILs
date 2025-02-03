import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[2][n];
        for(int i = 0 ; i < n ; i++) {
            arr[0][i] = sc.nextInt();
            arr[1][i] = sc.nextInt();
        }
        int min_sqrt = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++) {
            int sqrt , max_x = 0, max_y = 0, min_x = Integer.MAX_VALUE, min_y = Integer.MAX_VALUE;
            for(int j = 0 ; j < n ; j++) {
                if(i == j){
                    continue;
                }
                max_x = Math.max(max_x, arr[0][j]);
                max_y = Math.max(max_y, arr[1][j]);
                min_x = Math.min(min_x, arr[0][j]);
                min_y = Math.min(min_y, arr[1][j]);
            }
            sqrt = (max_x-min_x)*(max_y-min_y);
            min_sqrt = Math.min(min_sqrt, sqrt);
        }
        System.out.print(min_sqrt);
    }
}
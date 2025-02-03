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
        int max_area = 0, area;
        for(int i = 0 ; i < n-2 ; i++) {
            for(int j = i+1 ; j < n-1 ; j++) {
                for(int k = j+1 ; k < n ; k++) {
                    if(((arr[0][i]-arr[0][j]) == 0 || (arr[0][i]- arr[0][k]) == 0 || (arr[0][j] - arr[0][k])==0) && (arr[1][i]-arr[1][j] == 0 || arr[1][i]- arr[1][k] == 0 || arr[1][j] - arr[1][k] == 0)) {
                        area = Math.abs((arr[0][i]*arr[1][j]+arr[0][j]*arr[1][k]+arr[0][k]*arr[1][i])-(arr[0][j]*arr[1][i]+arr[0][k]*arr[1][j]+arr[0][i]*arr[1][k]));
                        max_area = Math.max(area, max_area);
                    }
                }
            }
        }
        System.out.print(max_area);
    }
}
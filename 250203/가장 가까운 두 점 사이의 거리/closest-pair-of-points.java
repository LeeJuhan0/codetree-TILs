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
        int min_distance = Integer.MAX_VALUE,distance;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(i==j) {
                    continue;
                }
                distance = ((Math.abs(arr[0][i]-arr[0][j]))*(Math.abs(arr[0][i]-arr[0][j]))+((Math.abs(arr[1][i]-arr[1][j]))*(Math.abs(arr[1][i]-arr[1][j]))));
                min_distance = Math.min(min_distance, distance);
            }
        }
        System.out.print(min_distance);
    }
}
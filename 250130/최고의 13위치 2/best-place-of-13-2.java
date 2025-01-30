import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int curcnt = 0, maxcnt = 0;
        for(int i = 0; i < n-1 ; i++) {
            for(int j = 0; j < n-2 ; j++) {
                for(int k = i+1 ; k < n ; k++) {
                    for(int l = 0; l < n-2 ; l++) {
                        curcnt = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[k][l] +arr[k][l+1] + arr[k][l+2];
                        maxcnt = Math.max(curcnt, maxcnt);
                        curcnt = 0;
                    }
                }
            }
        }
        if(n>5) {
            for(int i = 0; i < n ; i++) {
                for(int j = 0; j < n-5 ; j++) {
                    for(int l = j+3; l < n-2 ; l++) {
                        curcnt = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i][l] +arr[i][l+1] + arr[i][l+2];
                        maxcnt = Math.max(curcnt, maxcnt);
                        curcnt = 0;   
                    }
                }
            }
        }
        System.out.print(maxcnt);
    }
}
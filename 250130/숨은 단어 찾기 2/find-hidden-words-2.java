import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String str;
        char[][] arr = new char[n][m];
        for(int i = 0 ; i < n ; i++) {
            str = sc.next();
            for(int j = 0 ; j < m ; j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        int cnt = 0 ;
        //row 3conti;
        for(int i = 0 ; i < n ; i++) { //row
            for(int j = 0; j <m-2; j++ ) { // col 
                if((arr[i][j] == 'L' && arr[i][j+1] == 'E' && arr[i][j+2] == 'E') || (arr[i][j] == 'E' && arr[i][j+1] == 'E' && arr[i][j+2] == 'L')) {
                    cnt++;
                }
            }
        }
        //col 3conti
        for(int i = 0 ; i < n-2 ; i++) { //row
            for(int j = 0; j <m; j++ ) { // col 
                if((arr[i][j] == 'L' && arr[i+1][j] == 'E' && arr[i+2][j] == 'E') || (arr[i][j] == 'E' && arr[i+1][j] == 'E' && arr[i+2][j] == 'L')) {
                    cnt++;
                }
            }
        }
        //diagonal 3conti
        for(int i = 0 ; i < n-2 ; i++) { //row
            for(int j = 0; j <m-2; j++ ) { // col 
                if((arr[i][j] == 'L' && arr[i+1][j+1] == 'E' && arr[i+2][j+2] == 'E') || (arr[i][j] == 'E' && arr[i+1][j+1] == 'E' && arr[i+2][j+2] == 'L')) {
                    cnt++;
                }
            }
        }
        //-1 diagonal 3conti
        for(int i = 2 ; i < n ; i++) { //row
            for(int j = 0; j < m-2; j++ ) { // col 
                if((arr[i][j] == 'L' && arr[i-1][j+1] == 'E' && arr[i-2][j+2] == 'E') || (arr[i][j] == 'E' && arr[i-1][j+1] == 'E' && arr[i-2][j+2] == 'L')) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
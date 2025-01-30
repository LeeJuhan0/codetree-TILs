import java.util.Scanner;

public class Main {
    public static int[][] arr = new int[19][19];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 19 ; i++) {
            for(int j = 0 ; j < 19 ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int win_num = 0, win_center_x_idx = 0, win_center_y_idx = 0 ;
        boolean flag0 = true ;
        //row 5conti;
        for(int i = 0 ; i < 19 ; i++) { //row
            for(int j = 0; j <19-4; j++ ) { // col 
                if(arr[i][j] == 1 && arr[i][j+1] == 1 && arr[i][j+2] == 1 && arr[i][j+3] == 1 && arr[i][j+4] == 1) {
                    win_num = 1;
                    win_center_x_idx = j+2+1 ;
                    win_center_y_idx = i+1 ;
                    flag0 = false;
                }
                else if(arr[i][j] == 2 && arr[i][j+1] == 2 && arr[i][j+2] == 2 && arr[i][j+3] == 2 && arr[i][j+4] == 2) {
                    win_num = 2;
                    win_center_x_idx = j+2+1 ;
                    win_center_y_idx = i+1 ;
                    flag0 = false;
                }
            }
        }
        //col 5conti
        for(int i = 0 ; i < 19-4 ; i++) { //row
            for(int j = 0; j <19; j++ ) { // col 
                if(arr[i][j] == 1 && arr[i+1][j] == 1 && arr[i+2][j] == 1 && arr[i+3][j] == 1 && arr[i+4][j] == 1) {
                    win_num = 1;
                    win_center_x_idx = j+1 ;
                    win_center_y_idx = i+2+1 ;
                    flag0 = false;
                }
                else if(arr[i][j] == 2 && arr[i+1][j] == 2 && arr[i+2][j] == 2 && arr[i+3][j] == 2 && arr[i+4][j] == 2) {
                    win_num = 2;
                    win_center_x_idx = j+1 ;
                    win_center_y_idx = i+2+1 ;
                    flag0 = false;
                }
            }
        }
        //diagonal 5conti
        for(int i = 0 ; i < 19-4 ; i++) { //row
            for(int j = 0; j <19-4; j++ ) { // col 
                if(arr[i][j] == 1 && arr[i+1][j+1] == 1 && arr[i+2][j+2] == 1 && arr[i+3][j+3] == 1 && arr[i+4][j+4] == 1) {
                    win_num = 1;
                    win_center_x_idx = j+2+1 ;
                    win_center_y_idx = i+2+1 ;
                    flag0 = false;
                }
                else if(arr[i][j] == 2 && arr[i+1][j+1] == 2 && arr[i+2][j+2] == 2 && arr[i+3][j+3] == 2 && arr[i+4][j+4] == 2) {
                    win_num = 2;
                    win_center_x_idx = j+2+1 ;
                    win_center_y_idx = i+2+1 ;
                    flag0 = false;
                }
            }
        }
        System.out.println((flag0) ? 0 : win_num);
        System.out.print(win_center_y_idx + " " + win_center_x_idx);
    }
}
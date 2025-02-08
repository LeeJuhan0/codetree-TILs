import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] arr2d = new int[11][11];
        int cnt = 0;
        boolean line_3 = false;
        for(int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            arr2d[y[i]][x[i]] = 1;
        }
        for(int i = 0 ; i < 11-2 ; i++) { // xxx
            for(int k = i+1 ; k < 11-1; k++) {
                for(int l = k+1 ; l < 11; l++) {
                    int[][] clone_arr2d = new int[11][11];
                    for (int row = 0; row < 11; row++) {
                        clone_arr2d[row] = arr2d[row].clone();
                    }
                    for(int j = 0 ; j < 11 ; j++) {
                        clone_arr2d[i][j] = 1;
                        clone_arr2d[k][j] = 1;
                        clone_arr2d[l][j] = 1;
                    }
                    cnt = 0;
                    for(int j = 0 ; j < 11; j++) {
                        for(int m = 0 ; m < 11 ; m++) {
                            if(clone_arr2d[j][m] == 1) {
                                cnt++;
                            }                         
                        }
                    }
                    
                    if(cnt == 33) {
                        line_3 = true;
                    }
                }
            }
        }
        for(int i = 0 ; i < 11-2 ; i++) { // yyy
            for(int k = i+1 ; k < 11-1; k++) {
                for(int l = k+1 ; l < 11; l++) {
                    int[][] clone_arr2d = new int[11][11];
                    for (int row = 0; row < 11; row++) {
                        clone_arr2d[row] = arr2d[row].clone();
                    }
                    for(int j = 0 ; j < 11 ; j++) {
                        clone_arr2d[j][i] = 1;
                        clone_arr2d[j][k] = 1;
                        clone_arr2d[j][l] = 1;
                    }
                    cnt = 0;
                    for(int j = 0 ; j < 11; j++) {
                        for(int m = 0 ; m < 11 ; m++) {
                            if(clone_arr2d[j][m] == 1) {
                                cnt++;
                            }                        
                        }
                    }               
                    if(cnt == 33) {
                        line_3 = true;
                    }
                }
            }
        }
        for(int i = 0 ; i < 11-1 ; i++) { // xxy
            for(int k = i+1 ; k < 11; k++) {
                for(int l = 0 ; l < 11; l++) {
                    int[][] clone_arr2d = new int[11][11];
                    for (int row = 0; row < 11; row++) {
                        clone_arr2d[row] = arr2d[row].clone();
                    }
                    for(int j = 0 ; j < 11 ; j++) {
                        clone_arr2d[i][j] = 1;
                        clone_arr2d[k][j] = 1;
                        clone_arr2d[j][l] = 1;
                    }
                    cnt = 0;
                    for(int j = 0 ; j < 11; j++) {
                        for(int m = 0 ; m < 11 ; m++) {
                            if(clone_arr2d[j][m] == 1) {
                                cnt++;
                            }                        
                        }
                    }
                    if(cnt == 31) {
                        line_3 = true;
                    }
                }
            }
        }
        for(int i = 0 ; i < 11-1 ; i++) { // xyy
            for(int k = i+1 ; k < 11; k++) {
                for(int l = 0 ; l < 11; l++) {
                    int[][] clone_arr2d = new int[11][11];
                    for (int row = 0; row < 11; row++) {
                        clone_arr2d[row] = arr2d[row].clone();
                    }
                    for(int j = 0 ; j < 11 ; j++) {
                        clone_arr2d[l][j] = 1;
                        clone_arr2d[j][i] = 1;
                        clone_arr2d[j][k] = 1;
                    }
                    cnt = 0;
                    for(int j = 0 ; j < 11; j++) {
                        for(int m = 0 ; m < 11 ; m++) {
                            if(clone_arr2d[j][m] == 1) {
                                cnt++;
                            }                                               
                        }
                    }                  
                    if(cnt == 31) {
                        line_3 = true;
                    }
                }
            }
        }

        System.out.print((line_3) ? "1": "0");
    }
}
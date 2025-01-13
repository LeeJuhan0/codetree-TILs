import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] firstarr2d = new int[3][3];
        int[][] secondarr2d = new int[3][3];
        int[][] resultarr2d = new int[3][3];

        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                firstarr2d[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                secondarr2d[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < 3 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                resultarr2d[i][j] = firstarr2d[i][j]*secondarr2d[i][j];
                System.out.print(resultarr2d[i][j]+" ");
            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];

        for(int col = 0 ; col < 5 ; col++) {
            arr[0][col] = 1;
        }

        for(int row = 0; row < 5 ; row++) {
            arr[row][0] = 1;
        }

        for(int row = 1; row < 5 ; row++) {
            for(int col = 1; col < 5; col++) {
                arr[row][col] = arr[row-1][col]+arr[row][col-1];
            }
        }
        for(int row = 0; row < 5 ; row++) {
            for(int col = 0; col < 5 ; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
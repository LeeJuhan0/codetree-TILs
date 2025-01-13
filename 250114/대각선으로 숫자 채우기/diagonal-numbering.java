import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 1;

        int[][] arr = new int[100][100];

        for(int startCol = 0; startCol < m ; startCol++) {
            int currRow = 0 ;
            int currCol = startCol;

            while(currCol >= 0 && currRow < n) {
                arr[currRow][currCol] = count;

                currRow++;
                currCol--;
                count++;
            }
        }

        for(int startRow = 1; startRow < n ; startRow++) {
            int currCol = m-1;
            int currRow = startRow;

            while(currRow < n && currCol >= 0) {
                arr[currRow][currCol] = count;

                currRow++;
                currCol--;
                count++;
            }
        }

        for(int i = 0; i < n ; i++) {
            for(int j = 0; j < m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
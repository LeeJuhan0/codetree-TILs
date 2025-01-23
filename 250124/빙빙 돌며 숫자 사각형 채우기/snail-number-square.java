import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n+1][m+1];
        char[] dir = new char[]{'E','S','W','N'};
        int x = 0, y = 0, y_right_wall = m, y_left_wall = -1, x_ceiling = n, x_floor = -1, num = 0, value = 1;
        arr[0][0] = value;
        
        while(true) {
            if (num == dir.length) {
                num = 0;
            }

            if (dir[num] == 'E') {
                y++;
            } 
            else if (dir[num] == 'W') {
                y--;
            }
            else if (dir[num] == 'S') {
                x++;
            }
            else {
                x--;
            }

            if (y == y_right_wall) {
                y--;
                num++;
                x++;
                x_floor++;
            }
            if (y == y_left_wall) {
                y++;
                num++;
                x--;
                x_ceiling--;
            }

            if (x == x_ceiling) {
                x--;
                num++;
                y--;
                y_right_wall--;
            }   
            if (x == x_floor) {
                x++;
                num++;
                y++;
                y_left_wall++;
            }
            
            value++;
            arr[x][y] = value;

            if (n*m <= value) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
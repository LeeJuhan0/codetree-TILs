import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][3];
        for(int i = 0 ; i < 5 ; i++) {
            for(int j = 0 ; j < 3 ; j++) {
                arr[i][j] = sc.next().toUpperCase().charAt(0);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
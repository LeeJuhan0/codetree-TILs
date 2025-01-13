import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] arr2d = new double[2][4];
        double totalsum = 0;
        for(int i = 0 ; i < 2 ;i++) {
            double rowsum = 0;
            for(int j = 0 ; j < 4 ; j++) {
                arr2d[i][j] = sc.nextDouble();
                rowsum += arr2d[i][j];
            }
            System.out.printf("%.1f ",rowsum/4);
        }
        System.out.println();
        for(int i = 0 ; i < 4 ;i++) {
            double colsum = 0;
            for(int j = 0 ; j < 2 ; j++) {
                colsum += arr2d[j][i];
            }
            System.out.printf("%.1f ",colsum/2);
        }
        System.out.println();
        for(int i = 0 ; i < 2 ;i++) {
            for(int j = 0 ; j < 4 ; j++) {
                totalsum += arr2d[i][j];
            } 
        }
        System.out.printf("%.1f ",totalsum/8);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[100];
        
        for (int i = 0 ; i < 100 ; i++) {
            int n = sc.nextInt();
            if (n==0) {
                break;
            }
            else {
                arr[i] = n;
                if (arr[i]%2==0) {
                    arr[i] = arr[i]/2;
                    System.out.print(arr[i] + " ");
                }
                else {
                    arr[i] = arr[i]+3;
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
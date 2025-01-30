import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int maxvalue = 0, curvalue = 0;
        for(int i = 0 ; i < n-2 ; i++) {
            for(int j = i+2 ; j < n ; j++) {
                curvalue = arr[i]+arr[j];
                maxvalue = Math.max(curvalue, maxvalue);
            }
        }
        System.out.print(maxvalue);
    }
}
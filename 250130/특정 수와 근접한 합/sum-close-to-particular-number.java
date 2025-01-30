import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int cur_value = 0 ;
        int min_value = Integer.MAX_VALUE;
        for(int i = 0 ; i < n-1 ; i++) {
            for(int j = i+1 ; j < n ; j++) {
                for(int k = 0 ; k < n ; k++) {
                    if(k != i && k != j){
                        cur_value += arr[k];
                    }
                }
                min_value = Math.min(Math.abs(s-cur_value), min_value);
                cur_value = 0;
            }
        }
        System.out.print(min_value);
    }
}
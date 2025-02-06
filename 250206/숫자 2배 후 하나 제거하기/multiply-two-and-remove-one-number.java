import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        int min_sum = Integer.MAX_VALUE ;
        for(int i = 0 ; i < n ; i++) {
            int[] clone_arr = arr.clone();
            clone_arr[i] *= 2;
            for(int j = 0 ; j < n ;j++) {
                int[] reduce = new int[n-1];
                int cnt = 0;
                for(int k = 0; k < n ; k++) {
                    if(j == k)
                        continue;
                    reduce[cnt++] = clone_arr[k];
                }
                int sum = 0 ;
                for(int k = 0; k < n-2; k++) {
                    sum += Math.abs(reduce[k]-reduce[k+1]);
                }
                min_sum = Math.min(min_sum, sum);
            }
        }
        System.out.print(min_sum);
    }
}
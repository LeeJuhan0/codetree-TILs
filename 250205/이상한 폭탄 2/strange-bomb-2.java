import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[200];
        int max_num = -1, cur_num = 0;

        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = i+1 ; j < i+k+1 ; j++) {
                if(arr[i] == arr[j]) {
                    cur_num = arr[i];
                    max_num = Math.max(max_num, cur_num);
                }
            }
        }
        System.out.print(max_num);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < k ; i++) {
            int start_index = sc.nextInt();
            int end_index = sc.nextInt();
            for (int j = start_index-1 ; j < end_index ; j++) {
                arr[j]++;
            }
        }
        
        int max_value = 0;

        for (int i = 0; i < n; i++) {
            if (max_value <= arr[i]) {
                max_value = arr[i];
            }
        }
        System.out.print(max_value);

    }
}
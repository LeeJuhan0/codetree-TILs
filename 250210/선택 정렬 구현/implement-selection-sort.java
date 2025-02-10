import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0 ; i < n ; i++) {
            int min = 100, idx = i;
            for(int j = i ; j < n ; j++) {
                if(arr[j] < min){
                    min = arr[j];
                    idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = min;
            arr[idx] = temp;
        }
        for(int i = 0 ; i < n ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
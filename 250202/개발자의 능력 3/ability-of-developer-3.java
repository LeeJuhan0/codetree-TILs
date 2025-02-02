import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0 ; i < 6 ; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0 ; i < 6-2 ; i++) {
            for (int j = i+1 ; j < 6-1 ; j++) {
                for (int k = j+1 ; k < 6 ; k++) {
                    int abcsum = 0;
                    int defsum = 0;
                    for(int l = 0; l < 6; l++) {
                        if (l != i && l != j && l != k) {
                            defsum += arr[l];
                        }
                    }
                    abcsum = arr[i] + arr[j] + arr[k];
                    min = Math.min(min, Math.abs(abcsum-defsum));    
                }
            }
        }
        System.out.print(min);
    }
}
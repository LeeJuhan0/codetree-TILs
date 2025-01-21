import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        boolean same = true;
        for (int i = 0 ; i < n ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0 ; i < n ; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);
        Arrays.sort(arr1);
        for (int i = 0 ; i < n ; i++) {
            if (arr1[i] != arr2[i]) {
                same = false;
                break;
            }
        }
        System.out.print((same) ? "Yes" : "No");
    }
}
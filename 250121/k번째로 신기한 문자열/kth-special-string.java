import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean same = true;
        int cnt = 0;
        String[] same_arr = new String[n];
        String str = sc.next();
        String[] arr = new String[n];
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.next();
            for (int j = 0 ; j < str.length() ; j++) {
                if (arr[i].charAt(j) != str.charAt(j)) {
                    same = false;
                }
            }
            if (same) {
                same_arr[cnt] = arr[i];
                cnt++;
            }
            same = true;
        }
        same_arr = Arrays.copyOfRange(same_arr, 0, cnt);
        Arrays.sort(same_arr);
        System.out.print(same_arr[k-1]);
    }
}
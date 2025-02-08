import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        String str = sc.next();
        for(int i = 0 ; i < n ; i++) {
            arr[i] = str.charAt(i);
        }
        int cnt_1 = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++) {
            char[] arrclone = arr.clone();
            int min_distance = Integer.MAX_VALUE;
            if(arrclone[i] == '0') {
                arrclone[i] = '1';
            }
            else if(arrclone[i] == '1') {
                continue;
            }        
            for(int j = 0 ; j < n-1 ; j++) {
                for(int k = j+1 ; k < n ; k++) {
                    if(arrclone[j] == '1' && arrclone[k] == '1') {
                        int distance = k - j;
                        j = k;
                        min_distance = Math.min(distance, min_distance);
                    }
                } 
            }
            ans = Math.max(min_distance, ans);
        }
        System.out.print(ans);
    }
}
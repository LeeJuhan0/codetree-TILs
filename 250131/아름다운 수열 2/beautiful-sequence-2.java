import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[m];
        for(int i = 0 ; i < n ; i++){
            arrA[i] = sc.nextInt();
        }
        for(int i = 0 ; i < m ; i++){
            arrB[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0 ; i <= n-m ; i++){
            int[] arr_B = arrB.clone();
            int cnt = 0;
            for(int j = i ; j < i+m ; j++){
               for(int k = 0 ; k < m ; k++){
                    if(arr_B[k] == arrA[j]){
                        arr_B[k] = -1;
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt == m){
                ans++;
            }
        }
        System.out.print(ans);
    }
}
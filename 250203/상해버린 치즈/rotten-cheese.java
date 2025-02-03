import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n명
        int m = sc.nextInt(); //먹은 치즈의 개수
        int d = sc.nextInt(); //먹은 기록
        int s = sc.nextInt(); //아픈 기록
        int[][] d_arr = new int[d][3];
        int[][] s_arr = new int[s][2];
        for(int i = 0 ; i < d ; i++) {
            d_arr[i][0] = sc.nextInt(); // 사람번호
            d_arr[i][1] = sc.nextInt(); // 치즈번호
            d_arr[i][2] = sc.nextInt(); // 시간
        }
        for(int i = 0 ; i < s ; i++) {
            s_arr[i][0] = sc.nextInt(); // 아픈사람번호
            s_arr[i][1] = sc.nextInt(); // 배아픔발생시간
        }
        int[] havepillnum = new int[n+1];
        int[] spoiled_cheese_num = new int[m+1];
        for(int i = 0 ; i < d ; i++) {
            for(int j = 0 ; j < s ; j++) {
                if(d_arr[i][0] == s_arr[j][0] && d_arr[i][2] <= s_arr[j][1] - 1) {
                    spoiled_cheese_num[d_arr[i][1]]++;
                }                
            }
        }
        for(int i = 1 ; i < m ; i++) {
            if(spoiled_cheese_num[i] != 0) {
                for(int j = 0 ; j < d ; j++) {
                    if(d_arr[j][1] == i) {
                        havepillnum[d_arr[j][0]]++;
                    } 
                }
            }
        }
        int ans = 0 ;
        for(int i = 1 ; i < n+1 ; i++) {
            if(havepillnum[i] != 0){
                ans++;
            }
        }
        System.out.print(ans);
    }
}
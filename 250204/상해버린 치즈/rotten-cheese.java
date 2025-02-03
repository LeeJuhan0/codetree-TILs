import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //n명
        int m = sc.nextInt(); //치즈의 개수
        int d = sc.nextInt(); //먹은 기록
        int s = sc.nextInt(); //아픈 기록
        int[][] d_arr = new int[d][3];
        int[][] s_arr = new int[s][2];
        for(int i = 0 ; i < d ; i++) {
            d_arr[i][0] = sc.nextInt(); // 먹은사람번호
            d_arr[i][1] = sc.nextInt(); // 먹은치즈번호
            d_arr[i][2] = sc.nextInt(); // 먹은시간
        }
        for(int i = 0 ; i < s ; i++) {
            s_arr[i][0] = sc.nextInt(); // 아픈사람번호
            s_arr[i][1] = sc.nextInt(); // 배아픔발생시간
        }
        int[] havepillnum = new int[n+1]; 
        int[] spoiled_cheese_num = new int[m+1];
        for(int i = 0 ; i < d ; i++) {  //상했을 확률이 있는 치즈찾기
            for(int j = 0 ; j < s ; j++) {
                if(d_arr[i][0] == s_arr[j][0] && d_arr[i][2] <= s_arr[j][1] - 1) {
                    spoiled_cheese_num[d_arr[i][1]]=1;
                }                
            }
        }

        for(int i = 0 ; i < s ; i++) { //아픈사람이 아픈 이후 먹은 치즈제외
            for(int j = 0 ; j < d ; j++) {
                if(d_arr[j][0] == s_arr[i][0] && d_arr[j][2] >= s_arr[i][1]) {
                    spoiled_cheese_num[d_arr[j][1]]=0;
                    for(int k = 0 ; k < d ; k++) {
                        if(d_arr[k][1] == d_arr[j][1] && d_arr[k][2] <= s_arr[i][1] - 1) { //이전에 먹은 치즈는 상한상태 유지
                            spoiled_cheese_num[d_arr[k][1]]=1;
                        }
                    } 
                }
            }
        }
    
        
        int[] arr = new int[m+1];
        for(int i = 0 ; i < s ; i++) { //아픈사람이 안먹은 치즈제외
            for(int j = 0 ; j < d ; j++) {
                if(d_arr[j][0] == s_arr[i][0]) { 
                    arr[d_arr[j][1]]++;
                }
            }
        }

        for(int i = 1 ; i < m+1 ; i++) {
            if(arr[i] < s) {
                spoiled_cheese_num[i] = 0;
            }
        }

        int ans = 0, max_ans =0;
        for(int i = 1 ; i < m+1 ; i++) {
            if(spoiled_cheese_num[i] == 1) {
                for(int j = 0 ; j < d ; j++) {
                    if (d_arr[j][1] == i) {
                        havepillnum[d_arr[j][0]]++;
                    }
                }
                for(int k = 1 ; k < n+1 ; k++) {
                    if(havepillnum[k] != 0) {
                    ans++;
                    }     
                    havepillnum[k] = 0 ;
                }
            }
            max_ans = Math.max(ans,max_ans);
            ans = 0;
        }
        System.out.print(max_ans);
    }
}
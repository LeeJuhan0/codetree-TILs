import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of people
        int m = sc.nextInt(); // Number of cheese types
        int d = sc.nextInt(); // Eating records
        int s = sc.nextInt(); // Sickness records
        
        int[][] d_arr = new int[d][3]; // Eating records array
        int[][] s_arr = new int[s][2]; // Sickness records array
        
        // Reading eating records
        for (int i = 0; i < d; i++) {
            d_arr[i][0] = sc.nextInt(); // Person number
            d_arr[i][1] = sc.nextInt(); // Cheese number
            d_arr[i][2] = sc.nextInt(); // Eating time
        }
        
        // Reading sickness records
        for (int i = 0; i < s; i++) {
            s_arr[i][0] = sc.nextInt(); // Sick person number
            s_arr[i][1] = sc.nextInt(); // Time of sickness
        }
        
        int[] havepillnum = new int[n + 1];
        int[] spoiled_cheese_num = new int[m + 1];
        
        // Identify potentially spoiled cheese
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < s; j++) {
                if (d_arr[i][0] == s_arr[j][0] && d_arr[i][2] <= s_arr[j][1] - 1) {
                    spoiled_cheese_num[d_arr[i][1]] = 1;
                }
            }
        }
        
        // Refine spoiled cheese identification by excluding cheese eaten only after sickness
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < d; j++) {
                if (d_arr[j][0] == s_arr[i][0] && d_arr[j][2] >= s_arr[i][1]) {
                    boolean ateBeforeSick = false;
                    for (int k = 0; k < d; k++) {
                        if (d_arr[k][0] == s_arr[i][0] && d_arr[k][1] == d_arr[j][1] && d_arr[k][2] < s_arr[i][1]) {
                            ateBeforeSick = true;
                            break;
                        }
                    }
                    if (!ateBeforeSick) {
                        spoiled_cheese_num[d_arr[j][1]] = 0;
                    }
                }
            }
        }
        
        int[] arr = new int[m + 1];
        
        // Count cheese eaten by sick people
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < d; j++) {
                if (d_arr[j][0] == s_arr[i][0]) {
                    arr[d_arr[j][1]]++;
                }
            }
        }
        
        // Exclude cheese not eaten by all sick people
        for (int i = 1; i <= m; i++) {
            if (arr[i] < s) {
                spoiled_cheese_num[i] = 0;
            }
        }
        
        int ans = 0, max_ans = 0;
        
        // Count people who ate spoiled cheese
        for (int i = 1; i <= m; i++) {
            if (spoiled_cheese_num[i] == 1) {
                for (int j = 0; j < d; j++) {
                    if (d_arr[j][1] == i) {
                        havepillnum[d_arr[j][0]]++;
                    }
                }
                for (int k = 1; k <= n; k++) {
                    if (havepillnum[k] != 0) {
                        ans++;
                    }
                    havepillnum[k] = 0;
                }
                max_ans = Math.max(ans, max_ans);
                ans = 0;
            }
        }
        
        System.out.print(max_ans);
    }
}
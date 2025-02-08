import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0 ; i < n ; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int min_value = Integer.MAX_VALUE;
        for(int i = 0 ; i < 100 ; i += 2) { //가로선
            for(int j = 0 ; j < 100 ; j += 2) { //세로선
                int cnt_1 = 0 , cnt_2 = 0 , cnt_3 = 0 , cnt_4 = 0;
                for(int k = 0 ; k < n ; k++) {
                    if(x[k] < j && y[k] < i) {
                        cnt_3++;
                    }
                    else if(x[k] > j && y[k] < i) {
                        cnt_4++;
                    }
                    else if(x[k] < j && y[k] > i) {
                        cnt_2++;
                    }
                    else if(x[k] > j && y[k] > i) {
                        cnt_1++;
                    }
                }
                int max_cnt_num = 0;
                max_cnt_num = Math.max(cnt_1, Math.max(cnt_2, Math.max(cnt_3, cnt_4)));
                min_value = Math.min(min_value, max_cnt_num);
            }
        }
        System.out.print(min_value);
    }
}
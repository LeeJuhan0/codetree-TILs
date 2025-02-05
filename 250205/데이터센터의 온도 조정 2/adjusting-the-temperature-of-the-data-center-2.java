import java.util.Scanner;

public class Main {
    public static int c, g, h, ta , tb;
    public static int work(int tem ,int a, int b) {
        if (tem < a) {
            return c;
        }
        else if (a <= tem && tem <= b) {
            return g;
        }
        else if (b < tem) {
            return h;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        c = sc.nextInt();
        g = sc.nextInt();
        h = sc.nextInt();
        int max_sum = 0 , sum;
        int[] ta_arr = new int[n];
        int[] tb_arr = new int[n];
        for(int j = 0 ; j < n ; j++) {
                ta_arr[j] = sc.nextInt();
                tb_arr[j] = sc.nextInt();
        }

        for(int i = 1 ; i <= 1000 ; i++ ) {
            sum = 0;
            for(int j = 0 ; j < n ; j++) {
                ta = ta_arr[j];
                tb = tb_arr[j];
                sum += work(i, ta, tb);
            }
            max_sum = Math.max(max_sum, sum);
        }
        System.out.print(max_sum);
    }
}
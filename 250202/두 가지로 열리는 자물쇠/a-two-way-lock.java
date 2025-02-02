import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int cnt = 0;
        for(int i = 1 ; i <= n ; i++) {
            for(int j = 1 ; j <= n ; j++) {
                for(int k = 1; k <= n ; k++) {
                    if(((Math.abs(a-i) <= 2 || Math.abs(a+n-i) <= 2) && (Math.abs(b-j) <= 2 || Math.abs(b+n-j) <= 2) && (Math.abs(c-k) <= 2 || Math.abs(c+n-k) <= 2 )) || ((Math.abs(d-i) <= 2 || Math.abs(d+n-i) <= 2)&& (Math.abs(e-j) <= 2 || Math.abs(e+n-j) <= 2) && (Math.abs(f-k) <= 2 || Math.abs(f+n-k) <= 2  ))) {
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}
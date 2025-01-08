import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] cntarr = new int[10]; 
        int sum=0;

        while(a/b>0) {
            cntarr[a % b]++;
            a /= b;
        }

        for (int i = 1 ; i < 10 ; i++) {
            int sqrt = 1;
            for (int j = cntarr[i] ; j>0 ; j--) {
                sqrt *= i;
                sum += sqrt;
            }
        }
        System.out.print(sum);
    }
}
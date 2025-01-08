import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] cntarr = new int[10]; 
        int sum=0;

        while (a>1) {
            cntarr[a % b]++;
            a =  a/b;
        }

        for (int i = 0 ; i < 10 ; i++) {
            if (cntarr[i] > 0) {
                sum += cntarr[i]*cntarr[i];
            } 

        }
        System.out.print(sum);
    }
}
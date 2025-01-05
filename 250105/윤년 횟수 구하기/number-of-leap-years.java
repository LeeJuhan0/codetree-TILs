import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, cnt=0;
        a = sc.nextInt();

        for (int i =1 ; i <= a; i++) {
            if (i % 4 == 0) {
                cnt += 1;
                if(i % 100 == 0 && i%400 != 0) {
                    cnt -= 1;
                }

            }
        }

        System.out.print(cnt);
    }
}
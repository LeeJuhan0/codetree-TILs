import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int a = sc.nextInt();
        while (true) {
            if (a==1) {
                break;
            }
            
            if (a % 2 == 0) {
                a /= 2;
                cnt += 1;
            }

            else {
                a *= 3;
                a++;
                cnt += 1;
            }
   
        }
        System.out.print(cnt);
    }
}
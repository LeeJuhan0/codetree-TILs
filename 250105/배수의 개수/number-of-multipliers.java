import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0, cnt3 = 0, cnt5 = 0;


        while (a<10) {
            a++;
            b = sc.nextInt();

            if (b%3 == 0) {
                cnt3 += 1;
            }

            if (b % 5 == 0){
                cnt5 += 1;
            }
        }

        System.out.print(cnt3 +" "+ cnt5);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        double sum2 = 0;

        for (int i = a ; i <= b; i++) {
            if (i%5==0 || i%7==0) {
                sum += i;
                sum2 += 1;

            }
            
        }

        System.out.print(sum+" ");
        System.out.printf("%.1f",sum/sum2);


    }
}
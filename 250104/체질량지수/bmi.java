import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        int b = (10000*w)/(h*h) ;

        if (b>=25) {
            System.out.print(b + "\n" + "Obesity");
        }

        if (b<25) {
            System.out.print(b);
        }

    }
}
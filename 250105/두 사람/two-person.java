import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char as = sc.next().charAt(0);

        int b = sc.nextInt();
        char bs = sc.next().charAt(0);

        System.out.print(((a >= 19 && as == 'M')||(b >= 19 && bs =='M')) ? 1 : 0);
    }
}
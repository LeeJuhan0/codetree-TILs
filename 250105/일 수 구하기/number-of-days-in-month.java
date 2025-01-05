import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a == 1 || a ==3 || a== 5 || a == 7 || a==8 || a==10 || a==11) {
            System.out.print(31);
        }

        else if (a != 2) {
            System.out.print(30);
        }
        
        else {
            System.out.print(28);
        }

    }
}
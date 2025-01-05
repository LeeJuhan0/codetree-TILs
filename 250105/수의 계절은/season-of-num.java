import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a >=3 && a < 6) {
            System.out.print("Spring");
        }
        else if (a >=6 && a <9) {
            System.out.print("Summer");
        }
        else if (a >=9 && a < 12) {
            System.out.print("Fall");
        }
        else {
            System.out.print("Winter");
        }

        
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aMath = sc.nextInt();
        int aEng = sc.nextInt();
        int bMath = sc.nextInt();
        int bEng = sc.nextInt();

        if (aMath > bMath) {
            System.out.print("A");
        }
        
        else if (bMath > aMath) {
            System.out.print("B");
        }

        else if (bEng > aEng) {
            System.out.print("B");
        }

        else {
            System.out.print("A");
        }

        
    }
}
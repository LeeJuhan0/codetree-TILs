import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char aS = sc.next().charAt(0);
        int a = sc.nextInt(); 
        char bS = sc.next().charAt(0);
        int b = sc.nextInt(); 
        char cS = sc.next().charAt(0);
        int c = sc.nextInt();  
        int Acount = 0;

        if (aS == 'Y' && a >= 37) {
            Acount += 1;
        }

        if (bS == 'Y' && b >= 37) {
            Acount += 1;
        }

        if (cS == 'Y' && c >= 37) {
            Acount += 1;
        }

        if (Acount >=2) {
            System.out.print("E");
        }

        else {
            System.out.print("N");
        }



    }
}
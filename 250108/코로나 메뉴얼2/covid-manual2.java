import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] ABCarr = new int[4];

        for (int i = 0 ; i < 3 ; i++) {
            char sym = sc.next().charAt(0);
            int temperature = sc.nextInt();
            if (sym == 'Y' && temperature >= 37) {
                ABCarr[0]++;
            }
            else if (sym == 'N' && temperature >= 37) {
                ABCarr[1]++;
            }
            else if (sym == 'Y' && temperature < 37) {
                ABCarr[2]++;
            }
            else {
                ABCarr[3]++;
            }
        }

        for (int i = 0 ; i < 4 ; i++) {
            System.out.print(ABCarr[i]+" ");
        }

        if (ABCarr[0]>=2) {
            System.out.print("E");
        }
    }
}
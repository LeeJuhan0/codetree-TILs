import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int[] cntarr = new int[11];

        for (int i = 0 ; i < 100; i++) {
            arr[i] = sc.nextInt();
            cntarr[arr[i]/10]++;
            if (arr[i]==0) {
                break;
            }
        }
        for (int i = 10 ; i > 0 ; i--) {
            System.out.println(i*10+" - "+cntarr[i]);
        }
    }
}
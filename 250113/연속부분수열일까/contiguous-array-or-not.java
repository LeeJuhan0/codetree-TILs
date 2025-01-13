import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        boolean seq = false;
        boolean first = true;

        for (int i = 0; i < n1 ; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2 ; i++) {
            arr2[i] = sc.nextInt();
        }

        for(int i = 0; i <= n1-n2 ; i++) {
            int cnt = 0;
            for(int j = 0; j < n2 ; j++) {
                if(arr1[j+i]==arr2[j]) {
                    cnt++;
                }
                else {
                    con = false;
                }
            }
            if (cnt == n2) {
                System.out.print("Yes");
                seq = true;
            }
        }

        if (seq == false) {
            System.out.print("No");
        }
    }
}
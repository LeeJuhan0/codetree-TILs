import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int qcnt = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i < qcnt ; i++) {
            int qnum = sc.nextInt();
            if (qnum == 1) {
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            }
            else if (qnum == 2) {
                int b = sc.nextInt();
                for (int j = 0 ; j < n; j++) {
                    if (arr[j]==b) {
                        System.out.println(j+1);
                        idx++;
                        break;
                    }
                }
                System.out.println(0);
            }
            else {
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int k = s-1 ; k < e ; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();

            }
        }
    }
}
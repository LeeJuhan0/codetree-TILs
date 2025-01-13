import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxcnt=0;
        int mincnt=0;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minvalue = arr[0];
        int maxvalue = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i]>=maxvalue) {
                maxvalue = arr[i];
            }
            if (arr[i]<=minvalue) {
                minvalue = arr[i];
            }
        }

        for (int i =0; i < n; i++) {
            if (arr[i]==maxvalue){
                maxcnt++;
            }
            if (arr[i]==minvalue) {
                mincnt++;
            }
        }
        System.out.print(minvalue+" "+mincnt);
    }
}
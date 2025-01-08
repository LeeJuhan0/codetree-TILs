import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0, cnt6 = 0, cnt7 = 0, cnt8 = 0, cnt9 = 0;
        
        for (int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
            if (arr[i]==1) {
                cnt1++;
            }
            if (arr[i]==2) {
                cnt2++;
            }
            if (arr[i]==3) {
                cnt3++;
            }
            if (arr[i]==4) {
                cnt4++;
            }
            if (arr[i]==5) {
                cnt5++;
            }
            if (arr[i]==6) {
                cnt6++;
            }
            if (arr[i]==7) {
                cnt7++;
            }
            if (arr[i]==8) {
                cnt8++;
            }
            if (arr[i]==9) {
                cnt9++;
            }
        }
        System.out.print(cnt1+"\n"+cnt2+"\n"+cnt3+"\n"+cnt4+"\n"+cnt5+"\n"+cnt6+"\n"+cnt7+"\n"+cnt8+"\n"+cnt9+"\n");
    }
}
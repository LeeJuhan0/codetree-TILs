import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[1000];
        for(int i = 0 ; i < n ; i++) {
            int num = sc.nextInt();
            int first = sc.nextInt();
            int second = sc.nextInt();
            for(int j = 1; j <= 9 ; j++) {
                for(int k = 1 ; k <= 9 ; k++) {
                    for(int l = 1 ; l <= 9 ; l++) {
                        int curfirst = 0, cursecond = 0;
                        if((num/100)%10 == j) {
                            curfirst++;
                        }
                        if((num/10)%10 == k) {
                            curfirst++;
                        }
                        if(num%10 == l) {
                            curfirst++;
                        }
                        if((num/100)%10 == k || (num/100)%10 == l ) {
                            cursecond++;
                        }
                        if((num/10)%10 == j || (num/10)%10 == l ){
                            cursecond++;
                        } 
                        if(num%10 == j || num%10 == k) {
                            cursecond++;
                        }
                        if(curfirst == first && second == cursecond){
                            arr[j*100+k*10+l]++;
                        }
                        if(j==k || l==k || j==l) {
                            arr[j*100+k*10+l]--;
                        }
                    }
                }
            } 
        }
        int ans = 0;
        for(int i = 0 ; i < 1000; i++) {
            if(arr[i] == n) {
                ans++;
            }
        }
        System.out.print(ans);
    }
}
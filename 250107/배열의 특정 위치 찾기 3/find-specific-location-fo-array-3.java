import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[100];
        int evensum = 0, cnt=-1, sum=0;

        for (int i = 0 ; i < 100 ; i++) {
            int n = sc.nextInt();
            if(n != 0) {
                arr[i] = n;
                cnt++;
            }
            
            else{
                break;
            }
           
        }

        for (int i = cnt ; i >= cnt-2  ; i--) {
            sum += arr[i];
        }
        System.out.print(sum);
        
    }
}  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[10];
        int evensum = 0, thrsum = 0,thrsum_cnt=0;

        for (int i = 0 ; i < 10 ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0 ; i < 10 ; i++) {
            if ((i+1)%2==0) {
                evensum += arr[i];
            }

            if((i+1)%3==0) {
                thrsum += arr[i];
                thrsum_cnt++;
            }
        }
        double avg = (double)thrsum/thrsum_cnt;
        System.out.print(evensum);
        System.out.printf(" %.1f",avg);
        
    }
}  
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] roomarr = new int[n];
        int[] rotatearr = new int[n];
        for (int i = 0 ; i < n ; i++) {
            roomarr[i] = sc.nextInt();
            rotatearr[i] = roomarr[i];
        }
        
        int mincnt = Integer.MAX_VALUE;
        int curcnt = 0 ;
        for (int i = 0 ; i < n ; i++) {
            curcnt = 0 ;
            for (int j = 0 ; j < n ; j++) {
                rotatearr[j] = roomarr[(i+j)%n];
            } 
            for (int j = 0 ; j < n ; j++) {
                curcnt += j*rotatearr[j];
            }
            mincnt = Math.min(curcnt, mincnt);   
        }
        System.out.print(mincnt);
    }
}
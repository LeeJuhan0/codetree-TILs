import java.util.Scanner;

public class Main {
    public static char[] arr ;
    public static char[] arr2 ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.next().toCharArray();
        arr2 = sc.next().toCharArray();
        System.out.print(idx());
    }
    public static int idx () {
        int idx = -1;
        int cnt = arr2.length;
      
        for (int i = 0 ; i <= arr.length-arr2.length ; i++) {
            for (int j = 0 ; j < arr2.length; j++) {
                if (arr[i+j] == arr2[j]) {
                    cnt--;
                }
            }
            if (cnt == 0) {
                idx = i;
                break;
            }
            cnt =arr2.length;
        }
        if (cnt != 0) {
            return -1;
        }
        else {
            return idx;
        }
    }
}
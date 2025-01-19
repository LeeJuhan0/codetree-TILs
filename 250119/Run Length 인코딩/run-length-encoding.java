import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next();
        char[] arr = new char[1000];
        char[] result_even_arr = new char[1000];
        int[] result_odd_arr= new int[1000];
        int even = 0, odd =0;
        int cnt = 1;
        for (int i = 0 ; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        
        for (int i = 1 ; i < str.length(); i++) {
            if(arr[i]==arr[i-1]) {
                cnt++;
                result_even_arr[even]=arr[i-1];
                result_odd_arr[odd]=cnt;
            }
            else {
                even++;
                odd++;
                result_even_arr[even]=arr[i];
                cnt=1;
                result_odd_arr[odd]=cnt;
            }
        }
        int len = 0;
        for (int i = 0; i < 1000; i++) {
            if(result_even_arr[i] != 0 && result_odd_arr[i] != 0) {
                len += String.valueOf(result_even_arr[i]).length();
                len += String.valueOf(result_odd_arr[i]).length();
            }
            else{
                break;
            }
        }
        System.out.println(len);
        for (int i = 0 ; i < 1000; i++) {
            if(result_even_arr[i]==0) {
                break;
            }
            System.out.print(result_even_arr[i]);
            System.out.print(result_odd_arr[i]);
            
        }

    }
}
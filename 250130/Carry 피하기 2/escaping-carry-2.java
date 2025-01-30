import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        boolean nothing = true;
        boolean carry = false;
        int maxvalue = 0 , curvalue ;
        for(int i = 0 ; i < n-2 ; i++) {
            for(int j = i+1 ; j < n-1 ; j++) {
                for(int k = j+1 ; k < n ; k++) {
                    int max = Math.max(arr[i], Math.max(arr[j], arr[k]));
                    int length = String.valueOf(max).length();
                    for(int l = length-1; l >= 0; l--) {
                        if(((arr[i]/(Math.pow(10, l)))%10+(arr[j]/(Math.pow(10, l)))%10+(arr[k]/(Math.pow(10, l)))%10)>=10) {
                            carry = true;
                        }
                    }
                    if(!carry) {
                        curvalue = arr[i] + arr[j] + arr[k];
                        maxvalue = Math.max(curvalue,maxvalue);
                        nothing = false;
                    }
                    carry = false;
                }
            }
        }
        System.out.print((nothing)? "-1" : maxvalue);
    }
}


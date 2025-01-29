import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int Value = 0;
        int[] arr = new int[n.length()];
        
        for(int i = 0 ; i < n.length() ; i++) {
            arr[i] =  n.charAt(i);
            
        }

        for(int i = 0 ; i < n.length() ; i++) {
            if (arr[i] =='0') {
                arr[i] = '1';
                break;
            }      
        }
        
        for(int i = 0 ; i < n.length() ; i++) {
            int bit = (arr[i]-'0');  
            Value += bit * Math.pow(2, n.length() - 1 - i);
        }

        System.out.print(Value);
    }
}
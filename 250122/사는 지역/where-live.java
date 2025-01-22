import java.util.Scanner;
import java.util.Arrays;

class adress {
    String name, num, city;

    public adress() {
        this.name = "";
        this.num = "";
        this.city = "";
    }

    public adress(String name, String num, String city) {
        this.name = name;
        this.num = num;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = -1;
        adress[] arr = new adress[n];
        String[] namearr = new String[n];
        for(int i = 0 ; i < n ; i++) {
            String name = sc.next();
            String num = sc.next();
            String city = sc.next();
            arr[i] = new adress(name, num, city);
        }
        for(int i = 0 ; i < n ; i++) {
            namearr[i] = arr[i].name;
        }
        Arrays.sort(namearr);
        for(int i = 0 ; i < n ; i++) {
            if (arr[i].name == namearr[n-1])
                idx = i ;
        }
        adress reulst = arr[idx];
        System.out.println("name " + reulst.name);
        System.out.println("addr " + reulst.num);
        System.out.println("city " + reulst.city);
    }
}
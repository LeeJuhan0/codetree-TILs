import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper (int value) {
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);
        modify(n,m);
        System.out.print(n.value+" "+m.value);

    }
    public static void modify(IntWrapper n, IntWrapper m) {
        int temp;
        temp = n.value;
        n.value = m.value;
        m.value = temp;
    }
}
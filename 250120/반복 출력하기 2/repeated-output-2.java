public class Main {
    public static void printHello(int n) { 
        if(n == 0)                       
            return;                      
        
        printHello(n - 1);                
        System.out.println("HelloWorld");      
    }

    public static void main(String[] args) {
        printHello(4);
    }
}

import java.util.Scanner;

public class Methods{
    public static boolean isDivisible(int n, int m) {return n % m == 0; } 
    public static boolean isTriangle(int a, int b, int c) {return a + b > c && a + c > b && b + c > a; }

    public static int ack(int m, int n){
        if (m > 0 & n > 0) { return ack(m - 1, ack(m, n - 1));}
        else if (m > 0 & n == 0) { return ack(m - 1, 1); }
        else if (m == 0) { return n + 1; }
        else { return 0; } // Base case, invoked when m == n == 0
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isDivisible(10, 2));
        System.out.println(isTriangle(5, 6, 7));
        System.out.println(ack(2, 2));
    }
}

//5. Fibonacci
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int f = fibonacci(n);
        System.out.println(f);
    }

    public static int fibonacci(int i){
        if (i<=1) {
            return i;
        }
        return fibonacci(i-1) + fibonacci(i-2);
    }
}

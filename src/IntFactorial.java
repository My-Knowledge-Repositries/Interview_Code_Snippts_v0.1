// integer factorial
public class IntFactorial {
    public static void main(String[] args) {
        System.out.println(longFactorial(3));
    }

    public static long longFactorial(long n) {
        if (n==1) {
            return 1;
        }else{
            return (n * longFactorial(n-1));
        }
    }
}
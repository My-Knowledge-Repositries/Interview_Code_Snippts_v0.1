// 2nd java interview question - Swapping numbers for without using third variable
public class SwapNumbers {
    public static void main(String[] args) {
        int swap1 = 34;
        int swap2 = 45;
        System.out.printf("a is %d, b is %d", swap1, swap2);


    }

    /*2nd method*/
    public static void swapNumbers(int swap1, int swap2) {
        swap2 = swap1 + swap2;
        swap1 = swap2 - swap1;
        swap2 = swap2 - swap1;
    }

}

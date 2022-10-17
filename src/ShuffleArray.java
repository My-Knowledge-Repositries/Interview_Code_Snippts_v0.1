import java.util.Arrays;
import java.util.Random;

//Shuffling array
public class ShuffleArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7,8,9};

        Random random = new Random();
        for (int i = 0; i < ar.length; i++) {
            int ramSwap = random.nextInt(ar.length);
            int temp = ar[ramSwap];
            ar[ramSwap] = ar[i];
            ar[i] = temp;
        }
        System.out.println(Arrays.toString(ar));
    }
}

// A showing sample code to null pointer exception
public class NullPointer {
    public static void main(String[] args) {
        printTextNum(null,3);
    }

    public static void printTextNum(String i, int count) {
        for (int j = 0; j < count; j++) {
            System.out.println(i.toUpperCase());
        }
    }
}

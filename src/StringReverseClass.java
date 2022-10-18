import java.util.Scanner;

// 1st java interview question - Reverse String for using scanner(First method. Second method is another java class)
public class StringReverseClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = scanner.next();
        System.out.println(reverse(input));
    }

    public static String reverse(String in) {
        if (in == null) {
            throw new RuntimeException("Null is a not valid...!!");
        }
        StringBuilder builder = new StringBuilder();
        char[] chars = in.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            builder.append(chars[i]);
        }
        return builder.toString();
    }

}

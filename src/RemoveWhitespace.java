// remove white space from string
public class RemoveWhitespace {
    public static String removeWhiteSpaces(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (!Character.isWhitespace(c)) {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeWhiteSpaces("Hello world"));
    }
}

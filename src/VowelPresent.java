//3. Vowel Presenting in string.
public class VowelPresent {
    public static void main(String[] args) {
        System.out.println(stringContainsVowel("Hello"));
        System.out.println(stringContainsVowel("hI"));
        System.out.println(stringContainsVowel("h1"));
    }

    public static boolean stringContainsVowel(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

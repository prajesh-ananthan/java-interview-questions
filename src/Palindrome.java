/**
 * Created by prajesh.ananthan on 6/1/2020.
 *
 * @author Prajesh Ananthan, BIGLIFE Sdn. Bhd.
 */
public class Palindrome {

    public static void main(String args[]) {
        System.out.println("Is aaa palindrome?: " + isPalindromString("aaa"));
        System.out.println("Is abc palindrome?: " + isPalindromString("abc"));

        System.out.println("Is bbbb palindrome?: " + isPalindromString("bbbb"));
        System.out.println("Is defg palindrome?: " + isPalindromString("defg"));
    }

    /**
     * Java method to check if given String is Palindrome
     *
     * @param text
     * @return true if text is palindrome, otherwise false
     */
    public static boolean isPalindromString(String text) {
        String reverse = reverse(text);
        if (text.equals(reverse)) {
            return true;
        }

        return false;
    }

    /**
     * Java method to reverse String using recursion
     *
     * @param input
     * @return reversed String of input
     */
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

}

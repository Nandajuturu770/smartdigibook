package web.utils;

import java.util.Random;

public class StringUtils {

    private static final Random RANDOM = new Random();

    /**
     * @description this method is used to generate random string based on given length.
     * @param length <code>int</code>
     * @return randomString <code>String</code>
     */
    public static String generateRandomString(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append(alphabet.charAt(RANDOM.nextInt(alphabet.length())));
        }
        return builder.toString();
    }
    
    /**
     * @description this method is used to get integer from the string
     * @param input <code>String</code>
     * @return number <code>int<code>
     */
    public static int getNumberFromString(String input) {
        String numbers = input.replaceAll("[^0-9.]", ""); 
        return numbers.isEmpty() ? 0 : Integer.parseInt(numbers);
    }
}

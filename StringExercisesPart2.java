/*
 *Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function capitalizeWords()
Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user defined function truncate()
Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined function isNumeric()

Q9. Write a Java Program for Creating a random string of a specified length using user defined function generateRandomString()

Q10. Write a Java Program for Counting the number of words in a string using user defined function countWords()

 */
package Strings;

import java.util.Random;

public class StringExercisesPart2 {

    public static void main(String[] args) {

        String sentence = "java is easy to learn";
        String numericTest = "12345";
        String truncateTest = "HelloWorldExample";

        System.out.println("capitalizeWords: " + capitalizeWords(sentence));
        System.out.println("truncate: " + truncate(truncateTest, 8));
        System.out.println("isNumeric: " + isNumeric(numericTest));
        System.out.println("generateRandomString: " + generateRandomString(8));
        System.out.println("countWords: " + countWords(sentence));
    }

    // Capitalize first letter of each word
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    // Truncate string
    public static String truncate(String str, int length) {
        if (str.length() <= length) return str;
        return str.substring(0, length) + "...";
    }

    // Check numeric
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    // Generate random string
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random rand = new Random();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < length; i++) {
            result.append(chars.charAt(rand.nextInt(chars.length())));
        }

        return result.toString();
    }

    // Count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("\\s+").length;
    }
}
/*
 * Q1. Write a Java Program for Checking if a given string is null or contains only whitespace using user defined function isNullOrEmpty().

Q2. Write a Java Program for Counting how many times a substring appears in a main string using user defined function countOccurrences()

Q3. Write a Java Program for Reversing the characters in a string using user defined function reverseString().

Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case and punctuation) using user defined function isPalindrome():

Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined function removeWhitespace()


 */
package Strings;

public class StringExercisesPart1 {

    public static void main(String[] args) {

        String test = "   ";
        String mainStr = "Java is fun. Java is powerful.";
        String subStr = "Java";
        String palindromeTest = "A man, a plan, a canal: Panama";
        String whitespaceTest = "  Hello World  ";

        System.out.println("isNullOrEmpty: " + isNullOrEmpty(test));
        System.out.println("countOccurrences: " + countOccurrences(mainStr, subStr));
        System.out.println("reverseString: " + reverseString("Hello"));
        System.out.println("isPalindrome: " + isPalindrome(palindromeTest));
        System.out.println("removeWhitespace: " + removeWhitespace(whitespaceTest));
    }

    // Check null or empty
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Count substring occurrences
    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;

        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }

        return count;
    }

    // Reverse string
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Check palindrome
    public static boolean isPalindrome(String str) {
        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Remove whitespace
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }
}
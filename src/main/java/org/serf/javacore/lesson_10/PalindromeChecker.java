package org.serf.javacore.lesson_10;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        String reverse;
        System.out.println("Enter word consisting of five characters to check:");
        word = scanner.nextLine();
        if(word.length() == 5){
            isPalindrome(word);
        }else{
            System.out.println("Wrong word length. Try again!");
        }
    }

    static void isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < (length / 2); i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println("Not palindrome.");
                return;
            }
        }
        System.out.println("Palindrome.");
    }
}

package org.example;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Main {

    // Testin beklediği Stack tabanlı Palindrom metodu
    public static boolean checkForPalindrome(String text) {
        if (text == null) {
            return false;
        }

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return cleaned.equals(reversed.toString());
    }

    // Decimal to Binary dönüştürme metodu
    public static String convertDecimalToBinary(int number) {
        if (number == 0) {
            return "0";
        }

        Deque<Integer> stack = new ArrayDeque<>();
        while (number > 0) {
            stack.push(number % 2);
            number /= 2;
        }

        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        // İstersen burada elle kontrol edebilirsin:
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(convertDecimalToBinary(13));
    }
}
package com.gla.Level1Practice;

public class Palindrome {
    private String text;

    public Palindrome(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }

    public void displayResult() {
        System.out.println("Text: \"" + text + "\"");
        System.out.println("Is Palindrome? " + isPalindrome());
    }
}


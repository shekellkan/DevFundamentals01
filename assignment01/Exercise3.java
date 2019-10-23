package assignment01;

public class Exercise3 {
    public boolean checkPalindrome(String inputString) {
        boolean band = false;
        String compare = new StringBuilder(inputString).reverse().toString();

        if (inputString.equals(compare)) {
           band = true; 
        }

        return band;
    }
    
    public static void main(String[] args) {
        System.out.println("------------- start -------------");
        System.out.println("aabaa is palindrome? " + new Exercise3().checkPalindrome("aabaa"));
        System.out.println("abac is palindrome? " + new Exercise3().checkPalindrome("abac"));
        System.out.println("a is palindrome? " + new Exercise3().checkPalindrome("a"));
        System.out.println("------------- end -------------");
    }
}
package assignment02;

import java.util.Arrays;


/**
 * Exercise3
 */
public class Exercise3 {

    public static boolean anagrams(String phrase, String compare) {
        String[] sentence = convert(phrase.toLowerCase().replaceAll("\\s",""));
        String[] compareTo = convert(compare.toLowerCase().replaceAll("\\s",""));

        Arrays.sort(sentence);
        Arrays.sort(compareTo);

        return Arrays.equals(sentence, compareTo);
    }

    public static String[] convert(String toConvert) {
        String[] result = new String[toConvert.length()];
        for (int i = 0; i < toConvert.length(); i++) {
            result[i] = String.valueOf(toConvert.charAt(i));           
        }
        return result;
    }

    public static void main(String[] args) {
        String phrase = "H e llo";
        String compare = "oehLL ";
        System.out.println("----------- start -----------");
        System.out.println(anagrams(phrase, compare));
        System.out.println("----------- end -----------");
    }
}
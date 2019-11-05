package assignment02;

import java.util.HashMap;

/**
 * Exercise2
 */
public class Exercise2 {

    public static HashMap<String, Integer> listWords(String phrase) {
        String[] list = phrase.split(" ");
        HashMap<String, Integer> wordsDirectory = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            wordsDirectory.put(list[i], wordsDirectory.getOrDefault(list[i], 0) + 1);
        }
        return wordsDirectory;
    }

    public static void main(String[] args) {
        String phrase = "This is is a new text text that have repeating repeating repeating words";
        System.out.println("----------- start -----------");
        System.out.println(listWords(phrase));
        System.out.println("----------- end -----------");
    }
}
package assignment02;

import java.util.HashMap;

/**
 * Exercise2
 */
public class Exercise2 {

    public static int countWord(String[] words, String value) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static HashMap<String, Integer> listWords(String phrase) {
        String[] list = phrase.split(" ");
        HashMap<String, Integer> wordsDirectory = new HashMap<>();
        for (int i = 0; i < list.length; i++) {
            int count = countWord(list, list[i]);
            if (count == 1) {
                wordsDirectory.put(list[i], count);
            } else {
                if (!wordsDirectory.containsKey(list[i])) {
                    wordsDirectory.put(list[i], count);        
                }
            }
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
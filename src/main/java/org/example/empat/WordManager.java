package org.example.empat;

import java.util.*;


public class WordManager {
    public String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() < longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public String reverseWords(String sentence) {
        List<String> wordList = Arrays.asList(sentence.split(" "));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public String combineWords(String word1, String word2) {
        return word1.substring(0, 2) + word2.substring(word2.length() - 2);
    }

    public String filterVowels(String word) {
        return word.replaceAll("[^aeiouAEIOU]", "");
    }

}

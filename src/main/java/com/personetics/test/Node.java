package com.personetics.test;

import java.util.Arrays;
import java.util.List;

public class Node {

    public static List<String> wordsList = Arrays.asList("ABC", "DEF", "PERSON");

    public static List<Integer> numbersList = Arrays.asList(1, 93, 55, 53);

    public static List<String> getWordsList() {
        return wordsList;
    }

    public static void setWordsList(List<String> wordsList) {
        Node.wordsList = wordsList;
    }

    public static List<Integer> getNumberList() {
        return numbersList;
    }

    public static void setNumberList(List<Integer> numberList) {
        Node.numbersList = numberList;
    }

    @Override
    public String toString() {
        return numbersList.toString() + wordsList.toString();
    }
}

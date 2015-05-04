package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 10;
        Random random = new Random();
        AscendingSortedList ascendingSortedList = new AscendingSortedList();
        for (int i = 0; i < size; i++)
            ascendingSortedList.add(random.nextInt());
        ascendingSortedList.stream().forEach(System.out::println);
    }
}

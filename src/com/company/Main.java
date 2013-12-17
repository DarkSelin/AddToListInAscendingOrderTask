package com.company;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size=10;
        Random random = new Random();
        SortedList sortedList = new SortedList();
        for (int i=0;i<size;i++)
            sortedList.add(random.nextInt());
        List<Integer> list = sortedList.getSortedList();
        for (Integer integer : list)
            System.out.println(integer);
    }
}

package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        List<Integer> list;
        sortedList.add(55);
        sortedList.add(57);
        sortedList.add(13);
        sortedList.add(11);
        sortedList.add(11);
        sortedList.add(13);
        list = sortedList.getSortedList();
        for (Integer i : list)
            System.out.println(list.get(i));
    }
}

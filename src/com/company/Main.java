package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        ListOperation.addToList(list, 55);
        ListOperation.addToList(list, 57);
        ListOperation.addToList(list, 13);
        ListOperation.addToList(list, 11);
        ListOperation.addToList(list, 11);
        ListOperation.addToList(list, 13);
        for (int i =0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}

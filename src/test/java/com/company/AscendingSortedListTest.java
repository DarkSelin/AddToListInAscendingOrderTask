package com.company;


import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class AscendingSortedListTest {

    private static final int SIZE = 20;
    private Random random = new Random();
    private AscendingSortedList ascendingSortedList;

    @Test
    public void listOperationRandomNumbersTest() {
        ascendingSortedList = new AscendingSortedList();
        for (int i = 0; i < SIZE; i++)
            ascendingSortedList.add(random.nextInt());
        for (int i = 0; i < ascendingSortedList.size() - 1; i++) {
            for (int j = i + 1; j < ascendingSortedList.size(); j++)
                Assert.assertTrue("All next elements are less or equal to current", ascendingSortedList.get(i) <= ascendingSortedList.get(j));
        }
    }

    @Test
    public void listOperationEqualNumbersTest() {
        ascendingSortedList = new AscendingSortedList();
        for (int i = 0; i < SIZE; i++) {
            ascendingSortedList.add(5);
        }
        for (int i = 0; i < ascendingSortedList.size(); i++) {
            Assert.assertEquals("All equal elements were added", SIZE, ascendingSortedList.size());
        }
    }

    @Test
    public void listOperationWithNullValueTest() {
        ascendingSortedList = new AscendingSortedList();
        Assert.assertFalse("Add null to list", ascendingSortedList.add(null));
    }

}

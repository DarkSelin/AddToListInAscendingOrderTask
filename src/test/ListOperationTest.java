package test;

import com.company.SortedList;
import junit.framework.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Random;

public class ListOperationTest {

    private static final int SIZE = 20;
    private Random random = new Random();
    private SortedList sortedList;
    private List<Integer> list;

    @Test
    public void listOperationRandomNumbersTest(){
        sortedList = new SortedList();
        for (int i=0;i<SIZE;i++)
            sortedList.add(random.nextInt());
        list = sortedList.getSortedList();
        for (int i=0;i< list.size()-1;i++){
            for (int j=i+1;j< list.size();j++)
                // Check that all next elements are less or equal to current.
                Assert.assertTrue(list.get(i) <= list.get(j));
        }
    }

    @Test
    public void listOperationEqualNumbersTest(){
        sortedList = new SortedList();
        for (int i=1;i<SIZE;i++)
            sortedList.add(5);
        list = sortedList.getSortedList();
        for (int i=0;i<list.size();i++){
            // Check that all equal elements were added.
            Assert.assertEquals(SIZE, list.size());
            // Check that all next elements are less or equal to current.
            Assert.assertTrue(list.get(i)<= 5);
        }
    }

    @Test(expected=NullPointerException.class)
     public void listOperationWithNullListTest(){
        Integer value = random.nextInt();
        sortedList.add(value);
        // NullPointerException is thrown
    }

    @Test(expected=IllegalArgumentException.class)
    public void listOperationWithNullValueTest(){
        Integer value = null;
        sortedList = new SortedList();
        sortedList.add(value);
        // IllegalArgumentException is thrown
    }

    @Test(expected=NullPointerException.class)
    public void listOperationWithNullListAndValueTest(){
        Integer value = null;
        sortedList.add(value);
        // NullPointerException is thrown
    }

}

package test;

import com.company.ListOperation;
import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListOperationTest {

    private static final int SIZE = 20;
    private Random random = new Random();
    private List<Integer> list;

    @Test
    public void listOperationRandomNumbersTest(){
        list = new LinkedList<Integer>();
        for (int i=0;i<SIZE;i++)
            ListOperation.addToList(list,random.nextInt());
        for (int i=0;i< list.size()-1;i++){
            for (int j=i+1;j< list.size();j++)
                // Check that all next elements are less or equal to current.
                Assert.assertTrue(list.get(i)<= list.get(j));
        }
    }

    @Test
    public void listOperationEqualNumbersTest(){
        list = new LinkedList<Integer>();
        for (int i=1;i<SIZE;i++)
            ListOperation.addToList(list,5);
        for (int i=0;i< list.size();i++){
            // Check that all equal elements were added.
            Assert.assertEquals(SIZE,list.size());
            // Check that all next elements are less or equal to current.
            Assert.assertTrue(list.get(i)<= 5);
        }
    }

    @Test(expected=NullPointerException.class)
     public void listOperationWithNullListTest(){
        Integer value = random.nextInt();
        ListOperation.addToList(list,value);
        // NullPointerException is thrown
    }

    @Test(expected=IllegalArgumentException.class)
    public void listOperationWithNullValueTest(){
        Integer value = null;
        list = new LinkedList<Integer>();
        ListOperation.addToList(list,value);
        // IllegalArgumentException is thrown
    }

    @Test(expected=IllegalArgumentException.class)
    public void listOperationWithNullListAndValueTest(){
        Integer value = null;
        ListOperation.addToList(list,value);
        // IllegalArgumentException is thrown
    }

}

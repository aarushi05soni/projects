package AkshayAssignment.Testing;
import AkshayAssignment.Others.Unique;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TestingList {
    @Test
    public  void test()
    {
        Unique unique=new Unique();
        List<Integer> unsorted_list=new ArrayList<Integer>();
        unsorted_list.add(6);
        unsorted_list.add(2);
        unsorted_list.add(7);
        unsorted_list.add(1);
        unsorted_list.add(8);
        unsorted_list.add(4);
        unsorted_list.add(1);
        unsorted_list.add(2);
        List<Integer> sorted_list=unique.checkUnique(unsorted_list);
        Integer a[]={4,6,7,8,1,1,2,2};
        assertArrayEquals(a,sorted_list.toArray());
    }
}

package AkshayAssignment.Testing;

import AkshayAssignment.Map.SortMap;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestingMap {
    @Test
    public  void test()
    {
        SortMap sortmap=new SortMap();
        HashMap<String,Integer> unsorted_map=new HashMap<String,Integer>();
        unsorted_map.put("tutu",2);
        unsorted_map.put("akshay",3);
        unsorted_map.put("aarushi",1);
        unsorted_map.put("tanvi",4);
        LinkedHashMap<String, Integer> sorted_map = sortmap.sortMap(unsorted_map);
        ArrayList<Integer> al=new ArrayList<>(sorted_map.values());
        Integer a[]={1,2,3,4};
        assertArrayEquals(a,al.toArray());
    }
}

package AkshayAssignment.Map;

import java.util.*;

public class SortMap
{
   public static LinkedHashMap<String,Integer> sort(HashMap<String,Integer> unsorted_map)
    {
        LinkedHashMap<String,Integer> res=new LinkedHashMap<>();
        int a[]=new int[unsorted_map.size()];
        int i=0;
        for(Map.Entry<String,Integer> entry:unsorted_map.entrySet())
        {
            a[i]=entry.getValue();
            i++;
        }
        System.out.println();
        for(int j=0;j<a.length-1;j++)
        {
            for(int k=j+1;k<a.length;k++)
            {
                if(a[j]>a[k])
                {
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        for(int j=0;j<a.length;j++)
        {
            for (Map.Entry<String, Integer> entry : unsorted_map.entrySet())
            {
                if (a[j] == entry.getValue())
                {
                    res.put(entry.getKey(), a[j]);
                    break;
                }
            }
        }
        System.out.println();
        return res;
    }


    public static LinkedHashMap sortMap(HashMap<String,Integer> unsorted_map)
    {
        LinkedHashMap<String, Integer> sorted_map = new LinkedHashMap<String,Integer>();
        sorted_map=sort(unsorted_map);
        return sorted_map;
    }

}



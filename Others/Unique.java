package AkshayAssignment.Others;
import java.util.ArrayList;
import java.util.List;
class Sort
{
    public static <N extends Comparable<N>> List<N> mySort(List<N> list)
    {
        int size=list.size();
        for(int i=0;i<size-1;i++)
        {
            //System.out.println(size);
            boolean copy=false;
            for(int j=i+1;j<size;j++)
            {

                int k=list.get(i).compareTo(list.get(j));
                if(k==0)
                {
                    copy=true;
                    N temp1=list.get(j);
                    list.remove(j);
                    list.add(temp1);
                    j--;
                    size--;
                }
                else if(k>=1)
                {
                    N temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
            if(copy)
            {
                N temp1=list.get(i);
                list.remove(i);
                list.add(temp1);
                i--;
                size--;
            }
        }
        return list;
    }
}
public class Unique
{
    public static List checkUnique(List list)
    {
        List list1= Sort.mySort(list);
        return list1;
    }

}

package AkshayAssignment.CheapestHotel;
import java.util.*;
public class LakeWood extends Hotels{
    int rating=3;
    int price_weekend;
    int price_weekday;
    private LakeWood(int price_weekend, int price_weekday)
    {
        this.price_weekend=price_weekend;
        this.price_weekday=price_weekday;
    }

    public static LakeWood createObject(String type)
    {
        LakeWood lobj;
        if(type.equals("Regular"))
        {
            lobj=new LakeWood(90,110);
        }
        else
        {
            lobj=new LakeWood(80,80);
        }
        return lobj;
    }

    public int getRating()
    {
        return rating;
    }


    @Override
    public double calculatePrice(List<String> list)
    {
        int total=0;
        String day="";
        for(int i=0;i<list.size();i++)
        {
            day=list.get(i);
            if(day.equals("mon") || day.equals("tues") || day.equals("wed") || day.equals("thurs") || day.equals("fri"))
            {
                total+=price_weekday;
            }
            else
            {
                total+=price_weekend;
            }

        }
        return total;
    }
}

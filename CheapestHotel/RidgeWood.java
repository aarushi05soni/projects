package AkshayAssignment.CheapestHotel;
import java.util.*;
public class RidgeWood extends Hotels{
    int rating=4;
    int price_weekend;
    int price_weekday;
    private RidgeWood(int price_weekend, int Price_weekday)
    {
        this.price_weekend=price_weekend;
        this.price_weekday=Price_weekday;
    }

    public static RidgeWood createObject(String type)
    {
        RidgeWood robj;
        if(type.equals("Regular"))
        {
            robj=new RidgeWood(150,220);
        }
        else
        {
            robj=new RidgeWood(40,100);
        }
        return robj;
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

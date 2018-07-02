package AkshayAssignment.CheapestHotel;
import java.util.*;
public class BridgeWood extends Hotels{
    int rating=5;
    int price_weekend;
    int price_weekday;
    private BridgeWood(int price_weekend, int price_weekday)
    {
        this.price_weekend=price_weekend;
        this.price_weekday=price_weekday;
    }

    public static BridgeWood createObject(String type)
    {
        BridgeWood bobj;
        if(type.equals("Regular"))
        {
            bobj=new BridgeWood(60,160);
        }
        else
        {
            bobj=new BridgeWood(50,110);
        }
        return bobj;
    }

    public int getRating()
    {
        return rating;
    }

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
        //System.out.println(total);
        return total;
    }
}

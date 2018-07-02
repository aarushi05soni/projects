package AkshayAssignment.CheapestHotel;
import java.util.*;

public class Cheapest
{
    public static List getDays(String input)
    {
        List<String> al=new ArrayList<String>();
        int begin=0;
        int end=0;
        for(int i=0;i<input.length();i++)
        {
            if (input.charAt(i) == '(')
            {
                int j=i+1;
                String day="";
                while(input.charAt(j)!=')')
                {
                    day=day+input.charAt(j);
                    j++;
                }
                al.add(day);
            }
        }
        return al;
    }

    public static String getCheapestHotel(double price_bridgewood, double price_ridgewood, double price_lakewood,int brating,int lrating,int rrating)
    {

        if(price_bridgewood<price_ridgewood && price_bridgewood<price_lakewood)
        {
            return "BridgeWood";
        }
        else if(price_bridgewood>price_ridgewood && price_ridgewood<price_lakewood)
        {
            return "RidgeWood";
        }
        else if(price_lakewood<price_bridgewood && price_lakewood<price_ridgewood)
        {
           return "LakeWood";
        }
        else
        {
           if(price_bridgewood==price_ridgewood)
           {
               if (brating>rrating)
               {
                   return "BridgeWood";
               }
               else
               {
                   return "RidgeWood";
               }
           }
           else if(price_lakewood==price_bridgewood)
           {
               if(lrating>brating)
                   return "LakeWood";
               else
                   return "BridgeWood";
           }
           else
           {
               if(lrating>rrating)
                   return "LakeWood";
               else
                   return "RidgeWood";
           }
        }

    }
    public String getHotel(String input)
    {
        //Scanner sc=new Scanner(System.in);
       // System.out.println("enter the type and dates");
        List<String> al1=new ArrayList<String>();
        //String input=sc.nextLine();
        String type="";
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==':')
                type=input.substring(0,i);
        }
        al1=getDays(input);
        BridgeWood bridgeWood=BridgeWood.createObject(type);
        RidgeWood ridgeWood=RidgeWood.createObject(type);
        LakeWood lakeWood=LakeWood.createObject(type);
        double price_bridgewood=bridgeWood.calculatePrice(al1);
        double price_ridgewood=ridgeWood.calculatePrice(al1);
        double price_lakewood=lakeWood.calculatePrice(al1);
        int brating=bridgeWood.getRating();
        int lrating=lakeWood.getRating();
        int rrating=ridgeWood.getRating();
        String cheapest=getCheapestHotel(price_bridgewood,price_ridgewood,price_lakewood,brating,lrating,rrating);
        //System.out.println(cheapest);
        return cheapest;
    }
}

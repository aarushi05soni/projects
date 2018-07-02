package AkshayAssignment.CheapestHotel;
import java.util.*;
public abstract class Hotels {
    public int rating;
    public int rate_weekend;
    public int rate_weekday;
    abstract public double calculatePrice(List<String> dateList);
}
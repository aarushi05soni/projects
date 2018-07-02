package AkshayAssignment.Testing;
import AkshayAssignment.CheapestHotel.Cheapest;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestingHotel {
    @Test
    public  void test()
    {
        Cheapest cheapest=new Cheapest();
        String output=cheapest.getHotel("Regular:17mar2018(mon),18mar2018(tues),19mar2018(wed)");
        assertEquals("LakeWood",output);
        String output1=cheapest.getHotel("Rewards:26Mar2009(thur),27Mar2009(fri),28Mar2009(sat)");
        assertEquals("RidgeWood",output1);
        String output2=cheapest.getHotel("Regular: 20Mar2009(fri), 21Mar2009(sat), 22Mar2009(sun)");
        assertEquals("BridgeWood",output2);
    }
}

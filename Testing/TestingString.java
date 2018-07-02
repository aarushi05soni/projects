package AkshayAssignment.Testing;

import AkshayAssignment.CheapestHotel.StringPalindrome;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestingString {
    @Test
    public  void test()
    {
        StringPalindrome input =new StringPalindrome();
        String output=input.check("abcab");
        assertEquals("yes",output);

    }
}

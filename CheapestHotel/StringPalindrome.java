package AkshayAssignment.CheapestHotel;

public class StringPalindrome {
   static String check="";
    public String check(String input)
    {

        boolean set=true;
        boolean final1=true;
        for(int i=0;i<input.length();i++)
        {
            int count=1;
            if(stringCheck(check,input.charAt(i)))
                continue;
            else
            {
                check=check+input.charAt(i);
                for(int j=i+1;j<input.length();j++)
                {
                    if(input.charAt(i)==input.charAt(j))
                        count++;
                }
               if(count%2!=0)
               {
                   if(set)
                   {
                       set = false;
                   }
                   else
                   {
                       final1 = false;
                       break;
                   }
               }
            }
        }
        if(final1)
            return "yes";
        else
            return "no";
    }

    public static boolean stringCheck(String check,char c)
    {
        for(int i=0;i<check.length();i++)
        {
            if(check.charAt(i)==c)
                return true;
        }
        return false;
    }
}




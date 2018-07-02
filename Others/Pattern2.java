package AkshayAssignment.Others;

import java.util.*;
public class Pattern2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int rows=sc.nextInt();
        int b=2;
        for(int i=1;i<=(2*rows)+1;i++)
        {
            if(i<=rows)
            {
                for(int j=1;j<=i;j++)
                    System.out.print(j+" ");
            }
            else
            {
                for(int j=1;j<=i-b;j++) {
                    System.out.print(j + " ");

                }
                b+=2;
            }
            System.out.println();
        }
    }


}

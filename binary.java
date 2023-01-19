import java.util.*;
class binary
{
    public static void main(String args[])
    {
        String b="";
        int n=8;
        int d=n;
       // int arr[]=new int[10];
        while(d>0)
        {
        int r=d%2;
        System.out.print(r);
        d=d/2;
        System.out.println(d);
        b=r+b;
        
        }
        System.out.print(b);
    }
}
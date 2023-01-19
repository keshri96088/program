import java .util.*;
class sum
{
    public static void main(String args[])
    {
        int n=120;
        int sum=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
        }
        System.out.print(sum);
    }
}
import java .util.*;
class greater
{
    public static void main(String args[])
    {
        int aa[]={1,2,8,7};
        int max=aa[0];
        int i=0;
        for(i=0;i<aa.length-1;i++)
        {
            if(aa[i]>max)
            {
                max=aa[i];
               
            }
        }
        System.out.println(i);
    }
}
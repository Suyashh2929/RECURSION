//1-n

import java.util.*;
public class P1
{
    public static void f(int n,int i)
    {
        if(i>n)
        return;
        else
        {
            System.out.print(i+" ");
            f(n,i+1);
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        f(n,1);
    }
}
// n-1

import java.util.*;
public class P2
{
    public static void f(int n)
    {
        if(n==0)
        return;
        else
        {
            System.out.print(n+" ");
            f(n-1);
        }
    }
    public static void main(String[] args) 
    {
        int n=5;
        f(n);
    }
}
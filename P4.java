// arr rev

import java.util.*;
public class P4
{
    public static void f(int arr[],int i)
    {
        if(i==-1)
        return;
        else
        {
            System.out.print(arr[i]+" ");
            f(arr,i-1);
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={8,3,0,3,1};
        f(arr,arr.length-1);
    }
}
// arr min

import java.util.*;
public class P6
{
    public static int f(int arr[],int i,int min)
    {
        if(i==arr.length)
        return min;
        else
        {
            if(arr[i]<min)
            min=arr[i];
        }
        return f(arr,i+1,min);
    }
    public static void main(String[] args) 
    {
        int arr[]={8,3,-7,3,1};
        int min=f(arr,0,arr[0]);
        System.out.print(min);
    }
}
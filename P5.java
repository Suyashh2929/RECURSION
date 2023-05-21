// arr max

import java.util.*;
public class P5
{
    public static int f(int arr[],int i,int max)
    {
        if(i==arr.length)
        return max;
        else
        {
            if(arr[i]>max)
            max=arr[i];
        }
        return f(arr,i+1,max);
    }
    public static void main(String[] args) 
    {
        int arr[]={8,3,0,3,1,33};
        int max=f(arr,0,0);
        System.out.print(max);
    }
}
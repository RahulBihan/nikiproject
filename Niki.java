
package niki;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author Rahul
 */
public class Niki {

    
   
     static int countStrings(int n)
    {
       int a[] = new int [n];
       int  b[]= new int [n];
        a[0] = b[0] = 1;
        int l = 1000000007;    
       for (int i = 1; i < n; i++)
        {
            a[i] = (a[i-1] + b[i-1])%l;
            b[i] = a[i-1]%l;
        }
        
     int m = (a[n-1] + b[n-1])%l; 
  
        return m ;    
    }
    
    public static void main(String[] args) {
        
        
              Scanner a = new Scanner(System.in);
             // System.out.println("enter value of t");
              double t = a.nextDouble();
             // System.out.println("enter value of n's");
             for(int i= 0;i < t; i++)
                {  
                   
                  long d = a.nextLong();
                   if(d<1000000000)
                   {   int x=(int) d ;
                     System.out.println(countStrings(x));
                   }  
                   
                   else
                   {
                       
                       d=d%1000000007;
                     //  System.out.println(d);
                       int o= (int)d;
                  System.out.println(countStrings(o));
                   }
                } 
    }
}  

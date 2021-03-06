import java.util.*;

public class WhatsPrinted08 { 
public static void main(String [] args){
int [ ] n = {6, 8, 7, 1, 2, 4, 5, 3};
n = b(n);
System.out.println(Arrays.toString(n));
}

public static int []  b2 (int []  left, int [] right){
   int [] output = new int[left.length+right.length];
   int il = 0;
   int ir = 0;
   int io = 0;
   while (il<left.length && ir<right.length){
      if(left[il]<right[ir]){
         output[io++] = left [il++];
      }
      else
         output[io++] = right [ir++];
   }
   while (il<left.length)
      output[io++]= left[il++];
   while (ir<right.length)
      output[io++]= right[ir++];
   return output;
}

public static int [] b(int [] a)
{
if (a.length>1){
   int half = a.length/2;
   int [] left = new int [half];
   int [] right = new int [a.length-half];
   for(int i = 0; i<half; i++)
      left[i] = a[i];
   for(int i = half; i<a.length; i++)
      right[i-half]=a[i];
   left = b(left);
   right = b(right);
   a = b2(left, right);
   }
return a;
} // method
}
// consider a similar question in quiz such as
// the 3rd call of method ?b? when b(n) is called

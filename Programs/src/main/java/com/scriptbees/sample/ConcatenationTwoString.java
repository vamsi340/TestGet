package com.scriptbees.sample;

import java.util.Scanner;

class ConcatenationTwoString{  
 public static void main(String args[]){  
   String s1,s2,s3;
   Scanner s=new Scanner(System.in);
   System.out.println("Plz Enter First Strings");
   s1=s.next();
   System.out.println("Plz Enter Second Strings");
   s2=s.next(); 
   
   s3=s1.concat(s2);  
   System.out.println("Concatenation Of Two Strings are: "+s3); 
  }  
}  
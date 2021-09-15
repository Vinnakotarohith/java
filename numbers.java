import java.util.*;
import java.io.*;
import java.lang.*;
import java.applet.*;
//--->Print natural numbers EX:1,2,3,4.....n<----
 class numbers{

   void natural(){//--->method
      
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number last natural number to print ");
      int n=sc.nextInt();
      for(int i=0;i<=n;i++){
         System.out.println(i);
      }
   }
   public static void main(String [ ] args){
   
numbers ad=new numbers();
     ad. natural();//--->calling a method
   }
 }





 
  
    
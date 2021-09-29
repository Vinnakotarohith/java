import java.util.*;
//check the whether number is palindrome or not
// A number that is same reverse word
class j {

  void sa(){
    String a,reverse="";

    Scanner sx=new Scanner(System.in);
    System.out.println("Enter the string");

     a=sx.nextLine();// reading the word
     for(int i=a.length()-1;i>=0;i--)
     reverse=reverse+a.charAt(i);
   System.out.println(reverse);
    if(a.equals(reverse)){
    System.out.println("palindrome");
    }
    else{
      System.out.println("not palindrome");
    }
    
  }
  public static void main (String args[])
  {
    
    j ad=new j();
    ad.sa();
  }
}
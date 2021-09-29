import java.util.*;
//check the whether number is palindrome or not
// A number that is same reverse number 
class j {

  void sa(){
    Scanner sx=new Scanner(System.in);
    System.out.println("Enter the number");

    int a=sx.nextInt();// reading the variable
    int r,sum=0,temp;
    temp=a;//The given number stored in another variable.
    while(a>0){
      /*Example:The given number is "454"
      first we want the reminder of the given variable--> 
      10)454(45
         40
          50
         -----
         4
         the reminder is 4
         next we do sum =0*4+4=4
         and a=454/10=45.4 it takes only integer number only not float values
         then the given number is "45"
         and again do same process until the given number is the given number is less than '0'.

      */ 
    r=a%10;
    sum=sum*10+r;
    a=a/10;
    }
    if(temp==sum){
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
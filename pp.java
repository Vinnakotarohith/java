import java.util.*;
//The given number is automorphic or not
class pp {

  void sa(){
    Scanner sx=new Scanner(System.in);
    System.out.println("Enter the number");

    int a=sx.nextInt();
    int r,sum=0,temp;
    temp=a;
    while(a>0){
    r=a%10;
    sum=sum*10+r;
    a=a/10;
    }
    if(temp==sum){
    System.out.println("paradorline");
    }
    else{
      System.out.println("not praradorline");
    }
    
  }
  public static void main (String args[])
  {
    
    pp ad=new pp	();
    ad.sa();
  }
}
import java.util.*;
import java.io.*;
import java.lang.*;
import java.applet.*;
//--->Print natural numbers EX:1,2,3,4.....n<----
 class numbers{
int id;
String acc;
float amount;
void insert(int i,String a,float h)
{
id=i;
acc=a;
amount=h;
}

void Deposit(float h)
{
amount = amount+h;
System.out.println("Deposit---->"+h);

}
void withdrawl(float h)
{
if(amount<h){
   System.out.println("insuffientbalance");

}
else{
   amount=amount-h;
}

System.out.println("Withdrawl----->"+amount);
}
void balanceCheck()
{
   System.out.println("account balance---->"+amount);
}
void Display()
{
   System.out.println("account name--->"+acc+"<----id--->"+id);
}
public static void main(String [] args)
{
numbers sc=new numbers();
sc.insert(1000,"rohith",1000);
sc.Display();
sc.Deposit(1000000);
sc.balanceCheck();
sc.withdrawl(10000);
sc.balanceCheck();



}
    
   }

 





 
  
    
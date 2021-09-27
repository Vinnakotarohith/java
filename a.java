import java.util.*;///package
class a{
//----> REVERSE THE GIVEN NUMBER
    public static void main(String args[])
{
    Scanner g=new Scanner(System.in);
    int reverse=0;
   System.out.println("enter the number");
   int number=g.nextInt();

while(number!=0)
{
  int  reminder=number%10;

  reverse=reverse*10+reminder;
  number=number/10;
}
System.out.println(reverse);
  


}
}
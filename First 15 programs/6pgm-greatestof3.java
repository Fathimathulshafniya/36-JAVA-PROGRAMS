public class Main
{
 public static void main(String args[])
{
 int a=8,b=23,c=3;
 if(a>b)
  if(a>c)
    System.out.println(a+" is the greatest number");
  else
    System.out.println(c+" is the greatest number");
 else if(b>c)
   System.out.println(b+" is the greatest number");
  else
   System.out.println(c+" is the greatest number");
}
}

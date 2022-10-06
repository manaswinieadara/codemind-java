import java.util.Scanner;
import java.util.*;
class area
{
    public static void main(String args[])
    {
  Scanner sc=new Scanner(System.in);
  double a,b,c;
  a=sc.nextDouble();
  b=sc.nextDouble();
  c=sc.nextDouble();
  double s=(a+b+c)/2;
  double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.format("%.2f",area);
    }
}
import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double r=sc.nextDouble();
        double area=(3.14*r*r);
        System.out.format("%.2f",area);
    }
}
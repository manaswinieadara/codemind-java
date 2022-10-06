import java.util.Scanner;
class Conversion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double cel=sc.nextDouble();
        double fah=32+(cel*9/5);
        System.out.format("%.2f",fah);
    }
}
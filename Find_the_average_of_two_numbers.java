import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        a=sc.nextDouble();
        b=sc.nextDouble();
        double avg=(a+b)/2;
        System.out.format("%.4f",avg);
    }
}
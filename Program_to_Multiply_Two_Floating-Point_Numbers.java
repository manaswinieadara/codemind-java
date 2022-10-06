import java.util.Scanner;
class multiply
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double a,b;
        b=sc.nextDouble();
         a=sc.nextDouble();
        double mul=(a*b);
        System.out.format("%.2f",mul);
        
    }
}
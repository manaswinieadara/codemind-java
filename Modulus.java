import java.util.Scanner;
class modulus
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        int mod=(a%b);
        System.out.println(mod);
    }
}
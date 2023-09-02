import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int mul=1;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the n:");
        int n=m.nextInt();
        for(int i=1;i<=n;i++)
          mul=mul*i;
        System.out.print("The factorial of "+n+" value is:"+ mul);
    }
}
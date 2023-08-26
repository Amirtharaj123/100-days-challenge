import java.util.Scanner;
class logic
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.println();
        }
    }
} 


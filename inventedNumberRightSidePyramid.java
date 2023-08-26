import java.util.Scanner;
class logic
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(int i=1;i<=n;)
        {
            for(int j=1;j<=n;j++)
            System.out.print(j);
            System.out.println();
            n=n-1;
        }
    }
} 


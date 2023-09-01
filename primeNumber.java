import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=m.nextInt();
        int flag=0;
        for(int j=2;j<=n;j++)
        {
            flag=1;
            if(n%j==0&&n!=j)
            {
                flag=2;
                break;
            }
        }
        if(flag==1)
           System.out.print(n+" is a prime number");
        else
           System.out.print(n+" is a not prime number");

    }
}
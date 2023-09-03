import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the value:");
        int n=m.nextInt();
        int s=0,ans=0;
        for(int i=0;n!=0;i++)
        {
            s=n%10;
            ans=ans+s*((int)Math.pow(2,i));
            n=n/10;
        }
        System.out.print("The decimal value:"+ans);
    }
}
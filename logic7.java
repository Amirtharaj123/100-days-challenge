import java.util.Scanner;
class logic
{
    public static void main(String a1[])
    {
        int n,s,ans;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the Number:");
        n=m.nextInt();
        ans=0;
        while(n!=0)
        {
            s=n%10;
            ans=ans*10+s;
            n=n/10;
        }
        System.out.print("The Reverse of a number:"+ans);
    }
} 


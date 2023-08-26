import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int n,s,ans,s1;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the Number:");
        n=m.nextInt();
        ans=0;
        s1=n;
        while(n!=0)
        {
            s=n%10;
            ans=s*s*s+ans;
            n=n/10;
        }
        if(s1==ans)
            System.out.print(s1+" is a Armstrong number");
        else
            System.out.print(s1+" is a Not Armstrong number");

    }
} 



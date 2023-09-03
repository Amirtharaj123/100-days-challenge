import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=m.nextInt();
        int sum=0;
        int s=1;
        for(int i=1;i<=(n+n-1);i=i+2)
        {
            if(s==1)
            {
                sum=i+sum;
                System.out.println("s +value:"+sum);
                s=0;
            }
            if(s==0)
            {
                sum=sum-i;
                System.out.println("s - value:"+sum);
                s=1;
            }
        }
        System.out.print(sum);
    }
}

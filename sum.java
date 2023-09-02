import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int sum;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter N:");
        int n=m.nextInt();
        sum=0;
        for(int i=0;i<n;i++)
           sum=sum+i;
        System.out.print("The sum of value:"+sum);
    }
}

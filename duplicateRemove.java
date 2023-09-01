import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int i,j,count,s;
        int b[]=new int[10];
        int a[]=new int[10];
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        System.out.println("the elements:");
        for(i=0;i<n;i++)
           a[i]=m.nextInt();
        s=0;
        for(i=0;i<n;i++)
        {
            count=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                   count=1;
                   break;
                }
            }
            if(count==0)
              b[s++]=a[i];
        }
        System.out.print("The after removing duplicate element:");
         for(i=0;i<s;i++)
           System.out.println( b[i]);
    }
}
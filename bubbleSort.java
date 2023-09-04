import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i,j,c;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(i=0;i<n;i++)
          a[i]=m.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    c=a[j];
                    a[j]=a[j+1];
                    a[j+1]=c;
                }
            }
        }
        System.out.println("The sorted After values:");
        for(i=0;i<n;i++)
           System.out.println(a[i]);
    }
}
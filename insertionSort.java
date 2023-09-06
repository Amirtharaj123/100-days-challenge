import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i,j,v;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(i=0;i<n;i++)
          a[i]=m.nextInt();
        for(i=1;i<n;i++)
        {
            v=a[i];
            for(j=i-1;j>=0&&a[j]>v;j--)
            {
                a[j+1]=a[j];
            }
           a[j+1]=v;
        }
        System.out.println("The sorted After values:");
        for(i=0;i<n;i++)
           System.out.println(a[i]);
    }
}

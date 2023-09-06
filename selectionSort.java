import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i,j,c,min;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(i=0;i<n;i++)
          a[i]=m.nextInt();
        for(i=0;i<n-1;i++)
        {
            min=i;
            for(j=i+1;j<n;j++)
            {
                if(a[min]>a[j])
                {
                    min=j;
                }
            }
            c=a[min];
            a[min]=a[i];
            a[i]=c;
        }
        System.out.println("The sorted After values:");
        for(i=0;i<n;i++)
           System.out.println(a[i]);
    }
}
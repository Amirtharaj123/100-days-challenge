import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(i=0;i<n;i++)
          a[i]=m.nextInt();
        System.out.print("Enter the searching value:");
        int s=m.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==s)
               break;
        }
        if(a[i]==s)
           System.out.print("Searching value is found");
        else
           System.out.print("Searching value is not found");
    }
}
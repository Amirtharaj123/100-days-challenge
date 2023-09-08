import java.util.*;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i,j,c;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the array limit:");
        int n=m.nextInt();
        System.out.println("the array elements:");
        for(i=0;i<n;i++)
           a[i]=m.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    c=a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        System.out.println("The minimum value in array:"+a[0]);
        System.out.println("The maximum value in array:"+a[n-1]);
    }
}

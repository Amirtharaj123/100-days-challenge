import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        int a[]=new int[10];
        int i,j,start,end,c;
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
        System.out.print("Enter the searching value:");
        int s=m.nextInt();
        start=0;
        end=n;
        int mid=0;
        while(start<=end)
        {
            mid=(start+end)/2;
            if(a[mid]==s)
               break;
            else if(a[mid]<s)
               start=mid+1;
            else
               end=mid-1;
        }
        if(a[mid]==s)
           System.out.print("Searching value is found");
        else
           System.out.print("Searching value is not found");
    }
}
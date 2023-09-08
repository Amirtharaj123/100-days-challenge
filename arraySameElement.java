import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
  
        int a[]=new int[20];
        int b[]=new int[20];
        int n,i,n1,j,count;
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the first array limit:");
        n=m.nextInt();
        System.out.println("The first array elements");
        for(i=0;i<n;i++)
            a[i]=m.nextInt();
        System.out.print("Enter the second array limit:");
        n1=m.nextInt();
        System.out.println("The second array elements");
        for(j=0;j<n1;j++)
            b[j]=m.nextInt();
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    count=a[i];
                    a[i]=a[j];
                    a[j]=count;
                }
            }
        }
        for(i=0;i<n1-1;i++)
        {
            for(j=i+1;j<n1;j++)
            {
                if(b[i]>b[j])
                {
                    count=b[i];
                    b[i]=b[j];
                    b[j]=count;
                }
            }
        }
        i=0;
        j=0;
        count=0;
        while(i<n&j<n1)
        {
            System.out.println(i+" "+j);
            if(a[i]==b[j])
            {
               j++;
               i++;
               count++;
            }
            else if(n>n1)
                i++;
            else if(n<n1)
                j++;
            else
                break;
        }
        if(count==n||count==n1)
           System.out.print("Array elements same");
        else
            System.out.print("Array elements not same");
	}
}

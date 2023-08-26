import java.util.Scanner;
class logic
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;i>=j;j++)
            System.out.print(j);
            System.out.println();
        }
    }
} 

import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=m.nextInt();
        int s=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s+"");
                s++;
            }
            System.out.println();
        }
    }
}
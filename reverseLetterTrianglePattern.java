import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter n:");
        int n=m.nextInt();
        byte s;
        for(int i=n;i>=1;i--)
        {
            s=65;
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)s+" ");
                s++;
            }
            System.out.println();
        }
    }
}
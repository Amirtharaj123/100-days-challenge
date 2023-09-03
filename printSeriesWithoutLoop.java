import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the limit:");
        int n=m.nextInt();
        simple s1=new simple();
        s1.series(1,n);
    }
    void series(int i,int n)
    {
        if(i==n)
        {
            System.out.print(i);
            return;
        }
        else
        {
            System.out.println(i);
            series(i+1,n);
        }
    }
}
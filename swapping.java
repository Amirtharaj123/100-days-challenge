import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the a and b value:");
        int a=m.nextInt();
        int b=m.nextInt();
        System.out.println("the Before swapping a and b value:");
        System.out.println("a="+a+"  b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the After swapping a and b value:");
        System.out.println("a="+a+"  b="+b);
    }
}
import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s=m.nextLine();
        s=s.replaceAll("\\s","");
        System.out.print(s);
    }
}
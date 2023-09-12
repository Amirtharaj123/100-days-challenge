import java.util.*;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the String:");
        String s=m.nextLine();
        for(int i=0;i<s.length();i++)
            System.out.println(s.charAt(i));
    }
}
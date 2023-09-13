import java.util.*;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the String 1:");
        String s=m.nextLine();
        System.out.print("Enter the String 2:");
        String s1=m.nextLine();
        if(s.equals(s1)==true)
          System.out.print("two string are equal");
        else
          System.out.print("two string are not equal");
    }
}
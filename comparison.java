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
        if(s.compareTo(s1)==0)
           System.out.print("The two strings are equal");
        else
           System.out.print("The two strings are not equal");     
    }
}

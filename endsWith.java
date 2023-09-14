import java.util.*;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter the string:");
        String s1=m.nextLine();
        if(s1.endsWith("department")==true)
            System.out.print("the given string are ending department string");
        else 
            System.out.print("the given string are ending department not string");

    }
}


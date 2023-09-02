import java.util.Arrays;
import java.util.Scanner;
class simple
{
    public static void main(String a1[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("Enter string 1:");
        String s1=m.nextLine();
        System.out.print("Enter String 2:");
        String s2=m.nextLine();
        if(s1.length()==s2.length())
        {
            char s3[]=s1.toCharArray();
            char s4[]=s2.toCharArray();
            Arrays.sort(s3);
            Arrays.sort(s4);
            if(Arrays.equals(s3,s4)==true)
                System.out.print(s1+" and "+s2+" is a anagram");
            else
                System.out.print(s1+" and "+s2+" is a not anagram");
        }
        else
           System.out.print(s1+" and "+s2+" is a not anagram");
    }
}

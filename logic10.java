import java.util.Scanner;
class s
{
    public static void main(String a2[])
    {
      String k,k1;int i;
      Scanner l=new Scanner(System.in);
      System.out.print("Enter the string:");
      k=l.nextLine();
      k1="";
      for(i=0;i<k.length();i++)
        k1=k.charAt(i)+k1;
      i=k.compareTo(k1);
      if(i==0)    
        System.out.println(k+" is a palindrome");
      else
        System.out.println(k+" is a not palindrome");
    }
}
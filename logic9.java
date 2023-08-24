import java.util.Scanner;
class s
{
    public static void main(String a2[])
    {
      String k,k1;
      Scanner l=new Scanner(System.in);
      System.out.print("Enter the string:");
      k=l.nextLine();
      k1="";
      for(int i=0;i<k.length();i++)
        k1=k.charAt(i)+k1;
        System.out.println("The reverse of a string:"+k1);    
    }
}
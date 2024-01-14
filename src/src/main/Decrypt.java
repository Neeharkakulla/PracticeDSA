
package src.main;
import java.util.Scanner;
import java.util.Stack;

class Result {

    /*
     * Complete the 'decryptPassword' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String decryptPassword(String s) {
    // Write your code here
    StringBuilder result=new StringBuilder(s);
    Stack<Character> stack=new Stack<Character>();
    for(int i=0,count=0;i<s.length();i++)
    {
        
        int ascii=(int)s.charAt(i);
        System.out.println(ascii);
        if(ascii>48&&ascii<58)
        {
            stack.push(s.charAt(i));
            
        }
        else if(ascii==48&&!stack.isEmpty())
        {
            
           result.replace(i-count, i+1-count, ""+stack.pop()) ;
           result.replace(0, 1, "");
           count++;
        }
        else if(ascii==42)
        {
           String a=""+s.charAt(i-1);
           String b=""+s.charAt(i-2);
           result.replace(i-1-count, i-count, b);
           result.replace(i-2-count, i-1-count, a);
           result.replace(i-count, i+1-count, "");
           count++;
        }
    }

    return ""+result;



    }

}
public class Decrypt {
public static void main(String[] args) {

Scanner in=new Scanner(System.in);
System.out.println("Enter a value to decrypt");
String s=in.nextLine();

System.out.println(Result.decryptPassword(s));
in.close();
}
}

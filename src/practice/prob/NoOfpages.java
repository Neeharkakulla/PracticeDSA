
package src.main;
import java.io.IOException;
import java.util.Scanner;

public class NoOfpages {

    /*
     * Complete the pageCount function below.
     */
    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */
         int front=0,back=0;
         if(p==1||n==p)
         return 0;
        else if(p==2) {
             return 1; 
         }
         else if(n%2==0)
         {
             if(n-1==p)
             return 1;
             else
             {
                     front=p/2;
                     back=(n-p)/2;
             }
         }
         else if(n%2!=0)
         {
             if(n-1==p)
             return 0;
              else
             {
                     front=p/2;
                     back=(n-p)/2;
             }
         }
         
        return front<back?front:back;     

    }

   

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int p = scanner.nextInt();
      
        int result = pageCount(n, p);
        System.out.println(result);
       

        scanner.close();
    }
}

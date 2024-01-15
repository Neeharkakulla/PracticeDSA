package src.main.practice.others;
import java.io.IOException;
import java.util.Scanner;

public class LeapYear {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
       if(year<=1917) {
    	   if(year%4==0) {
    		  
               return "12.09."+year;
    	   }
       }
           
           
       else if(year==1918) {
    	   
            return "26.09."+year;
       }
        else if(year>=1919) {
            if(year%4==0&&year%100!=0) {
            	
                return "12.09."+year;
            }
            else if(year%400==0) {
            	
                 return "12.09."+year;
            }
        }
       System.out.println("return");
          return "13.09."+year;
        
	

    }

    public static void main(String[] args) throws IOException {
       System.out.println("Enter any year betweeen 1700&2700");
        int year = new Scanner(System.in).nextInt();
        
        String result = dayOfProgrammer(year);

       System.out.println(result);
    }
}

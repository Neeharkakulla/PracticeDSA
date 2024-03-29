package src.main.practice.others;
import java.io.IOException;
import java.util.Scanner;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {

      int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-2;i++)
        {
            for(int j=0;j+2<arr[0].length;j++)
            {
                int sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j+2]+arr[i+2][j]+arr[i+2][j+1]);
                
                if(sum>max)
                max=sum;
            }
        }
        return max;
    }

    

    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++)
        	for(int j=0;j<6;j++)
        		arr[i][j]=in.nextInt();
       
        System.out.println(hourglassSum(arr));

       
        in.close();
    }
}

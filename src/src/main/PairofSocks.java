package src.main;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairofSocks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(ar[i]))
            {
                map.put(ar[i],map.get(ar[i])+1);
            }
            else
            {
                map.put(ar[i],1);
            }
        }
        int res=0;
        for(Map.Entry<Integer,Integer> set:map.entrySet())
        {
            res+=set.getValue()/2;
        }
    return res;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	System.out.println("enter n");
        int n = scanner.nextInt();
        

        int[] ar = new int[n];

System.out.println("enter elements");
        for (int i = 0; i < n; i++) {
          ar[i]=scanner.nextInt();
        }

        int result = sockMerchant(n, ar);

       System.out.println("res :"+result);

       

        scanner.close();
    }
}

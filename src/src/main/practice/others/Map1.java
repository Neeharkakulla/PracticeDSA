package src.main.practice.others;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
        int res=0,max=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++)
        {
           
             if(!map.containsKey(arr.get(i))){ 
            for(int j=i,count=0;j<arr.size();j++)
            {
               
                    if(arr.get(i)==arr.get(j)){
                        count++;
                        if(max<count){
                        max=count;
                        res=arr.get(i);
                         }
                        map.put(arr.get(i),count);
                    }
                    if(count==0)
                         map.put(arr.get(i),1);
                   
            }
                
            }
        } 
        
        
        return res;
        }

    

    public static void main(String[] args) throws IOException {
        
    	List<Integer> arr=new ArrayList<>();
        int result = migratoryBirds(arr);
        System.out.println(result);

      
    }
}

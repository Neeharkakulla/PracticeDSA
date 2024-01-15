 package src.main.practice.others;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Test
{

	public static List<Integer> getResult(List<String> dic,List<String> que) {
		
		List<Integer> res=new ArrayList<>();
		Map<String,Integer> map=new HashMap<>();
		for(String q:que)
		{
			int count=0;
			char cq[]=q.toCharArray();
			Arrays.sort(cq);
			if(map.containsKey(String.valueOf(cq)))
			{
				res.add(map.get(String.valueOf(cq)));
			}else {
				for(String d:dic)
				{
					char cd[]=d.toCharArray();
					if(d.length()==q.length()) {
					Arrays.sort(cd);
					if(Arrays.equals(cq, cd))
						count++;
					}
					
				}
				map.put(String.valueOf(cq), count);
				res.add(count);
			}
		}
		
		
		return res;
	}
	
}
public class Anagram {

	public static void main(String[] args) {
		Instant start = Instant.now();
		List<Integer> result=new ArrayList<>();
		List<String> dic=new ArrayList<>();
		List<String> que=new ArrayList<>();
		dic.add("cold");
		dic.add("dolc");
		dic.add("heater");
		dic.add("reheat");
		dic.add("coldbbbbbdddddjjjjjooooosdsfsdfslkdfj");
		que.add("coldbbbbbdddjjjjjddooooosdsfsdfslkdfj");
		que.add("heater");
		que.add("coldbbbbbdddddjjjjjooooodssfsdfslkdfj");
		que.add("coldbbbbbdddddjjjjoojooosdsfsdfslkdfj");
		for(int i=0;i<10000;i++)
			dic.add("coldbbbbbdddddjjjjjooooosdsfsdfslkdfj");
		
		result=Test.getResult(dic,que);
		for(int res:result)
			System.out.print(res+" ");
	
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println(" \n time: "+timeElapsed.toMillis());
		

	}

}

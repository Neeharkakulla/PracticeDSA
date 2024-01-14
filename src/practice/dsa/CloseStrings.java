package practice.dsa;

import java.util.Arrays;

public class CloseStrings {
public static void main(String[] args) {
	Solution_3 solution_3=new Solution_3();
	System.out.println(solution_3.closeStrings("cabbba", "abbccc"));
}
}

class Solution_3 {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
            return false;
        int freq1[]=new int[26];
         int freq2[]=new int[26];
        for(int i=0;i<word1.length();i++){
            freq1[word1.charAt(i)-'a']++;
            freq2[word2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((freq1[i]==0&&freq2[i]>0)||(freq1[i]>0&&freq2[i]==0))
                return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i=25;i>=0;i--){
            if(freq1[i]==0)
                break;
            if(freq1[i]!=freq2[i])
            return false;
        }
        return true;
    }
}

import java.util.HashMap;
import java.util.Map;

public class Leetcode383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hm1 = new HashMap<Character,Integer>();
        Map<Character, Integer> hm2 = new HashMap<Character,Integer>();

        for(char c : ransomNote.toCharArray()){
            int cnt = 1;
            if(hm1.containsKey(c))
                cnt += hm1.get(c);
            hm1.put(c,cnt);
        }

        for(char c : magazine.toCharArray()){
            int cnt = 1;
            if(hm2.containsKey(c))
                cnt += hm2.get(c);
            hm2.put(c,cnt);
        }

        for(char c : hm1.keySet()){
            if(hm2.containsKey(c)){
                if(hm1.get(c) <= hm2.get(c))
                    continue;
                else
                    return false;
            }
            else{
                return false;
            }
        }

        return true;
    }
}

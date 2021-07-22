import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode146 {

    private int capacity;
    private List<Integer> lst = new ArrayList<Integer>();
    private Map<Integer,Integer> hm = new HashMap<Integer, Integer>();

    public Leetcode146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if(hm.containsKey(key)){
            lst.remove(lst.indexOf(key));
            lst.add(0,key);
            return hm.get(key);
        }
        else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(this.capacity <= hm.size()){
            if(hm.containsKey(key)){
                lst.remove(lst.indexOf(key));
            }
            else{
                hm.remove(lst.get(this.capacity-1));
                lst.remove(this.capacity-1);

            }
            lst.add(0,key);
            hm.put(key, value);
        }
        else{
            if(hm.containsKey(key)){
                lst.remove(lst.indexOf(key));
            }
            hm.put(key, value);
            lst.add(0,key);
        }
    }
}

package new1;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    private HashMap<Integer,Node> map;
    private LinkedList cache;
    private int cap;
    public LRUCache(int cap){
        this.cap=cap;
        map=new HashMap<>();
        cache=new LinkedList();
    }
    public int get(int key){
        if (!map.containsKey(key))
             return -1;
        int val=map.get(key).val;
        put(key,val);
        return val;
    }
    public void put(int key,int val){
        Node x= new Node(key,val);
        if (map.containsKey(key)){
            cache.remove(map.get(key));
            cache.addFirst(x);
            map.put(key,x);
        }
        else {
            if (cap==cache.size()){
                Node last= (Node) cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(x);
            map.put(key,x);
        }
    }
}

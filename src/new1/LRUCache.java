package new1;

import java.util.HashMap;
import java.util.LinkedList;

public class LRUCache {
    class Node {
        public int key,val;
        public new1.Node next,prev;
        public Node(int k,int v){this.key=k;this.val=v;}
    }
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
        }
        else {
            if (cap==cache.size()){
                Node last= (Node) cache.removeLast();
                map.remove(last.key);
            }
        }
        cache.addFirst(x);
        map.put(key,x);
    }
}

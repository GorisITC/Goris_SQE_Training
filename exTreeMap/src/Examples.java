import java.util.Map;
import java.util.TreeMap;

public class Examples {
    public static void main(String[] args) {
        Map<Integer, Object> treeMap=new TreeMap<Integer, Object>();
        treeMap.put(1,"Arus");
        treeMap.put(5, "Varditer");
        treeMap.put(3,null);
        treeMap.put(2,15);
        treeMap.put(4,null);
        System.out.println(treeMap);
    }
}

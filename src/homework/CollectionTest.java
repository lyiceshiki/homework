package homework;
import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        //int[] numbers = new int[]{};
        List<Number> l1 = new ArrayList<>();//大写Number所有数字类型（如 Integer, Double, Float, Long, Short, Byte 等）的父类，后面<>为空意思是跟前面一样

        List<List<?>> l2 = new ArrayList<>();
        //Node<E> 是节点
        List<?> l3 = new LinkedList<>();

        Set<String> s = new HashSet<>();
        //HashSet不允许重复
        s.add("a");
        s.add("a");
        System.out.println(s.size());

        Map<String,String> m1 = new HashMap<>();
        m1.put("1", "123");
        m1.put("1", "456");
        System.out.println(m1.get("1"));

        
            
    



    }

}

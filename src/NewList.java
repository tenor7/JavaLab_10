import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NewList<E> {
    public List<E> list = new LinkedList();
    public List<E> ToList(String[] list1) {
        for(int i=0;i< list1.length; i++){
            list.add((E) list1[i]);
        }
        return list;
    }
    public List<E> ToList(Integer[] list1) {
        for(int i=0;i< list1.length; i++){
            list.add((E) list1[i]);
        }
        return list;
    }
}
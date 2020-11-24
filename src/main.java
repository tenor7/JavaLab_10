import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String [] args){
        Integer [] str = {1,2,3,4,5};
        String [] str1 = {"a","b","c","d","e"};
        List list = new NewList<>().ToList(str);
        System.out.println(list);
        List list1 = new NewList<>().ToList(str1);
        System.out.println(list1);
    }
}
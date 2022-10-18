import java.util.ArrayList;
import java.util.List;

// sorting array list
public class SortList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        List<String> list2 = new ArrayList<>();
        list2.add("2");

        List<String> strings = new ArrayList<>(list);
        strings.addAll(list2);
        System.out.println(strings);
    }
}

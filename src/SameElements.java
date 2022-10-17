import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Same elements in arrays
public class SameElements {
    public static void main(String[] args) {
        Integer[] a1 = {1,2,3,2,1};
        Integer[] a2 = {1,2,3};
        Integer[] a3 = {1,2,3,4};

        System.out.println(sameElement(a1, a2));
        System.out.println(sameElement(a1, a3));
    }

    static boolean sameElement(Object[] array1, Object[] array2) {
        Set<Object> object1 = new HashSet<>(Arrays.asList(array1));
        Set<Object> object2 = new HashSet<>(Arrays.asList(array2));

        if (object1.size() != object2.size()) {
            return false;
        }

        for (Object o : object1) {
            if (!object1.contains(o)) {
                return false;
            }
        }
        return true;
    }
}

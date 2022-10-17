// binary search
public class BinarySearch {
    public static void main(String[] args) {
//        binarySearch(23,34,34,34,35,45,34);
    }

    public static int binarySearch(int[]i, int l, int h, int k) {
        int m = (l+h)/2;
        while (l <= h) {
            if (i[m]<k) {
                l=m+1;
            } else if (i[m]==k) {
                return m;
            }else{
                h=m-1;
            }
            m=(l+h)/2;
        }
        if (l>h) {
            return -1;
        }
        return -1;
    }
}

/*Variable Identify in this java problem.*/
// m = mid
// l = low
// h = high
// k = key
// i = int array
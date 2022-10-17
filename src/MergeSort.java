// Array merge sort
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 70, 50, 30, 10, 20, 40, 60 };

        int[] merged = mergeSort(arr, 0, arr.length - 1);

        for (int val : merged) {
            System.out.print(val + " ");
        }
    }

    public static int[] mergeTwoSortedArrays(int[] one, int[] two){
        int[] sort = new int[one.length+ two.length];
        int i=0;
        int j=0;
        int k=0;
        while (i < one.length && j < two.length) {
            if (one[i]<two[j]) {
                sort[k] = one[i];
                k++;
                i++;
            }else{
                sort[k]=two[j];
                k++;
                j++;
            }
        }
        if (i== one.length) {
            while (i < one.length) {
                sort[k] = one[i];
                k++;
                i++;
            }
        }
        return sort;
    }
    public static int[] mergeSort(int[] arr, int lo, int hi) {

        if (lo == hi) {
            int[] br = new int[1];
            br[0] = arr[lo];

            return br;
        }

        int mid = (lo + hi) / 2;

        int[] fh = mergeSort(arr, lo, mid);
        int[] sh = mergeSort(arr, mid + 1, hi);

        int[] merged = mergeTwoSortedArrays(fh, sh);

        return merged;
    }
}

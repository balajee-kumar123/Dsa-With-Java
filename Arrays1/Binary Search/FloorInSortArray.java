import java.util.Arrays;
public class FloorInSortArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,4,10,10,12,19};
        Arrays.sort(arr);
        int lo = 0, hi = arr.length-1, m = 0;
        int target = 4 ,indx = -1;
        while(lo<=hi) {
            m = (lo+hi)/2;
            // if (arr[m] == target) {
            //     indx = m;
            //     lo = m+1;
            // }
            if (arr[m]<=target) {
                lo = m + 1;
                indx = m;
            }
            else {
                hi = m-1;
            }
        

        }
        System.out.println(indx);
    }
}
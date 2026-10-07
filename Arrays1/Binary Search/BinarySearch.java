import java.util.Arrays;
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {23,43,456,43,4343,43,4,4,3,434,3,434,43,34,5,54,566556,56,5,45,4,56,56,56,4,6,5,6,56,65};
        Arrays.sort(arr);
        int lo = 0, hi = arr.length-1,m=0;
        int target = 34;
        boolean found = false;
        while(lo<=hi) {
            m = (lo + hi)/2;
            
            if(arr[m]>target) {
                hi = m-1;
            }
            else if (arr[m]< target ) {
                lo = m+1;
            }
            else if(target == arr[m]){
                System.out.println("Target found: "+ target);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Target not Found");
        }
               
    }
}
public class SearchInReverseArray { 
    public static void main(String[] args) {
        int[] arr = {98,87,76,54,52,43};
        int lo =0, hi = arr.length-1, m=0;
        int target = 86;
        boolean found =false;
        while( lo<=hi) {
            m = (lo+hi)/2;
            if (arr[m] == target) {
                System.out.println("Target Found");
                found = true;
                break;
            }
            else if (arr[m] > target) {
                lo = m+1;
            }
            else {
                hi = m-1;
            }
        }
        if (!found) {
            System.out.println("Target Not Found");            
        }

    }
}

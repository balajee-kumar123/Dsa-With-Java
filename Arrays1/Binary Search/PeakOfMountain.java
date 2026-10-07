public class PeakOfMountain {
    public static void main(String[] args) {
        int[] arr= {1,3,4,5,7,8,9,10,11,6,5,4,2};
        int lo = 1, hi =arr.length-2,m=0;
        while(lo<=hi) {
            m = (lo+hi)/2;
            if (arr[m-1]<=arr[m]&& arr[m]>=arr[m+1]) {
                System.out.println("Peak Found at "+m+" = "+arr[m]);
                break;
            }
            else if (arr[m-1]<=arr[m]) {
                lo = m+1;
            }
            else {
                hi = m-1;
            }
        }
    }
}
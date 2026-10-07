import java.util.Arrays;
public class FindNegPos {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,3,2,3,4};
        Arrays.sort(arr);
        int lo = 0,hi= arr.length-1,m=0;
        int neg = 0,FirstPos = arr.length;
        while(lo<=hi) {
            m = (lo+hi)/2;
            if (arr[m]<0) {
                neg = m+1;
                lo=m+1;   
            }
            else {
                hi = m-1;
            }
                
            
            
        }
        lo = 0;hi= arr.length-1;
        while(lo<=hi) {
            m = (lo+hi)/2;
            if (arr[m]>0) {
                FirstPos = m;
                hi=m-1;   
            }
            else {
                lo = m+1;
            }
           
        }
        int pov = arr.length-FirstPos;
        if(pov>neg) System.out.println(pov);
        else System.out.println(neg);
        // System.out.println(neg);
        // System.out.println(arr.length-FirstPos);
    }
    
}

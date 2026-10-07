import java.util.Arrays;
public class BinarySearch1stOccurence {

    public static void main(String[] args) {
        int[] arr = {1,1,23,5,5,34,34,34,456};
        Arrays.sort(arr);
        int lo = 0, hi = arr.length-1,m=0,indx =-1;
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
                indx = m;
                hi = m - 1;

                
            }
        }
        System.out.println(indx);
        
        if (!found) {
            System.out.println("Target not Found");
        }
               
    }
}

// LAST OCCURENCE 

// import java.util.Arrays;
// public class BinarySearch1stOccurence {

//     public static void main(String[] args) {
//         int[] arr = {1,1,23,5,5,34,34,34,456};
//         Arrays.sort(arr);
//         int lo = 0, hi = arr.length-1,m=0,indx =-1;
//         int target = 34;
//         boolean found = false;
//         while(lo<=hi) {
//             m = (lo + hi)/2;
            
//             if(arr[m]>target) {
//                 hi = m-1;
//             }
//             else if (arr[m]< target ) {
//                 lo = m+1;
//             }
//             else if(target == arr[m]){
//                 System.out.println("Target found: "+ target);
//                 found = true; 
//                 indx = m;
//                 hi = m - 1;

                
//             }
//         }
//         System.out.println(indx);
        
//         if (!found) {
//             System.out.println("Target not Found");
//         }
               
//     }
// }
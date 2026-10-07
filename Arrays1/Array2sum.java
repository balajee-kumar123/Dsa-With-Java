import java.util.Arrays;
public class Array2sum {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,7,8,9,8,3,5,4,12,32,65};
        int target = 6;
        Arrays.sort(arr);
        int i = 0, j= arr.length - 1;   
        boolean found = false;
        while (i<j) {
            int total = arr[i] + arr[j];
            if (arr[i] + arr[j] == target) {
                System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                found = true;
                i++;
                j--;
                
            }
            else if (total>target) {
                    j--;
            }
            else {
                    i++;
            }   
        }
        if (!found) {
            System.out.println("Target not Found");
            
        }
    }
}

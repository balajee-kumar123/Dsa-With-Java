import java.util.ArrayList;
import java.util.Arrays;
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,7,8,9,1,10,12};
        int[] arr2 = {2,5,7,8,12,10,4,9};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i<arr.length && j<arr2.length) {
            if (arr[i] == arr2[j]){
                ans.add(arr[i]);
                j++;
                i++;
                
            }
            else if (arr[i]>arr2[j]) {
                j++;
            }
            else if (arr[i]<arr2[j]) {
                i++;
            }
        }
        for (int ele: ans) {
            System.out.print(ele + " ");
        }
    }
}
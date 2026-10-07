
public class ArraySelectionSort {
    public static void main(String[] args) {
        int[] arr = {43,-4,3,254,67,54,96,043,65};
        for (int i = 0;i<arr.length-1;i++) {
            int min = Integer.MAX_VALUE , mindex = 0;
            for (int j = i; j<arr.length;j++){
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] =  arr[mindex];
            arr[mindex] = temp;
        }
        for(int ele : arr) {
            System.out.print(ele + " ");
        }


    }
    
}

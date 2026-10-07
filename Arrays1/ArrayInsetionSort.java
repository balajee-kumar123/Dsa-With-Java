public class ArrayInsetionSort {
    public static void main(String[] args) {
        int[] arr = {2,45,6,743,456546,675,7,5,75,6,6746,5,676,756,7,5,6574,5,6576,56,768,78,7,86}; 
        for (int i =1;i <arr.length;i++) {
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){ 
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
}
    


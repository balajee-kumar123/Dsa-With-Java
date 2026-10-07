public class ArrayBubbleSort {
    public static void main(String[] args) {
        int[] arr = {32,43,21,1,23,48,78,9,05,6,87};
        for (int i = 0; i < arr.length; i++) {
            int swap = 0;
            for (int j = 0; j<arr.length-1-i;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;

                }
             }
             if (swap == 0) break;
        }
        for (int ele:arr) {
            System.out.print(ele +" ");
        }
    }
    
}

// BUBBLE SORT (REVERSE)

// public class ArrayBubbleSort {
//     public static void main(String[] args) {
//         int[] arr = {32,43,21,1,23,48,78,9,05,6,87};
//         for (int i = 0; i < arr.length; i++) {
//             int swap = 0;
//             for (int j = 0; j<arr.length-1-i;j++) {
//                 if (arr[j] < arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swap++;

//                 }
//              }
//              if (swap == 0) break;
//         }
//         for (int ele:arr) {
//             System.out.print(ele +" ");
//         }
//     }
    
// }


public class ArrayMoveAllZerosend {
    public static void main(String[] args) {
        int[] arr = {2,4,5,0,5,7,0,3,56,0,65,0,0,25};
        for (int i = 0; i < arr.length; i++) {
            int swap = 0;
            for (int j = 0; j<arr.length-1-i;j++) {
                if (arr[j] ==0) {
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
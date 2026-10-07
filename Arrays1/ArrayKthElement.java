public class ArrayKthElement {
    

    public static void main(String[] args) {
        int[] arr = {43,-4,3,254,67,54,96,43,65};
        int Kth = 4;
        for (int i = 0;i<Kth;i++) {
            int min = Integer.MAX_VALUE , mindex = 0;
            for (int j = i; j<9;j++){
                if (arr[j] < min) {
                    min = arr[j];
                    mindex = j;
                }
            }
            int temp = arr[i];
            arr[i] =  arr[mindex];
            arr[mindex] = temp;
            // System.out.println(arr[i]);
        }
        
        System.out.print(Kth+"th Element "+arr[Kth-1]);
        for(int ele:arr) {
                System.out.println(ele);
        }
        


    }
    
}



class  ArrayTwoPointerReverse {
    public static void main(String[] args) {
        int[] arr = {4,6,10,123,11,23,54,98,99};
        // for (int i = (arr.length-1); i>-1;i--) {
        //     System.out.println(arr[i]);
        // }
        int n = arr.length;
        int i = 0, j = n-1;
        while (i<j){
            int temp = arr[i];   //Two pointer technique
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
        for(int ele :arr){
            System.out.println(ele);
        }
    } 
}
    

public class ArraySecLargest {
    public static void main(String[] args) {
        int[] arr = {4,6,10,123,11,23,54,98};
        int largest = arr[0];
        int largest2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
                largest = arr[i];   
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (largest2<arr[i] && arr[i] !=largest) {
                largest2 = arr[i];
                 
            }
        
        }
        
        System.out.println("2nd largest no. " + largest2);
        System.out.println("largest no. " + largest);
        
    }
    
}

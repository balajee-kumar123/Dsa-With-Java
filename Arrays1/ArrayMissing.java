public class ArrayMissing {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        long n = arr.length + 1;
        long sum = n*(arr[0]+arr[arr.length-1])/2;
        long arraysum = 0;
        for (int ele:arr) {
            arraysum += ele;
        }
        System.out.println("missing no. = " + (sum - arraysum));
    }
    
}

public class ArrayWave {
    public static void main(String[] args) {
        int[] arr = {21,23,45,65,67,76,78,89,90 };

        for (int i = 0;i<arr.length - 1;i+=2) {
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        for(int ele:arr) {
            System.out.print(ele+" ");

        }
    }
}
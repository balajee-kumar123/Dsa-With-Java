public class ArrayTwoSum {
    public static void main(String[] args) {
        int[] arr = {1,4,7,8,9,5,10};
        int target =15; 
        for(int i = 0;i<arr.length;i++) {
            for(int j =i+1; j<arr.length;j++){
                System.out.println("i = " + i +" j = "+j );
                if(arr[i] + arr[j] == target){

                    System.out.println(arr[i]+" + "+arr[j]+" = " + (arr[i]+arr[j]));
                    // System.out.println("j = "+j);

                }
            
            }
        }
    }
}


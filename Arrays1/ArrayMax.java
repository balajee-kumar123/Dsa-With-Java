import java.util.Scanner;
public class ArrayMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] x = {};
        // System.err.println(x);
        System.out.print("How many elements do You want to add to the Array: ");
        int y = sc.nextInt();
        int[] arr = new int[y];

        System.out.println("Please Enters " + y + " elements to the Array");
        for (int i= 0; i<y; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i= 0; i<y; i++) {
            if (max < arr[i])  max = arr[i];
        }
        System.out.println("Max no. = " + max);
        sc.close();         
    }
}


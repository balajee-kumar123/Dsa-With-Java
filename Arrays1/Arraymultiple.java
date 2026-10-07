import java.util.Scanner;
public class Arraymultiple {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int z = sc.nextInt();
        int[] x = new int[z];

        System.out.print("Please Enters "+ z + " elements: ");
        for (int i = 0; i<z; i++) {
            x[i] = sc.nextInt();
        }
        int j = 1;
        for (int i = 0; i<z; i++) {
            j*= x[i];

        }
        System.out.print("Sum of Elements of an Array : "+ j);


    sc.close();
    }

    
}

    


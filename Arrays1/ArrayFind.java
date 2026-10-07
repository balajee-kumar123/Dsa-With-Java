import java.util.Scanner;
public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number Which you want to Find in Array: ");
        int y = sc.nextInt();
        int[] x = {33,45,43,34,46,76,7,84,4};

        boolean Found = false;
        for (int i = 0; i<x.length;i++) {
            if (x[i] == y) {
                System.out.println("Founded "+ " at index "+ i );
                Found = true;
                break;

            }
        }
        if(!Found) {
            
            System.out.println("Not found!");
         }
        sc.close();
    }
        
        
} 
    


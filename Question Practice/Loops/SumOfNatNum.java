import java.util.Scanner;
public class SumOfNatNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = num;i>=1;i--) {
            sum = sum +i;
        }
        System.out.print(sum);
        sc.close();
    }
    
}

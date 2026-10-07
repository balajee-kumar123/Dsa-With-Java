
public class Factorial12 {
    public static void main(String[] args) {
        int number = 20;
        long result = factorial1(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
    public static long factorial1(int num) {
        long fac = 1;
        for(int i = 1; i <=num;i++) {
            fac = fac * i;
        }
        return fac;
    }
}

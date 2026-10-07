public class FactorsOfNum {

    public static void main(String[] args) {
        long num = 484476742;
        for (long i = 1; i<=num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
public class BinomialCoefficient {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int BionomialCoefficient(int N, int R) {
        int n_factorial = factorial(N);
        int r_factorial = factorial(R);
        int NminusR_factorial = factorial(N - R);
        int result = n_factorial / (r_factorial * NminusR_factorial);
        return result;
    }

    public static void main(String args[]) {
        System.out.println(BionomialCoefficient(5,2));
    }
}

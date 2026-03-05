public class PrimeInARange {
      public static boolean isPrime(int n) {
        // corner case
        if (n == 2) {
            return true;
        }
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void primeInRange(int n){
        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        primeInRange(20);
    }
}

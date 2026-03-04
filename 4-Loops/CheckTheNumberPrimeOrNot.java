import java.util.*;

public class CheckTheNumberPrimeOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number :- ");
        int number = sc.nextInt();
        if (number == 2) {
            System.out.println("Number is Prime.");
        } else {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println("Number is Prime.");
            } else {
                System.out.println("Number is Not Prime.");
            }
        }

    }
}

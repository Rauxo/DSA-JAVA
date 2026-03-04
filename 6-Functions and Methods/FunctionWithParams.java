import java.util.*;

public class FunctionWithParams {

    public static int calculateSum(int a, int b) {

        return a + b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :- ");
        int a = sc.nextInt();
        System.out.println("Enter b :- ");
        int b = sc.nextInt();
        calculateSum(a, b);
    }
}
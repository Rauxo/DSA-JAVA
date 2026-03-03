public class TernaryOperator {

    public static void main(String args[]){
        // variable = condition ? statement 1 : statement 2;

        // int a = 10;
        // int result = a == 10 ? a = ++a : a;
        // System.out.println(result);

        int number = 11;
        String type = ((number%2) == 0) ? "Even" : "Odd";
        System.out.println(type);

    }
}
public class TernaryOperator {

    public static void main(String args[]){
        // variable = condition ? statement 1 : statement 2;

        int a = 10;
        int result = a == 10 ? a = ++a : a;
        System.out.println(result);
    }
}
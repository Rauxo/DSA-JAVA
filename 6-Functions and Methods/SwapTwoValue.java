public class SwapTwoValue {

    public static void swapValue(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A is = " + a);
        System.out.println("B is = " + b);
    }

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        swapValue(a, b);
    }
}
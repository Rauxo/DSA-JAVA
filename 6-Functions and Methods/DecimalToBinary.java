public class DecimalToBinary {
    public static void decimalToBinary(int n){
        int pow = 0 ;
        int binary = 0;
        int myNum = n;

        while(n > 0){
            int remainder = n % 2;
            binary = binary + (remainder * (int)Math.pow(10,pow));

            pow++;
            n = n/2;
        }
        System.out.println("Binary form of " + myNum + " is " + binary);
    }
    public static void main(String args[]){
        decimalToBinary(25);
    }
}

public class BinaryToDecimal {

    public static void binaryToDec(int binaryNum){
        int pow = 0;
        int decimalNum = 0;

        while(binaryNum > 0){
            int lastDigit = binaryNum % 10 ;
            decimalNum = decimalNum + (lastDigit * (int)Math.pow(2,pow));

            pow++;
            binaryNum = binaryNum / 10;
        }
        System.out.println("Decimal Number is :- " + decimalNum);
    }
    public static void main(String args[]){
        binaryToDec(101);
    }
}

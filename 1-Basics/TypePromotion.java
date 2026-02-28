//Java automatically promotes each bytes , short , or char operand to int when evaluating an expression
public class TypePromotion {

    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        System.out.println(b-a); // result 1
    }
}
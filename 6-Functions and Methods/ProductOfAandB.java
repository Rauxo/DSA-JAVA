import java.util.*;
public class ProductOfAandB {

    public static int Product(int num1 , int num2){
        int product = num1 * num2 ;
        return product;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first Number :- ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :- ");
        int num2 = sc.nextInt();
        int prod =Product(num1, num2);
        System.out.println("The Result is :- "+ prod);
    }
}

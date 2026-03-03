import java.util.*;
public class PrintTheLargestOfTwo {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Value");
        int a = sc.nextInt();
        System.out.println("Enter B Value");
        int b = sc.nextInt();

        if(a > b ){
            System.out.println("A is the largest");
        }else{
            System.out.println("B is the Largest");
        }
    }
}
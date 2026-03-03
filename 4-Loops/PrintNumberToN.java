import java.util.*;
public class PrintNumberToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :- ");
        int number = sc.nextInt();
        int count = 1;
        while(count <= number){
            System.out.println(count);
            count++;
        }
    }
}

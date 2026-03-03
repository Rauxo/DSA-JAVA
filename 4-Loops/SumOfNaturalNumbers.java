import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :- ");
        int N = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count <= N){
            sum=sum+count;
            count++;
        }
        System.out.println(sum);
    } 
}

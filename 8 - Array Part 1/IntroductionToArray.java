import java.util.*;
public class IntroductionToArray {
    public static void main(String args[]) {
        // create : dataType arrayName[] = new dataType[size]
        int marks[] = new int[50];

        int numbers[] = {1,2,3} ;
        String fruits[] = {"apple","mango"};

        //input in an Array
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt(); 
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        //output
        System.out.println("Physics : " + marks[0]);
        System.out.println("Math : " + marks[1]);
        System.out.println("Chem : " + marks[2]);
    }
}

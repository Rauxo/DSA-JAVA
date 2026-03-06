import java.util.*;
public class LargestInArray {

    public static int findLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 12, 32, 12, 45, 6, 78, 87, 9, 11 };
        int result = findLargest(numbers);
        System.out.println("The Largest Number is :- " + result);
    }
}

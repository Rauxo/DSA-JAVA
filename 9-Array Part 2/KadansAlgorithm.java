public class KadansAlgorithm {
    public static void kadansAlgorithm(int numbers[]) {
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            current_sum += numbers[i];
            if (current_sum < 0) {
                current_sum = 0;
            }
            // if (max_sum < current_sum) {
            //     max_sum = current_sum;
            // }
            max_sum = Math.max(current_sum, max_sum); //compare max
        }
        System.out.println("Maximum Subarray sum is :- " + max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadansAlgorithm(numbers);
    }
}

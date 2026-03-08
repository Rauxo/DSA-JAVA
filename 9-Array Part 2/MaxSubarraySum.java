public class MaxSubarraySum {
    public static void maximunSubarraySum(int numbers[]) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                curr_sum = 0;
                for (int k = i; k <= j; k++) {
                    // subarray sum
                    curr_sum += numbers[k];
                }
                System.out.println(curr_sum);
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        System.out.println("The Maximum Subarray Sum is :- " + max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maximunSubarraySum(numbers);
    }
}
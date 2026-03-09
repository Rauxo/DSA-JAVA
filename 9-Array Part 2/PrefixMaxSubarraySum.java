public class PrefixMaxSubarraySum {
    public static void maxSuarraySum(int numbers[]) {
        int sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (sum < curr_sum) {
                    sum = curr_sum;
                }
            }
        }
        System.out.println("maximum sum is :- " + sum);
    }

    public static void main(String args[]) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSuarraySum(numbers);
    }
}

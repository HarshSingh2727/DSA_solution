class Solution {

    public boolean checkPrimeFrequency(int[] nums) {

        // Find maximum value
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Create hash array using max value
        int[] hash = new int[max + 1];

        // Store frequencies
        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;
        }

        // Check if any frequency is prime
        for (int i = 0; i < hash.length; i++) {
            if (isPrime(hash[i])) {
                return true;
            }
        }

        return false;
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
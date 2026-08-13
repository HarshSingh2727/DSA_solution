class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int position = nums.length - 1;

        int[] ans = new int[nums.length];

        while (left <= right) {

            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[position] = nums[left] * nums[left];
                left++;
            } 
            else {
                ans[position] = nums[right] * nums[right];
                right--;
            }

            position--;
        }

        return ans;
    }
}
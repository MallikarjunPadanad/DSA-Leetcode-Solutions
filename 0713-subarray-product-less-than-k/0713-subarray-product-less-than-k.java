class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1, start = 0, end = 0, count = 0;
        while (end < nums.length) {
            product *= nums[end];

            while (product >= k && start <= end) {
                product /= nums[start];
                start++;
            }
            count += (end - start) + 1;
            end++;
        }
        return count;
    }
}
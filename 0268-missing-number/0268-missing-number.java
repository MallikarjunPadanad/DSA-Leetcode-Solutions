class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] < n && nums[i] != nums[nums[i]]) {
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i) return i;
        }
        return n;
    }
}
import java.util.Arrays;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningTotal = {0};

        return Arrays.stream(nums)
                .map(n -> runningTotal[0] += n)
                .toArray();
    }
}
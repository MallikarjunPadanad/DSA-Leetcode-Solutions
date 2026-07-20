class Solution {
    public int majorityElement(int[] nums) {
        // int n = nums.length;

        // int element = 0;
        // int count = 0;

        // for (int i = 0; i < n; i++) {
        //     if (count == 0) {
        //         count = 1;
        //         element = nums[i];
        //     } else if (nums[i] == element) {
        //         count++;
        //     } else {
        //         count--;
        //     }
        // }

        // int ans = 0;
        // for (int j = 0; j < n; j++) {
        //     if (element == nums[j]) {
        //         ans++;
        //     }
        // }

        // if (ans > (n / 2)) {
        //     return element;
        // }

        // return -1;

        int element = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                element = num;

            count += (num == element) ? 1 : -1;

        }

        int freq = 0;
        for (int num : nums) {
            if (num == element) {
                freq++;
            }
        }

        if (freq > nums.length / 2) {
            return element;
        }

        return -1;

    }
}
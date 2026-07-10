class Solution {
    private static final int[] NOT_FOUND = {-1, -1};

    public int[] twoSum(int[] arr, int target) {
        // Precondition: arr must be sorted in ascending order
        if (arr == null || arr.length < 2) {
            return NOT_FOUND;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            long sum = (long) arr[left] + arr[right]; // avoid overflow

            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return NOT_FOUND;
    }
}
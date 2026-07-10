class Solution {
    /**
     * Removes duplicates from a sorted array in-place, such that each unique
     * element appears only once. Returns the count of unique elements.
     *
     * Approach: Two Pointers (Slow & Fast)
     * ------------------------
     * Since the array is sorted, duplicates are always adjacent. We use:
     *   - 'slow' pointer: tracks the position of the last unique element.
     *   - 'fast' pointer: scans ahead to find the next unique element.
     *
     * Whenever arr[fast] differs from arr[slow], it means we've found a new
     * unique value, so we move 'slow' forward and copy that value into place.
     *
     * This avoids using extra space — we overwrite duplicates directly within
     * the original array instead of creating a new one.
     *
     * Time Complexity:  O(n) — each element is visited once by 'fast'.
     * Space Complexity: O(1) — modifies the array in-place, no extra space.
     */
    public int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int slow = 0;
        int fast = 1;

        while (fast < arr.length) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }
            fast++;
        }

        // slow is the index of the last unique element, so count = slow + 1
        return slow + 1;
    }
}
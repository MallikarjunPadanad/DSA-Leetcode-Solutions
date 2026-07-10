class Solution {
    /**
     * Returns the number of trailing zeroes in n! (factorial of n).
     *
     * Approach: Count factors of 5
     * ------------------------
     * A trailing zero is produced by a factor of 10 = 2 * 5 in n!.
     * Since factors of 2 are always more abundant than factors of 5
     * (every even number contributes a 2, but only every 5th number
     * contributes a 5), the number of trailing zeroes is determined
     * entirely by how many times 5 divides into n!.
     *
     * Numbers like 25, 125, 625... contribute more than one factor of 5
     * (25 = 5*5, 125 = 5*5*5), so we must count contributions from every
     * power of 5, not just multiples of 5.
     *
     * We sum n/5 + n/25 + n/125 + ... until powerOf5 exceeds n.
     *
     * Time Complexity:  O(log₅ n) — powerOf5 grows exponentially.
     * Space Complexity: O(1).
     */
    public int trailingZeroes(int n) {
        int res = 0;
        long powerOf5 = 5; // use long to avoid overflow for large n

        while (n >= powerOf5) {
            res += (int) (n / powerOf5);
            powerOf5 *= 5;
        }

        return res;
    }
}
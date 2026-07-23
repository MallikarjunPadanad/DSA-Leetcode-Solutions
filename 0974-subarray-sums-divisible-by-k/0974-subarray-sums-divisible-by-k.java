class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int total = 0;
        for (int num : nums) {
            prefixSum += num;

            int rem = ((prefixSum % k) + k) % k;
            total += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);

        }

        return total;
    }
}
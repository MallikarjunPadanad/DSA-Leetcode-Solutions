class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        boolean[] count = new boolean[256];
        int first = 0 , second = 0, len = 0;
        while(second < n){
            while(count[s.charAt(second)]){
                count[s.charAt(first)] = false;
                first++;
            }
        
        count[s.charAt(second)] = true;
        len = Math.max(len,second-first+1);
        second++;
        }
        return len;
    }
}
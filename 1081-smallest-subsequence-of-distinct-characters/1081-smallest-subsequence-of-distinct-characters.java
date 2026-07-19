class Solution {
    public String smallestSubsequence(String text) {
        int[] last = new int[26];
        for (int i = 0; i < text.length(); i++) {
            last[text.charAt(i) - 'a'] = i;
        }

        boolean[] inStack = new boolean[26];
        char[] stack = new char[26];
        int top = -1;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (inStack[c - 'a']) continue;

            while (top >= 0 && stack[top] > c && last[stack[top] - 'a'] > i) {
                inStack[stack[top]-- - 'a'] = false; 
                top--;
            }
            stack[++top] = c;
            inStack[c - 'a'] = true;
        }
        return new String(stack, 0, top + 1);
    }
}
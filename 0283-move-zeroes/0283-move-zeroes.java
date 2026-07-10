class Solution {
    public void moveZeroes(int[] arr) {
        int current = 0;
        int insertPos = 0; // tracks where the next non-zero element should go

        while (current < arr.length) {
            if (arr[current] != 0) {
                swap(arr, current, insertPos);
                insertPos++;
            }
            current++; // must be inside the loop, unconditionally
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
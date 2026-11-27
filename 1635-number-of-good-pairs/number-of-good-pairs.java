class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101]; // nums[i] is between 1 and 100

        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }

        return count;
    }
}
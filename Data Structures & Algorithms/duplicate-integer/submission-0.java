class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);

        // iterate through the array:
        // start at 0; nums.length-1; add1
        for (int i = 0; i < nums.length - 1; i++) {
            // ???
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
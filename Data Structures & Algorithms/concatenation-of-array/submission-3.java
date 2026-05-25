class Solution {
    public int[] getConcatenation(int[] nums) {
       // create "ans" int array:
       // get length of nums array:
       int n = nums.length;
       // use n length to double the nums elements in ans[]:
       int[] ans = new int[2 * n];
       
       // iterate throught the array and return the anwnser:
       for (int i = 0; i < nums.length; i++) {
        ans[i] = nums[i];
        ans[i + n] = nums[i];
       }
       return ans;
    }
}
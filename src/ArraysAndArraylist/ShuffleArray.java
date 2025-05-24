package ArraysAndArraylist;
//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleArray {
    public class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[2 * i] = nums[i];         // x_i
                ans[2 * i + 1] = nums[i + n]; // y_i
            }
            return ans;
        }
    }
}

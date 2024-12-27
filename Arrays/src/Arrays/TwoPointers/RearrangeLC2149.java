package Arrays.TwoPointers;

public class RearrangeLC2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int k = 0;
        int j = 1;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                ans[k] = nums[i];
                k = k + 2;
            } else {
                ans[j] = nums[i];
                j = j + 2;
            }
        }
        return ans;
    }
}

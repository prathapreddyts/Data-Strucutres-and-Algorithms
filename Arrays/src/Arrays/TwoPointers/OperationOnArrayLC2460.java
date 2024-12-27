package Arrays.TwoPointers;

public class OperationOnArrayLC2460 {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1] && nums[i] != 0) {
                nums[i] = 2 * nums[i];
                nums[i + 1] = 0;
            }
        }

        // Step 2: Move all non-zero elements to the front
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[idx] = nums[i];
                idx++;
            }
        }

        // Step 3: Fill the remaining positions with zeros
        for (int i = idx; i < n; i++) {
            nums[i] = 0;
        }

        return nums;

    }
}

package TwoPointers;

public class SortArrayByParityLC922 {

    public int[] sortArrayByParityII(int[] nums) {
        int odd = 1;
        int even = 0;
        int[] ret = new int[nums.length];
        for (int a : nums) {
            if (a % 2 == 0) {
                ret[even] = a;
                even += 2;
            } else {
                ret[odd] = a;
                odd += 2;
            }
        }
        return ret;
    }

    public int[] sortArrayByParityInPlace(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        while (i < n && j < n) {
            while (i < n && nums[i] % 2 == 0) {
                i += 2;
            }
            while (j < n && nums[j] % 2 == 1) {
                j += 2;
            }
            if (i < n && j < n) {
                swap(nums, i, j);
            }
        }
        return nums;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


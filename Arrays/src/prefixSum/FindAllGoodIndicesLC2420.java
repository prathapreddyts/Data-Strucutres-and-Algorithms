package prefixSum;

import java.util.*;

public class FindAllGoodIndicesLC2420 {
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;

        // Arrays to store the lengths of non-decreasing and non-increasing subarrays
        int[] nonDecreasingList = new int[n];
        int[] nonIncreasingList = new int[n];

        // Populate the non-decreasing lengths
        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                nonDecreasingList[i] = nonDecreasingList[i - 1] + 1;
            }
        }

        // Populate the non-increasing lengths
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                nonIncreasingList[i] = nonIncreasingList[i + 1] + 1;
            }
        }

        // Find all good indices
        for (int i = k; i < n - k; i++) {
            if (nonDecreasingList[i - 1] >= k - 1 && nonIncreasingList[i + 1] >= k - 1) {
                result.add(i);
            }
        }

        return result;
    }
}

package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] twoSumResultList = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                twoSumResultList[0] = i;
                twoSumResultList[1] = map.get(target - nums[i]);
            } else {
                map.put(nums[i], i);
            }
        }
        return twoSumResultList;
    }
    public int[] twoSumUsingTwoPointers(int[] nums, int target) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(temp);
        int i = 0, j = temp.length - 1;
        while (i < j) {  // Use i < j, as i == j isn't valid for two different indices
            if (temp[i] + temp[j] > target) {
                j--;
            } else if (temp[i] + temp[j] < target) {
                i++;
            } else {
                break; // Pair found
            }
        }
        int firstNumber = temp[i];
        int secondNumber = temp[j];
        int[] ans = new int[2];

        // Find the original indices of the numbers in the input array
        //We will search for the original number because we have sorted the arrat
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == firstNumber && ans[0] == 0) {
                ans[0] = k;  // Assign index of the first number
            } else if (nums[k] == secondNumber) {
                ans[1] = k;  // Assign index of the second number
            }
        }

        return ans;
    }
}

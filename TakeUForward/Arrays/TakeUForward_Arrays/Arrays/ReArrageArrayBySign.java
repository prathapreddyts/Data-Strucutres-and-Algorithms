package Arrays;

import java.util.ArrayList;

public class ReArrageArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        ArrayList<Integer> positiveList = new ArrayList<>();
        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i : nums) {
            if (i < 0) {
                negativeList.add(i);
            } else {
                positiveList.add(i);
            }
        }
        int posIndex = 0;
        int negative = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = positiveList.get(posIndex);
                posIndex++;
            } else {
                result[i] = negativeList.get(negative);
                negative++;
            }
        }
        return result;
    }

    /*
     * PosIdx=0 and negIdx=1
     * if number>0 store it posIdx and incremented by 2
     * else store it and increment the negIdx by 2

     * */
    public int[] rearrangeArrayOptimised(int[] nums) {
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

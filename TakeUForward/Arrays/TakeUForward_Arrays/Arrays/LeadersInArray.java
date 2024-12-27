package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {
    public ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }
        int max = nums[nums.length - 1];
        ans.add(nums[nums.length - 1]);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] > max) {
                //trick lies here we need that element which is greater than all the elements to its right before
                //assigning to max
                ans.add(nums[i]);

                max = nums[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}

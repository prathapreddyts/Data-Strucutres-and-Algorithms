package stacks.monotoinc;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement1LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] resultNGE = new int[nums1.length];
        int[] nge = new int[nums2.length];
        HashMap<Integer, Integer> ngeMap = getNGE(nums2);
        for(int i=0;i<nums1.length;i++){
            resultNGE[i] = ngeMap.get(nums1[i]);
        }
        return resultNGE;
    }

    public HashMap<Integer, Integer> getNGE(int[] nums) {
        int[] nge = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nge[i] = -1;
        }
        Stack<Integer> monotonicStack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!monotonicStack.isEmpty() && nums[monotonicStack.peek()] < nums[i]) {
                nge[monotonicStack.peek()] = nums[i];
                monotonicStack.pop();
            }
            monotonicStack.push(i);
        }
        HashMap<Integer, Integer> ngeMapper = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ngeMapper.put(nums[i], nge[i]);
        }
        return ngeMapper;
    }
}

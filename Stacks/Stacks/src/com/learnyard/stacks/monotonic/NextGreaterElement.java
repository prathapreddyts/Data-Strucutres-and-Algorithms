package com.learnyard.stacks.monotonic;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] resultList = new int[nums1.length];
        int[] nextGreaterElementList = nextGreaterElementPattern(nums2);
        HashMap<Integer, Integer> map = ngeListMap(nextGreaterElementList, nums2);
        for (int i = 0; i < nums1.length; i++) {
            resultList[i] = map.getOrDefault(nums1[i], -1);
        }
        return resultList;
    }

    public int[] nextGreaterElementPattern(int[] nums2) {
        int[] ngeList = new int[nums2.length];
        Stack<Integer> monotonicStack = new Stack<>();
        for (int i = 0; i < nums2.length; i++) {
            ngeList[i] = -1;
        }
        for (int i = 0; i < nums2.length; i++) {
            while (!monotonicStack.isEmpty() && nums2[i] > nums2[monotonicStack.peek()]) {
                ngeList[monotonicStack.pop()] = nums2[i];
            }
            monotonicStack.push(i);
        }
        return ngeList;
    }

    public HashMap<Integer, Integer> ngeListMap(int[] nge, int[] numsList) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numsList.length; i++) {
            map.put(numsList[i], nge[i]);
        }
        return map;
    }

}

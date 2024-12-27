package com.learnyard.stacks.monotonic;

import java.util.Stack;

public class NgeWithCircular {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> monotonicStack = new Stack<>();
        int[] nge = new int[nums.length];
        for(int i=0;i<nge.length;i++){
            nge[i] = -1;
        }

        for(int i=0;i<(2*nums.length)-1;i++){
            int item=nums[i%nums.length];
            while (!monotonicStack.isEmpty()&&nums[monotonicStack.peek()]<item){
                nge[monotonicStack.pop()]=item;
            }
            if(i<nums.length){
                monotonicStack.push(i);
            }
        }

        return nge;

    }
}

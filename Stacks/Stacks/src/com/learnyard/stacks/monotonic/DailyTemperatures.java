package com.learnyard.stacks.monotonic;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] resultNGE = new int[temperatures.length];
        Stack<Integer> monotonicStack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!monotonicStack.isEmpty() && temperatures[i] > temperatures[monotonicStack.peek()]) {
                int index = monotonicStack.pop();
                resultNGE[index] = i - index;
            }
            monotonicStack.push(i);
        }
        while (!monotonicStack.isEmpty()) {
            resultNGE[monotonicStack.pop()] = 0;
        }

        return resultNGE;
    }
}

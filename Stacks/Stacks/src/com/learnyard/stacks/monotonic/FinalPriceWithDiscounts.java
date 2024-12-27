package com.learnyard.stacks.monotonic;

import java.util.Stack;

public class FinalPriceWithDiscounts {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> monotonicStack = new Stack<>();
        for(int i=0;i<prices.length;i++){
            while (!monotonicStack.empty() && prices[monotonicStack.peek()]>=prices[i]){
                prices[monotonicStack.peek()]=prices[monotonicStack.peek()]-prices[i];
                monotonicStack.pop();
            }

                monotonicStack.push(i);

        }
        return prices;
    }
}

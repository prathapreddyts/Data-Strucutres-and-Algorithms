package stacks.monotoinc;

import java.util.Stack;

public class FinalPricesCalculatorLC1475 {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> monotonicStack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!monotonicStack.isEmpty() && prices[monotonicStack.peek()] >= prices[i]) {
                prices[monotonicStack.peek()] -= prices[i];
                monotonicStack.pop();
            }
            monotonicStack.push(i);
        }
        return prices;
    }
}

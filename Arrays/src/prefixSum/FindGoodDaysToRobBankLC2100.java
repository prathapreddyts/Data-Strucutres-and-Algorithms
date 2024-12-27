package prefixSum;

import java.util.ArrayList;
import java.util.List;

public class FindGoodDaysToRobBankLC2100 {
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int n = security.length;
        int[] left = new int[n];
        int[] right = new int[n];

        // Compute the left array (Previous Non-Increasing Count)
        for (int i = 1; i < n; i++) {
            if (security[i] <= security[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }

        // Compute the right array (Next Non-Decreasing Count)
        for (int i = n - 2; i >= 0; i--) {
            if (security[i] <= security[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        // Find all good days
        List<Integer> goodDays = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (left[i] >= time && right[i] >= time) {
                goodDays.add(i);
            }
        }

        return goodDays;
    }
}

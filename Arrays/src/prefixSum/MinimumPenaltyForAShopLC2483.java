package prefixSum;

public class MinimumPenaltyForAShopLC2483 {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] prefixN = new int[n + 1];
        int[] suffixY = new int[n + 1];

        for (int i = 1; i <= n; ++i) {
            prefixN[i] = prefixN[i - 1] + (customers.charAt(i - 1) == 'N' ? 1 : 0);
        }

        for (int i = n - 1; i >= 0; --i) {
            suffixY[i] = suffixY[i + 1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }
        int minPenalty = Integer.MAX_VALUE;
        int bestTime = 0;
        for (int i = 0; i <= n; ++i) {
            int penalty = prefixN[i] + suffixY[i];
            if (penalty < minPenalty) {
                minPenalty = penalty;
                bestTime = i;
            }
        }

        return bestTime; // Return 1-based index
    }

}

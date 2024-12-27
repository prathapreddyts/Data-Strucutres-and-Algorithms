package hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode1207 {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> uniqueValues = new HashSet<Integer>(map.values());
        if (uniqueValues.size() != map.size()) {
            return false;
        }
        return true;
    }
}

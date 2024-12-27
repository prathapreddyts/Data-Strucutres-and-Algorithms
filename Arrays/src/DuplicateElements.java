import java.util.*;

public class DuplicateElements {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> duplicateSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (duplicateSet.contains(nums[i])) {
                return true;
            }
            duplicateSet.add(nums[i]);
        }
        return false;
    }

    public List<Integer> findDuplicates(int[] nums) {
        boolean[] arr = new boolean[nums.length + 1];
        ArrayList<Integer> doublets = new ArrayList<>();
        for (int i : nums) {
            if (arr[i]) {
                doublets.add(i);
            } else {
                arr[i] = true;
            }
        }
        return doublets;
    }

    public boolean areOccurrencesEqual(String s) {
        int[] arr = new int[26];
        int frequenctCnt = 0;
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
            frequenctCnt = arr[c - 'a'];
        }
        for (int i : arr) {
            if (i != 0 && i != frequenctCnt) {
                return false;
            }
        }
        return true;
    }


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



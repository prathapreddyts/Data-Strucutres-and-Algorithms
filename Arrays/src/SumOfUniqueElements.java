import java.util.HashSet;
import java.util.Iterator;

public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> duplicateSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!duplicateSet.contains(nums[i])) {
                duplicateSet.add(nums[i]);
            }

        }
        int sum = 0;
        Iterator<Integer> iterator = duplicateSet.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        return sum;
    }

    public int sumOfUniqueHashing(int[] nums) {
        int[] arr = new int[101];
        for (int num : nums){
            arr[num]++;
        }
        int sum = 0;
        for (int num : nums){
            if (arr[num] == 1) sum += num;
        }

        return sum;
    }

}

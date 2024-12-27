package hashing;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode2295 {

    public int[] arrayChange(int[] nums, int[][] operations) {
        for (int i = 0; i < operations.length; i++) {
            int[] operation = operations[i];
            int start = operation[0];
            int end = operation[1];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == start) {
                    nums[j] = end;
                }
            }
        }
        return nums;
    }

    public int[] arrayChangeOptimised(int[] nums, int[][] operations) {

        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }

        for(int arr[]:operations){
            int idx=map.get(arr[0]);
            nums[idx]=arr[1];
            map.remove(arr[0]);
            map.put(arr[1],idx);
        }
        return nums;
    }
}

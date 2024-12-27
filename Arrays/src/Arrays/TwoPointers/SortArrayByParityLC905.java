package Arrays.TwoPointers;

public class SortArrayByParityLC905 {
    public int[] sortArrayByParity(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<end ){
            if(nums[start]%2==0 && start<end   ) {
                start++;
            }
            if(nums[end]%2!=0 && start<end){
                end--;
            }
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
        return nums;

    }

    public int[] sortArrayByParityUsingExtraSpace(int[] nums) {
        int[] result = new int[nums.length];
        int start=0;
        int end=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                result[start++]=nums[i];
            }else{
                result[end--]=nums[i];
            }
        }
        return result;
    }
}

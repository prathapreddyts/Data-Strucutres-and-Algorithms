package prefixSum;

public class ProductArrayExceptSelf238 {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];
        prefixProduct[0] = 1;
        suffixProduct[nums.length - 1] = 1;
        for(int i=0;i<nums.length;i++){
            prefixProduct[i] = prefixProduct[i-1]*nums[i-1];
        }
        for(int j=nums.length-2;j>=0;j--){
            suffixProduct[j] = suffixProduct[j+1]*nums[j+1];
        }
        int[] resultArray = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            resultArray[i] = prefixProduct[i]*suffixProduct[i];
        }
        return resultArray;
    }
}

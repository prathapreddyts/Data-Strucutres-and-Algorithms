package TwoPointers;

public class SortColorsLC75 {
    public void sortColors(int[] nums) {
        sortColorsBruteWay(nums);
    }

    public void sortColorsBruteWay(int [] nums){
        int zeroCnt=0;
        int oneCnt=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCnt++;
            }else if(nums[i]==1){
                oneCnt++;
            }
        }
        for(int i=0;i<zeroCnt;i++){
            nums[i]=0;
        }
        for(int i=zeroCnt;i<zeroCnt+oneCnt;i++){
            nums[i]=1;
        }
        for(int i=zeroCnt+oneCnt;i<nums.length;i++){
            nums[i]=2;
        }
    }
}

package TwoPointers;

public class MergeSortedArrayLC88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=0;
        int[] sortedArray = new int[m + n];
        int i=0,j=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                sortedArray[idx++]=nums1[i++];
            }else{
                sortedArray[idx++]=nums2[j++];
            }
        }
        while(i<m){
            sortedArray[idx++]=nums1[i++];
        }
        while(j<n){
            sortedArray[idx++]=nums2[j++];
        }
        System.arraycopy(sortedArray, 0, nums1, 0, m + n);
    }
}

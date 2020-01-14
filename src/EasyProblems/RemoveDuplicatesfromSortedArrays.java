//Two pointer technique

class Solution {
    public int removeDuplicates(int[] nums){
        if(nums==null || nums.length){
            return 0;
        }

        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;

    }
}
package code;


class Solution {
    public void moveZeroes(int[] nums) {
        int zeroIndex=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zeroIndex]=nums[i];
                zeroIndex++;
            }
        }
        while(zeroIndex!=nums.length){
            nums[zeroIndex]=0;
            zeroIndex++;
        }
    }
}
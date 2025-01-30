package codes;

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
	public static void main(String[] args) {
		int nums[]= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}

}

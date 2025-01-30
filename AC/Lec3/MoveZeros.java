package codes;

public class MoveZeros {
	
    public static void moveZeroes(int[] nums) {
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
    
    public static void printNumsArr(int nums[]) {
    	for(int i=0;i<nums.length;i++) {
    		System.out.print(nums[i]+" ");
    	}
    }
    
	public static void main(String[] args) {
		int nums[]= {0,1,0,3,12};
		moveZeroes(nums);
		printNumsArr(nums);
	}

}

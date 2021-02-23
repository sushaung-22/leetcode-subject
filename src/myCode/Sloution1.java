package myCode;

public class Sloution1 {
	public int[] twoSum(int[] nums, int target) {
		   int len=nums.length;
			//如果在数组的length-2的位置没有找到另一个和数，那么算法结束；
			  for(int i=0;i<len-1;i++){
				  for(int j=i+1;j<len;j++){
					  if(nums[i]+nums[j]==target){
						  return new int[]{i,j};
					  }
				  }
			  }
			//算法必须返回两个数之和，若是没有找到两个数，则抛出没有找到的异常即可；
			  throw new IllegalArgumentException("No two sum sloution");
		    }
}

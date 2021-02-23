package myCode;
import java.util.HashMap;
import java.util.Map;

public class Sloution2 {
    public int[] twoSum(int[] nums, int target) {
 int len=nums.length;
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>(len-1);
		hashMap.put(nums[0],0);//哈希表中一定没有数值与数组一个数值相同，将第一个数组值直接存入哈希表
		for(int i=1;i<len;i++){
			int another=target-nums[i];
			if(hashMap.containsKey(another)){
				return new int[]{i,hashMap.get(another)};
			}
				hashMap.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
    }
}

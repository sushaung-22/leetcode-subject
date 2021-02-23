package myCode;
import java.util.HashMap;
import java.util.Map;

public class Sloution2 {
    public int[] twoSum(int[] nums, int target) {
 int len=nums.length;
		Map<Integer,Integer> hashMap=new HashMap<Integer,Integer>(len-1);
		hashMap.put(nums[0],0);//��ϣ����һ��û����ֵ������һ����ֵ��ͬ������һ������ֱֵ�Ӵ����ϣ��
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

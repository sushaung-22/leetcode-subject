package myCode;

public class Sloution1 {
	public int[] twoSum(int[] nums, int target) {
		   int len=nums.length;
			//����������length-2��λ��û���ҵ���һ����������ô�㷨������
			  for(int i=0;i<len-1;i++){
				  for(int j=i+1;j<len;j++){
					  if(nums[i]+nums[j]==target){
						  return new int[]{i,j};
					  }
				  }
			  }
			//�㷨���뷵��������֮�ͣ�����û���ҵ������������׳�û���ҵ����쳣���ɣ�
			  throw new IllegalArgumentException("No two sum sloution");
		    }
}

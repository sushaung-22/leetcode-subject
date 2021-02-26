package myCode;
//Longest Substring Without Repeating Characters���ظ��ַ�����Ӵ�

import java.util.Map;
import java.util.HashMap;

public class Sloution1 {
	public int lengthOfLongestSubstring(String s) {
      int len=s.length();
		if(len==0) {
    	   return 0;
       }//���ַ���Ϊ�գ��򷵻�0��
      Map<Character,Integer> hashMap=new HashMap<Character,Integer>(len);//������ʼ����ϣ�����������ֹ��ϣ�����ݴ��������ģ�
      int left=0,maxSubLen=0;//��¼�������ڵ�������,��¼��ǰ����ַ����ĳ��ȣ�
      for(int i=0;i<len;i++) {
    	  if(hashMap.containsKey(s.charAt(i)))
    	  {
    		  left=Math.max(left,hashMap.get(s.charAt(i))+1 );//����left,Ѱ�ҵ��ظ�Ԫ�ض�Ӧλ�õ��±��һ��
    	  }
    	  hashMap.put(s.charAt(i), i);//��i��Ӧ���ַ���ӵ������У�
    	  maxSubLen=Math.max(maxSubLen, i-left+1);//���±������ַ�����ǰ����󳤶ȣ�
      }
      return maxSubLen;
	}
}

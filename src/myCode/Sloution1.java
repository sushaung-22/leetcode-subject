package myCode;
//Longest Substring Without Repeating Characters无重复字符的最长子串

import java.util.Map;
import java.util.HashMap;

public class Sloution1 {
	public int lengthOfLongestSubstring(String s) {
      int len=s.length();
		if(len==0) {
    	   return 0;
       }//若字符串为空，则返回0；
      Map<Character,Integer> hashMap=new HashMap<Character,Integer>(len);//尽量初始化哈希表的容量，防止哈希表扩容带来的消耗；
      int left=0,maxSubLen=0;//记录滑动窗口的左侧个数,记录当前最长子字符串的长度；
      for(int i=0;i<len;i++) {
    	  if(hashMap.containsKey(s.charAt(i)))
    	  {
    		  left=Math.max(left,hashMap.get(s.charAt(i))+1 );//更新left,寻找的重复元素对应位置的下标加一；
    	  }
    	  hashMap.put(s.charAt(i), i);//将i对应的字符添加到队列中；
    	  maxSubLen=Math.max(maxSubLen, i-left+1);//更新表中子字符串当前的最大长度；
      }
      return maxSubLen;
	}
}

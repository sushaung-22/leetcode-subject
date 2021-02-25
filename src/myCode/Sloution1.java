package myCode;
//Add to numbers
import java.util.List;

import listNode.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Sloution1 {
	  public Node addTwoNumbers(Node l1, Node l2) {
		    Node l3=new Node();//����һ����ʱ���±�������sum;
		    int x,y,sum=0,carry=0;//���ó�ʼ��λֵΪ0��
		    while(l1!=null||l2!=null||carry>0) {
		    	 x=l1==null?0:l1.data;
		    	 y=l2==null?0:l2.data;//����ӵ�λ����ֵ��
		    	 sum=x+y+carry;//sum��ֵ���ڶ�Ӧλ�ϵ����ټ��Ͻ�λ��
		    	 carry=sum/10;
		    	 NodeWays.InsertList(l3,sum%10);
		    	 if(l1!=null) {
		    		 l1=l1.next;
		    	 }
		    	 if(l2!=null) {
		    		 l2=l2.next;
		    	 }
		    }
		    return l3;
	    }
}

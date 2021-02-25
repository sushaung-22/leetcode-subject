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
		    Node l3=new Node();//创建一个临时的新表来储存sum;
		    int x,y,sum=0,carry=0;//设置初始进位值为0；
		    while(l1!=null||l2!=null||carry>0) {
		    	 x=l1==null?0:l1.data;
		    	 y=l2==null?0:l2.data;//给相加的位数赋值；
		    	 sum=x+y+carry;//sum的值等于对应位上的数再加上进位；
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

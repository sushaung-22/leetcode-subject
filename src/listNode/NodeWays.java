package listNode;
import java.util.Scanner;

public class NodeWays {
  public Node InitList(Node node) {
	  //初始化结点（生成表头结点）
	  Node mNode=new Node();
	  node.next=null;
	  return mNode;
  }
  public Node createList(Node node) {
	  //创造链表
	  Scanner reader=new Scanner(System.in);
	  int data=reader.nextInt();
	  while(data!=-1) {//输入以-1结束
		  Node pNode =new Node();
		  pNode.next=node.next;
		  node.next=pNode;
		  data=reader.nextInt();
	  }
	  return node;
  }
  public static Node InsertList(Node node,int data) {
	  //插入链表
		  Node pNode =new Node();
		  pNode.data=data;
		  pNode.next=node.next;
		  node.next=pNode;  
	      return node;
  }
  public void printList(Node node) {
	  //打印链表
      Node temp;
      temp=node.next;
      while(temp!=null) {
    	  System.out.println("temp.data");
    	  temp=temp.next;
      }
    }
 }

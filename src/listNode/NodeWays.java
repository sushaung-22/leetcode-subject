package listNode;
import java.util.Scanner;

public class NodeWays {
  public Node InitList(Node node) {
	  //��ʼ����㣨���ɱ�ͷ��㣩
	  Node mNode=new Node();
	  node.next=null;
	  return mNode;
  }
  public Node createList(Node node) {
	  //��������
	  Scanner reader=new Scanner(System.in);
	  int data=reader.nextInt();
	  while(data!=-1) {//������-1����
		  Node pNode =new Node();
		  pNode.next=node.next;
		  node.next=pNode;
		  data=reader.nextInt();
	  }
	  return node;
  }
  public static Node InsertList(Node node,int data) {
	  //��������
		  Node pNode =new Node();
		  pNode.data=data;
		  pNode.next=node.next;
		  node.next=pNode;  
	      return node;
  }
  public void printList(Node node) {
	  //��ӡ����
      Node temp;
      temp=node.next;
      while(temp!=null) {
    	  System.out.println("temp.data");
    	  temp=temp.next;
      }
    }
 }

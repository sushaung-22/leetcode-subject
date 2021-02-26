package listNode;

public class Node {
  public int  data;//记录结点数据
  public Node next;//记录下一个结点
  public Node(int data) {//构造有初始值的结点
	  this.data=data;
	  this.next=null;
  }
  public Node() {}
}
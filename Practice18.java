//编写一个程序，找到两个单链表相交的起始节点。
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class Practice18{
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	//求链表长度
	public static int length(Node head){
		int count=0;
		Node cur=head;
		while(cur!=null){
			cur=cur.next;
			count++;
		}
		return count;
	}
	public static Node getIntersectionNode(Node headA, Node headB){
		int lenA=length(headA);
		int lenB=length(headB);
		Node longList=null;
		Node shortList=null;
		int differ=0;
		if(lenA<lenB){
			longList=headB;
			shortList=headA;
			differ=lenB-lenA;
		}
		else{
			longList=headA;
			shortList=headB;
			differ=lenA-lenB;
		}
		for(int i=0;i<differ;i++){
			longList=longList.next;
		}
		while(longList!=shortList){
			longList=longList.next;
			shortList=shortList.next;
		}
		return longList;
	}
	public static void main(String [] args){
	    Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(3);
		Node n5=new Node(4);
		Node n6=new Node(4);
		Node n7=new Node(5);
		Node m1=new Node(9);
		Node m2=new Node(8);
		Node m3=new Node(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		m1.next=m2;
		m2.next=m3;
		m3.next=n5;
		n7.next=null;
		Node head=getIntersectionNode(n1, m1);
		display(head);
	}
}


































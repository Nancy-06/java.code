//给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
//要求返回这个链表的深拷贝。
class Node{
	int value;
	Node random;
	Node next;
	Node(int value){
		this.value=value;
	}
} 
public class Practice20{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		Node n7=new Node(7);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=null;
		n1.random=n3;
		n2.random=n4;
		return n1;	
	}
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	public static void display1(Node head){
		for(Node cur=head;cur!=null;cur=cur.random){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	public static Node copyRandomList(Node head){
		//1.遍历老结点，将新结点插在老结点后面
		Node cur=head;
		while(cur!=null){
			Node newNode=new Node(cur.value);
			newNode.next=cur.next;
			cur.next=newNode;
			cur=cur.next.next;
		}
		//2.遍历新老结点，进行random的赋值
		cur=head;
		while(cur!=null){
			if(cur.random!=null){
				cur.next.random=cur.random.next;
			}
			else{
				cur.next.random=null;
			}
			cur=cur.next.next;
		}
		//3.把新老链表分开
		cur=head;
		Node newList=head.next;
		while(cur!=null){
			Node prev=cur.next;
			cur.next=prev.next;
			if(prev.next!=null){
				prev.next=prev.next.next;
			}
			cur=cur.next;
		}
		return newList;
	}
	public static void main(String [] args){
		Node head=create();
		head=copyRandomList(head);
		display(head);
		display1(head);
	}
}









































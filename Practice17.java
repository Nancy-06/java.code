//对于一个链表，请设计一个时间复杂度为O(n),额外空间复杂度为O(1)的算法，判断其是否为回文结构。
//给定一个链表的头指针head，请返回一个bool值，代表其是否为回文结构。保证链表长度小于等于900。
//例如：1->2->2->1    返回：true
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class Practice17{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(3);
		Node n6=new Node(2);
		Node n7=new Node(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=null;
		return n1;	
	}
	//找中间值
	public static Node middle(Node head){
		if(head==null){
			return null;
		}
		Node front=head;
		Node back=head;
		while(front!=null){
			front=front.next;
			if(front==null){
				break;
			}
			else{
				back=back.next;
				front=front.next;
			}
		}
		return back;
	}
	//链表逆置
	public static Node reverse(Node head){
		if(head==null){
			return null;
		}
		Node newNode=null;
		Node cur=head;
		while(cur!=null){
			Node next=cur.next;
			cur.next=newNode;
			newNode=cur;
			cur=next;
		}
		return newNode;
	}
	//判断是否为回文结构
	public static boolean chkPalindrome(Node head){
		Node mid=middle(head);
		Node h2=reverse(mid);
		Node n1=head;
		Node n2=h2;
		while(n1!=null&&n2!=null){
			if(n1.value!=n2.value){
				return false;
			}
			n1=n1.next;
			n2=n2.next;
		}
		return true;
	}
	public static void main(String [] args){
		Node head=create();
		if(chkPalindrome(head)==false){
			System.out.println("不是回文结构");
		}
		else{
			System.out.println("是回文结构");
		}
	}
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
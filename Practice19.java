//给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class Practice19{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(3);
		Node n5=new Node(4);
		Node n6=new Node(4);
		Node n7=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n2;
		return n1;	
	}
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	public static Node detectCycle(Node head){
		if(head==null){
			return null;
		}
		Node fast=head;
		Node slow=head;
		do{
			fast=fast.next;
			if(fast!=null){
				fast=fast.next;
				slow=slow.next;
			}
		}while(fast!=null&&fast!=slow);
		if(fast==null){
			return null;
		}
		Node p1=head;
		Node p2=slow; 
		while(p1!=p2){
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}
	public static void main(String [] args){
		Node head=create();
		head=detectCycle(head);
		System.out.println(head.value);
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
class Node{
	public Node next;
	public int value;
	public Node(int value){
		this.value=value;
	}
}
public class Practice9{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		Node n6=new Node(6);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		return n1;	
	}
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	//将链表逆置
	public static Node reverseList(Node head){
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
	public static Node reverseList1(Node head){
		Node n1=null;
		Node n2=head;
		while(n2!=null){
			Node n3=n2.next;
			n2.next=n1;
			n1=n2;
			n2=n3;
		}
		return n1;
	}
	public static Node reverseList2(Node head){
		if(head==null){
			return null;
		}
		Node n1=null;
		Node n2=head;
		Node n3=head.next;
		while(n2!=null){
			n2.next=n1;
			n1=n2;
			n2=n3;
			if(n3!=null){
				n3=n3.next;
			}
		}
		return n1;
	}
	public static void main(String[] args){
		Node head=create();
		display(head);        //打印出 1--> 2--> 3--> 4--> 5--> null
		head=reverseList(head);
		display(head);        //打印出 5--> 4--> 3--> 2--> 1--> null
		head=reverseList1(head);
		display(head);       //打印出 1--> 2--> 3--> 4--> 5--> null
		head=reverseList2(head);
		display(head);      //打印出 5--> 4--> 3--> 2--> 1--> null
	}
}
	
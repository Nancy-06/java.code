class Node{
	int value;
	Node next; 
	public Node(int value){
		this.value=value;
	}
}
public class Practice8{
	
	public static void display(Node head){
	for(Node cur=head;cur!=null;cur=cur.next){ 
	   System.out.printf("%d--> ",cur.value);
	}
	System.out.println("null");
}
    //逆置
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
	public static void main(String [] args){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		Node head=reverseList(n1);
		display(head);
	}
}
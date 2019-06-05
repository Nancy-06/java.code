class Node{
	public Node next;
	public int value;
	public Node(int value){
		this.value=value;
	}
}
public class Practice13{
	//创造出一个链表
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
		n5.next=n6;
		n6.next=null;
		return n1;
	}
	//打印链表，进行遍历，如果是偶数返回两个里面的第二个
	public static void display(Node head){
		for(Node val=head;val!=null;val=val.next){
			System.out.printf("%d--> ",val.value);
		}
		System.out.println("null");
	}
		//找中间结点，如果是偶数返回两个里面的第二个
		public static Node middleNode(Node head){
			Node back=head;
			Node front=head;
			while(front!=null){
				front=front.next;
				if(front==null){
					return null;
				}
				back=back.next;
				front=front.next;
			}
			return back;
		}
		public static void main(String [] args){
			Node head=create();
			head=middleNode(head);
			System.out.printf("中间结点为：");
		    System.out.println(head.value);
		}
}




























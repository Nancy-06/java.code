class Node{
	public int value;
	public Node next;
	public Node(int value){
		this.value=value;
	}
}
public class Practice11{
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
	//将两个有序的链表合并为一个有序的链表
		public static Node mergeTwoLists(Node l1,Node l2){
			Node cur1=l1;
			Node cur2=l2;
			Node result=null;
			Node last=null;
			while(cur1!=null&&cur2!=null){
				if(cur1.value<=cur2.value){
					Node next=cur1.next;
					if(result==null){
					    result=cur1;
					}
					else{
						last.next=cur1;
					}
					last=cur1;
					cur1=next;
				}
			   else{
				   Node next=cur2.next;
				 if(result==null){
					 result=cur1;
				 }
				else{
					last.next=cur2;
					}
				    last=cur2;
					cur2=next;
			}
		}
			if(cur2!=null){
				last.next=cur2;
			}
			else{
				last.next=cur1;
			}
			return result;
		}	
		public static void main(String [] args){
			Node l1=create();
			Node l2=create();
			Node head=mergeTwoLists(l1,l2);
			display(head);
		}
}
//在一个有序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 
//例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class Practice16{
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
		n7.next=null;
		return n1;	
	}
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	//在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
    //方法1：创建一个虚结点	
	public static Node deleteDuplication(Node head){
		if(head==null){
			return null;
		}
		Node prev=new Node(1);
		prev.next=head;
		Node fake=prev;
		Node p1=head;
		Node p2=head.next;
		while(p2!=null){
			if(p1.value!=p2.value){
				prev=p1;
				p1=p2;
				p2=p2.next;
			}
			else{
				while(p2!=null&&p1.value==p2.value){
					p2=p2.next;
				}
				prev.next=p2;
				p1=p2;
				if(p2!=null){
					p2=p2.next;
				}
			}
		}
		return fake.next;
	}
	//方法2：不创建虚结点
	public static Node deleteDuplication1(Node head){
		if(head==null){
			return null;
		}
		Node prev=null;
		Node p1=head;
		Node p2=head.next;
		while(p2!=null){
			if(p1.value!=p2.value){
				prev=p1;
				p1=p2;
				p2=p2.next;
			}
			else{
				while(p2!=null&&p1.value==p2.value){
					p2=p2.next;
				}
				if(prev==null){
					head=p2;
				}
				else{
					prev.next=p2;
				}
				p1=p2;
				if(p2!=null){
					p2=p2.next;
				}
			}
		}
		return head;
	}
	public static void main(String[] args){
		Node head=create();
		display(head);    //打印出  1--> 2--> 3--> 3--> 4--> 4--> 5--> null
		head=deleteDuplication(head);
		display(head);   //打印出   1--> 2--> 5--> null
		head=create();
		display(head);    //打印出  1--> 2--> 3--> 3--> 4--> 4--> 5--> null
		head=deleteDuplication1(head);
		display(head);   //打印出   1--> 2--> 5--> null
	}
}


































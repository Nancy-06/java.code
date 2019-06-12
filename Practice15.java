//编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
//返回重新排列后的链表的头指针。注意：分割以后保持原来的数据顺序不变。
class Node{
	Node next;
	int value;
	Node(int value){
		this.value=value;
	}
}
public class Practice15{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(9);
		Node n2=new Node(5);
		Node n3=new Node(3);
		Node n4=new Node(2);
		Node n5=new Node(7);
		Node n6=new Node(4);
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
	//打印链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	//以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前。注意：分割以后保持原来的数据顺序不变。
	public static Node partition(Node head, int x){
		if(head==null){
			return null;
	    }
		Node small=null;
		Node big=null;
		Node smallLast=null;
		Node bigLast=null;
		for(Node cur=head;cur!=null;cur=cur.next){
			if(cur.value<x){
				if(small==null){
					small=cur;
				}
				else{
					smallLast.next=cur;
				}
				smallLast=cur;
			}
			else{
				if(big==null){
					big=cur;
				}
				else{
					bigLast.next=cur;
				}
				bigLast=cur;
			}
		}
		//要记得：需保证链表的最后一个结点为0
		if(small==null){
			return big;
		}
		else{
			smallLast.next=big;
			if(bigLast!=null){
				bigLast.next=null;
			}
			return small;
		}
	}
	public static void main(String [] args){
		Node head=create();
		display(head);     //打印出  9--> 5--> 3--> 2--> 7--> 4--> 1--> null
		head=partition(head, 3);
		display(head);     //打印出  2--> 1--> 9--> 5--> 3--> 7--> 4--> null
	}
}

























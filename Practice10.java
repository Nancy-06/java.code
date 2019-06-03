class Node{
	public Node next;
	public int value;
	public Node(int value){
		this.value=value;
	}
}
public class Practice10{
	//创造一个链表
	public static Node create(){
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(6);
		Node n4=new Node(3);
		Node n5=new Node(6);
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
	//删除指定链表中的字符
	public static Node removeElements(Node head,int value){
		if(head==null){
			return null;
		}
		Node cur=head.next;
		Node prev=head;
		while(cur!=null){
			if(cur.value==value){
				prev.next=cur.next;
			}
			else{
				prev=cur;
			}
			cur=cur.next;
		}
		//最后要处理头结点
		if(head.value==value){
			head=head.next;
		}
		return head;
	}
	public static Node removeElements1(Node head,int value){
		//创建一个结点，让结点的下一个等于原来的第一个结点,这样最后就不用再考虑头结点
		Node fakeHead=new Node(1);
		fakeHead.next=head;
		Node prev=fakeHead;
		Node cur=head;
		while(cur!=null){
			if(cur.value==value){
				prev.next=cur.next;
			}
			else{
				prev=cur;
			}
			cur=cur.next;
		}
		return fakeHead.next;
	}
	public static Node removeElements2(Node head,int value){
		Node newNode=null;
		Node last=null;  //用来记录newNode链表中的最后一个结点
		Node cur=head;
		while(cur!=null){
			Node next=cur.next;
			if(cur.value!=value){
				//把cur尾插到newNode
				if(newNode==null){
					//第一次尾插时，newNode为空链表
					cur.next=newNode;
					newNode=cur;
				}
				else{
					//以后尾插时，newNode不再是空链表
					last.next=cur;
				}
				last=cur;//负责更新last，保证last始终是最后一个结点
			}
			cur=next;
		}
		if(last!=null){       //处理head==null的情况
			last.next=null;  //保证最后一个结点的next=null
		}
		return newNode;
	}
	public static void main(String [] args){
		Node head=create();
		display(head);     //打印出 1--> 2--> 6--> 3--> 6--> 4--> 5--> null
		head=removeElements(head,6);
		display(head);    //打印出  1--> 2--> 3--> 4--> 5--> null
	    head=create();
		display(head);     //打印出 1--> 2--> 6--> 3--> 6--> 4--> 5--> null
		head=removeElements1(head,6);
		display(head);    //打印出  1--> 2--> 3--> 4--> 5--> null
		 head=create();
		display(head);     //打印出 1--> 2--> 6--> 3--> 6--> 4--> 5--> null
		head=removeElements2(head,6);
		display(head);    //打印出  1--> 2--> 3--> 4--> 5--> null
	}
}






























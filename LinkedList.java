class Node{
	public Node next;    //指向下一个结点的引用
	public int value;    //保存结点中的数据
	public Node(int value){
		this.value=value;
	}
}
public class LinkedList{
	//创造出一个链表
	public static Node createLinkedList(){
		Node n1=new Node(1);   //头结点
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		return n1;
	}
	//打印，遍历链表
	public static void display(Node head){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.printf("%d--> ",cur.value);
		}
		System.out.println("null");
	}
	//头插
	public static Node pushFront(Node head,int value){
		Node newNode=new Node(value);
		newNode.next=head;
		return newNode;
	}
	//尾插
	public static Node pushBack(Node head,int value){
		if(head==null){
			return pushFront(head,value);
		}
		else{
			Node newNode=new Node(value);
		    Node last=getLast(head);
		    last.next=newNode;
		}
		return head;
	}
	public static Node getLast(Node head){
		Node cur=head;
		while(cur.next!=null){
			cur=cur.next;
		}
		return cur;
	}
	//头删
	public static Node popFront(Node head){
		if(head==null){
			System.out.println("参数不合法，无法删除空链表的结点");
			return null;
		}
		else{
			return head.next;
		}
	}
	//尾删
	public static Node popBack(Node head){
		if(head==null){
			System.out.println("参数不合法，无法删除空链表的结点");
			return null;
		}
		if(head.next==null){
			//链表中只有一个结点，可视为头删
			//释放最后原最后一个结点（GC负责）
			return null;
		}
		else{
			Node lastLast=getLastLast(head);
			lastLast.next=null;
			return head;
		}
	}
	public static Node getLastLast(Node head){
		Node cur=head;
		while(cur.next.next!=null){
			cur=cur.next;
		}
		return cur;
	}
	public static void main(String [] args){
		Node head=createLinkedList();
		display( head);//  打印出  1-->2-->3-->4-->5-->null
		head=null;
		head=pushBack(head,3);
		head=pushBack(head,4);
		head=pushBack(head,5);
		display( head);//  打印出  3-->4-->5-->null
		head=pushFront(head,200);
		head=pushFront(head,100);
		display(head);//  打印出  100-->200-->3-->4-->5-->null
		head=popFront(head);
		display( head);//  打印出  200-->3-->4-->5-->null
		head=popBack(head);
		display(head);//  打印出  200-->3-->4-->null
	}
}





















	



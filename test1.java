class Node{
	public Node next;
	public int value;
	public Node(int value){
		this.value=value;
	}
}
public class test1{
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
	//删除所有的val
   public static Node removeValue(Node head,int value){
	   if(head==null){
		   return null;
	   }
	   Node cur=head;
	   Node newNode=null;
	   Node last=null;
	   while(cur!=null){
		  Node next=cur.next;
		  if(cur.value!=value){
			  if(newNode==null){
				newNode=cur;
			  }
			 else{
				last.next=cur;
			}
			last=cur;
		}
		cur=next;
	  }
	  if(last!=null){
		  last.next=null;
	  }
	  return newNode;
   }
   //删除所有的val
   public static Node removeValue1(Node head,int value){
	   Node fake=new Node(1);
	   fake.next=head;
	   Node val=fake;
	   Node cur=head;
	   while(cur!=null){
		   if(cur.value==value){
			   val.next=cur.next;
		   }
		   else{
			   val=cur;
		   }
		   cur=cur.next;
	  }
	  return fake.next;
   }
   public static void main(String [] args){
	   Node head=create();
	   head=removeValue(head,1);
	   display(head);
	   head=create();
	   head=removeValue1(head,1);
       display(head);
   }
}

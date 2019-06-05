class Node{
	public Node next;
	public int value;
	public Node(int value){
		this.value=value;
	}
}
public class Practice12{
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
	//找倒数第k个值
	public static Node FindkthToTail(Node head,int k){
		int length=0;
		for(Node val=head;val!=null;val=val.next){
			length++;
		}
		if (length < k) {
			return null;
		}
		int n=length-k;
		Node per=head;
		for(int a=0;a<n;a++){
			per=per.next;
		}
		return per;
	}
	public static Node FindkthToTail2(Node head,int k){
		Node back=head;
		Node front=head;
		for(int n=0;n<k;n++){
			if(front==null){
			   return null;
		    }
			front=front.next;
		}
		
		while(front!=null){
			front=front.next;
			back=back.next;
		}
		return back;
	}
	public static void main(String [] args){
		Node head=create();
	    head=FindkthToTail(head,2);
		System.out.printf("这个数为倒数第k个，k为：");
		System.out.println(head.value);
		head=create();
		head=FindkthToTail(head,3);
		System.out.printf("这个数为倒数第k个，k为：");
		System.out.println(head.value);
	}
}















































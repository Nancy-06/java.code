abstract class List{
	private int size;
	List(){
		size=0;
	}
	//头插
	public void pushFront(int val){
		insertMiddle(0,val);
	}
	//尾插
	public void  pushBack(int val){
		insertMiddle(size,val);
	}
	//中间插入
	public void insert(int index,int val){
		if(index<0||index>size){
			System.out.println("不合法");
		}
		insertMiddle(index,val);
	}
	//头删
	protected abstract void popFront();
	//尾删
	protected abstract void popBack();
	
	protected abstract void insertMiddle(int index,int val);
	
	protected void inSize(){
		size++;
	}
	protected void outSize(){
		size--;
	}
	protected int getSize(){
		return size;
	}
	abstract void display();
}
class Node{
	int value;
	Node next=null;
	Node(int value){
		this.value=value;
	}
	Node(int value,Node next){
		this.value=value;
		this.next=next;
	}
}
//链表extends 线性表
class LinkedList extends List{
	private Node head=null;
	LinkedList(){
		super();
	}
	@Override
	//可用于中间插入，头插，尾插
	protected void insertMiddle(int index,int val){
		if(index==0){
			head=new Node(val,head);
		}
		else{
			//找到index的前一个结点
			Node prev=head;
			for(int i=0;i<index-1;i++){
				prev=prev.next;
			}
			//在这个结点后面插入val
			prev.next=new Node(val,prev.next);
		}
		super.inSize();
	}
	@Override
	//头删
	protected void popFront(){
		if(head==null){
			System.out.println("不合法");
		}
		else{
			head=head.next;
		}
		super.outSize();
	}
	@Override
	//尾删
	protected void popBack(){
       if(head==null){
			System.out.println("不合法");
		}
		if(head.next==null){
			popFront();
		}
		else{
			Node cur=head;
			while(cur.next.next!=null){
				cur=cur.next;
			}
			cur.next=null;
			super.outSize();
		}
	}
	@Override
	public void display(){
		for(Node cur=head;cur!=null;cur=cur.next){
			System.out.println(cur.value);
		}
	}
}
public class Practice25{
	public static void main(String [] args){
		LinkedList linkedList=new LinkedList();
	    linkedList.pushBack(1);
		linkedList.pushBack(2);
		linkedList.pushBack(3);
		linkedList.pushFront(10);
	    linkedList.pushFront(20);
		linkedList.pushFront(30);
		linkedList.insert(3, 100);
        linkedList.popFront();
		linkedList.popBack();
		linkedList.display();
		int size=linkedList.getSize();
		System.out.println("长度为："+size);
	}
}

































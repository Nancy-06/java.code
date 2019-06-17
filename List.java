class Node{
	int value;
	Node next;
	Node(int value){
		this.value=value;
	}
}
//链表
class LinkedList{
	private int size;
	private Node head;
	//求长度
	public int size(){
		return size;
	}
	//头插
	public void pushFront(int value){
		Node node =new Node(value);
		node.next=head;
		this.head=node;
		size++;
	}
	//尾插
	public void pushBack(int value){
		if(head==null){
			pushFront(value);
		}
		else{
			Node last=head;
			while(last.next!=null){
				last=last.next;
			}
			last.next=new Node(value);
			size++;
		}
	}
	//头删
	public void popFront(){
		if(head==null){
			System.out.println("异常处理");
		}
		else{
			head=head.next;
			size--;
		}
	}
	//尾删
	public void popBack(){
		if(head==null){
			System.out.println("异常处理");
		}
		else if(head.next==null){
			head=null;
			size=0;
		}
	    else{
			Node lastSecond=head;
			while(lastSecond.next.next!=null){
				lastSecond=lastSecond.next;
			}
			lastSecond.next=null;
			size--;
		}
	}
}
//线性表
class SeqList{
	private int [] array;
	private int size;
	public SeqList(){
		this(10);
	}
	public SeqList(int capacity){
		array=new int [capacity];
	}
	public int size(){
		return size;
	}
	//头插
	public void pushFront(int value){
		for(int i=size-1;i>=0;i--){
			array[i+1]=array[i];
		}
		array[0]=value;
		size++;
	}
	//尾插
	public void pushBack(int value){
		array[size++]=value;
	}
	//头删
	public void popFront(){
		if(size==0){
			System.out.println("异常处理");
		}
		else{
			for(int i=1;i<size;i++){
				array[i-1]=array[i];
			}
			size--;
		}
	}
	//尾删
	public void popBack(){
		if(size==0){
			System.out.println("异常处理");
		}
		else{
			size--;
		}
	}
}
public class List{
	public static void main(String [] args){
		LinkedList linkedList=new LinkedList();
	    linkedList.pushBack(1);
	    linkedList.pushBack(2);
	    linkedList.pushBack(3);
	    linkedList.pushBack(4);
		linkedList.pushFront(5);
		linkedList.pushFront(6);
		linkedList.pushFront(7);
		int size1= linkedList.size();
		System.out.println(size1);
		linkedList.popBack();
		linkedList.popBack();
		linkedList.popFront();
		linkedList.popFront();
		size1= linkedList.size();
	    System.out.println(size1);
		
		
	    SeqList seqList = new SeqList();
	    seqList.pushBack(1);
	    seqList.pushBack(2);
	    seqList.pushBack(3);
	    seqList.pushBack(4);
		seqList.pushFront(5);
		seqList.pushFront(6);
		seqList.pushFront(7);
		int size2 = seqList.size();
		System.out.println(size2);
		seqList.popBack();
		seqList.popBack();
		seqList.popFront();
		seqList.popFront();
	    size2 = seqList.size();
        System.out.println(size2);
  }
}







































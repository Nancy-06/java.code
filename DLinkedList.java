class DNode{
	int value;
	DNode next;  //指向后驱结点，如果是最后一个结点，则为null
	DNode prev;  //指向前驱节点，如果是第一个结点，则为null
	DNode(int value){
		this.value=value;
	}
}
class LinkedList{
	private DNode head;
    private DNode last;
	private int size;
	public int size(){
		return size;
	}
	//头插
	public void pushFront(int value){
		DNode node=new DNode(value);
		node.next=head;
		if(head!=null){
			head.prev=node;
		}
		node=head;
		if(last==null){
			last=null;
		}
		size++;
	}
	//尾插
	public void pushBack(int value){
		if(head==null){
			pushFront(value);
		}
		else{
			last.next=new DNode(value);
			last.next.prev=last;
			last=last.next;
			size++;
		}
	}
	//头删
	public void popFront(){
		if(head==null){
			//System.out.println("异常处理");
			return;
		}
		else{
			head=head.next;
			head.prev=null;
			if(head==null){
				last=null;
			}
			size--;
		}
	}
	//尾删
	public void popBack(){
		if(head==null){
			//System.out.println("异常处理");
			return;
		}
		else if(head.next==null){
			popFront();
		}
		else{
			last=last.prev;
			last.next=null;
			size--;
		}
	}
}
public class DLinkedList{
	public static void main(String [] args){
		LinkedList linkedList=new LinkedList();
		linkedList.pushFront(1);
		linkedList.pushFront(2);
		linkedList.pushFront(3);
	    linkedList.pushFront(4);
		linkedList.pushBack(5);
		linkedList.pushBack(6);
		linkedList.popFront();
		linkedList.popBack();
        int size=linkedList.size();
		System.out.println(size);
	}
}

































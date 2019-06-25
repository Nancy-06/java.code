import java.util.Arrays;
//线性表
abstract class List{
	private int size;
	List(){
		size=0;
	}
	//头插
	public void pushFront(int value){
		insertMiddle(0,value);
	}
	//尾插
	public void pushBack(int value){
		insertMiddle(size,value);
	}

	// 抽象方法，只给出方法签名，没有方法实现
	// 方法实现子类来完成	
	//头删
	protected abstract void popFront();
	
	//尾删
	protected abstract void popBack();
	
	//中间插入
	public void insert(int n,int value){
		if(n<0||n>size){
			System.out.println("不合法，越界了");
		}		
		insertMiddle(n,value);
	}
	protected abstract void insertMiddle(int n,int value);
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
//顺序表extends线性表
class arrayList extends List{
	private int [] array;
	arrayList(){
		super();
		array=new int [10];
	}
	//注解
	@Override
	//可用于中间插入，头插，尾插
	protected void insertMiddle(int n,int value){
		ensureCapacity();
		for(int i=getSize();i>n;i--){
			array[i]=array[i-1];
		}
		array[n]=value;
		super.inSize();	
	}
	@Override
	//头删
	protected void popFront(){
		if(getSize()==0){
			System.out.println("不合法");
		}
		else{
			for(int i=1;i<getSize();i++){
				array[i-1]=array[i];
			}
			super.outSize();
			array[getSize()]=0;
		}
	}
	@Override
	//尾删
	protected void popBack(){
		if(getSize()==0){
			System.out.println("不合法");
		}
		else{
			super.outSize();
			array[getSize()]=0;
		}
	}
	@Override
	public void display(){
		for(int i=0;i<getSize();i++){
			System.out.println(array[i]);
	    }
	}
	private void ensureCapacity(){
		if(getSize()<array.length){
			return;
		}
		else{
			array = Arrays.copyOf(array, 2 * array.length);
		}
	}
}
public class Practice24{
	public static void main(String[] args){
		arrayList list=new arrayList();
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushBack(4);
		list.pushBack(5);
		list.pushFront(6);
		list.pushFront(7);
		list.popFront();
        list.popBack();
		list.display();
	}
}
	




























































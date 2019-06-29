//迭代器接口
interface Iterator{
	boolean hasNext();
	int next();
}
interface List{
	//插入
	void pushFront(int val);
	void pushBack(int val);
	void insert(int index,int val);
	//返回数据个数
	int size();
	//打印
	void display();
	//统一的遍历方式
	Iterator iterator();
}
interface RandomAccess{
	
}
abstract class AbstractList implements List{
	protected int size;
	@Override
	public void pushFront(int val){
		insertMiddle(0,val);
	}
	@Override
	public void pushBack(int val){
		insertMiddle(size,val);
	}
	@Override
	public void insert(int index,int val){
		if(index<0||index>size){
			System.out.println("不合理。");
		}
		insertMiddle(index,val);
	}
	@Override
	public int size(){
		return size;
	}
	abstract void insertMiddle(int index,int val);
}
class ArrayListIterator implements Iterator{
	private ArrayList arrayList;
	private int currentIndex;
	ArrayListIterator(ArrayList arrayList){
		this.arrayList=arrayList;
		this.currentIndex=0;
	}
	@Override
	public boolean hasNext(){
		return currentIndex<arrayList.size();
	}
	@Override
	public int next(){
		int val=arrayList.array[currentIndex];
		currentIndex++;
		return val;
	}
}
class ArrayList extends AbstractList implements List,RandomAccess{
	public int [] array=new int [100];
	@Override
	public Iterator iterator() {
		return new ArrayListIterator(this);
	}
	@Override
	public void insertMiddle(int index,int val){//先不考虑扩容
		for(int i=size;i>index;i--){
			array[i]=array[i-1];
		}
		array[index]=val;
		size++;
	}
	@Override
	public void display(){
		for(int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}
}
public class ListByInterface{
	public static void testList(List list){
		list.pushBack(1);
		list.pushBack(2);
		list.pushBack(3);
		list.pushFront(100);
		list.insert(4,200);
		list.display();   //100 1 2 3 200
		Iterator it1=list.iterator();
		Iterator it2=list.iterator();
		System.out.println(it2.next());  //100
		while(it1.hasNext()){
			System.out.println(it1.next());  //100  1 2 3 200
		}
		while(it2.hasNext()){
			System.out.println(it2.next()); //1 2 3 200
		}
	}
	public static void main(String [] args){
		testList(new ArrayList());
	}
}
































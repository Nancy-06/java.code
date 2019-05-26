import java.util.Arrays;
public class SeqList{
	//属性
	private int [] array;
	private int size;
	public SeqList(){
		array=new int[11];
		size=0;
	}
	//头插
	//需要从后往前遍历，防止数组被覆盖
	//数据下标：数据原来所在的下标；空间下标：数据搬移之后所在的下标
	//数据下标所在的范围：[size-1,0];空间下标所在的范围：[size,1];
	//搬移的过程：array[空间的下标]=array[数据的下标]
	public void pushFront(int element){
		ensureCapacity();
		for(int i=size-1;i>=0;i--){
			array[i+1]=array[i];
		}
		array[0]=element;
		size++;
	}
	//尾插
	public void pushBack(int element){
		ensureCapacity();
		array[size++]=element;
	}
	//中间插入（有三种方法）
	public void insert(int index,int element){
		ensureCapacity();
		//i为数据的下标
		for(int i=size-1;i>=index;i--){
			array[i+1]=array[i];
		}
		array[index]=element;
		size++;
    }
	public void insert2(int index,int element){
		ensureCapacity();
		//i为空间的下标
		for(int i=size;i>index;i--){
			array[i]=array[i-1];
		}
		array[index]=element;
		size++;
	}
	public void insert1(int index,int element){
		ensureCapacity();
		//i为循环的次数
		for(int i=0;i<size-index;i++){
			array[size-i]=array[size-i-1];
		}
		array[index]=element;
		size++;
	}
	
	//头删
	public void popFront(){
		if(size==0){
			System.out.println("空顺序表，无法删除");
			return;
		}
		for(int i=1;i<size;i++){
			array[i-1]=array[i];
		}
		array[--size]=0;
	}
	//尾删
	public void popBack(){
		if(size==0){
			System.out.println("空顺序表，无法删除");
			return;
		}
		array[--size]=0;
		}
	//中间删除
	public void erase(int index){
		if(size==0){
			System.out.println("空顺序表，无法删除");
			return;
		}
		for(int i=index;i<size-1;i++){
			array[i]=array[i+1];
		}
		array[--size]=0;
	}
	//查找,在数组中查找一个元素，如果找到返回元素的下标，如果没找到返回-1
	public int  indexOf(int element){
		for(int i=0;i<size;i++){
			if(array[i]==element){
				return i;
			}
		}
		return -1;
	}
	//根据下标，获取一个元素
	public int get(int index){
		if(index<0||index>=size){
			System.out.println("下标错误，不能查找到元素");
			return -1;
		}
		return array[index];
	}
	//给定下标，修改下标所在元素的值
	public void set(int index,int element){
		if(index<0||index>=size){
			System.out.println("下标错误");
		}
		array[index]=element;
	}
	//求数组的长度
	public int size(){
		return size;
	}
	//使数组为空
	public boolean isEmpty(){
		return size==0;
	}
	//扩容，无论是否需要扩容，调用这个方法之后，保证容量一定够用
	//它是内部使用的方法
	private void ensureCapacity(){
		if(size<array.length){
			//数组够用，不需要扩容
			return;
		}
		//java 中通常扩容1.5倍
		int newCapacity=array.length+array.length/2;
		int [] newarray=new int [newCapacity];
		for(int i=0;i<array.length;i++){
			newarray[i]=array[i];
		}	
		this.array=newarray;
	}
	//删除数组中第一个遇到的元素element
	public void remove(int element){
		int index=indexOf(element);
		if(index!=-1){
			erase(index);
		}
	}
	//删除数组中所有遇到的元素element,有三种方法，根据时间复杂度和空间复杂度选择最优的
	//法1：较优的一种解法，时间复杂度O(n),空间复杂度O(1)
	public void removeAll(int element){
		int j=0;
		for(int i=0;i<size;i++){
			if(array[i]!=element){
				array[j++]=array[i];
			}
		}
		size=j;
	}
	//重新定义了一个数组，时间复杂度O(n),空间复杂度O(n)
	public void removeAll1(int element){
		int [] newarray=new int [size];
		int j=0;
		for(int i=0;i<size;i++){
			if(array[i]!=element){
				newarray[j++]=array[i];
			}
			}
		for(int i=0;i<j;i++){
			array[i]=newarray[i];
		}
		size=j;
	}
	//时间复杂度O(n^2),空间复杂度O(1)
	public void removeAll2(int element){
		int index=0;
		while((index=indexOf(element))!=-1){
			erase(index);
		}
	}
	//便于打印，显示顺序表中已有元素，没有的元素不再显示
	public String toString(){
		return Arrays.toString(
		Arrays.copyOf(array,size)
		);
	}
	public static void main(String[] args){
		SeqList Seqlist=new SeqList();
		System.out.println(Seqlist.toString());
		Seqlist.pushFront(30);
		Seqlist.pushFront(20);
		Seqlist.pushFront(10);
		System.out.println(Seqlist.toString());
		Seqlist.pushBack(50);
		Seqlist.pushBack(70);
		Seqlist.pushBack(80);
		Seqlist.pushBack(90);
		Seqlist.pushBack(100);
		Seqlist.pushBack(50);
		Seqlist.pushBack(70);
		Seqlist.pushBack(80);
		Seqlist.pushBack(90);
		System.out.println(Seqlist.toString());
		Seqlist.insert(3,40);
		System.out.println(Seqlist.toString());
		Seqlist.popFront();
		System.out.println(Seqlist.toString());
		Seqlist.popBack();
		System.out.println(Seqlist.toString());
		Seqlist.erase(2);
		System.out.println(Seqlist.toString());
		int index=Seqlist.indexOf(30);
		if(index==-1){
			System.out.println("没有找到这个元素");
		}
		else{
			System.out.println("这个元素的下标为："+index);
		}
		 int element=Seqlist.get(3);
		if(element==-1){
			System.out.println("下标错误");
		}
		else{
			System.out.println("这个下标的元素是："+element);
		}
		Seqlist.set(3,60);
		System.out.println(Seqlist.toString());
		System.out.println("数组的长度为："+Seqlist.size());
		Seqlist.remove(50);
		System.out.println(Seqlist.toString());
		Seqlist.removeAll(50);
		System.out.println(Seqlist.toString());
	}
}
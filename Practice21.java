//父类：线性表
class List{
	//不能写成private,否则子类没有访问权限
    //protected子类有权限，其他子类没有权限
	protected int size;
	public int getSize(){
		return size;
	}
}
//顺序表，继承自线性表
class SeqList extends  List{
	private int [] array=new int [100];
	//尾插
	public void pushBack(int value){
		array[++size]=value;
	}
	//头插
	public void pushFront(int value){
		for(int i=size;i<0;i--){
			array[i]=array[i-1];
		}
		array[0]=value;
		size++;
	}
}
public class Practice21{
	public static void main(String [] args){
		SeqList seqList=new SeqList();
		seqList.pushBack(1);
		seqList.pushBack(2);
		seqList.pushBack(3);
		seqList.pushBack(4);
		seqList.pushBack(5);
		seqList.pushFront(6);
		seqList.pushFront(7);
		System.out.println(seqList.getSize());
	}
}
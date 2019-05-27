//1.找最大值   public static int max(int [] array)
//2.在数组中寻找key，如果有的话返回下标，如果没有返回-1    public static int indexOf(int [] array,int key)
//3.评分标准，求平均分，去掉一个最高分，去掉一个最低分，返回平均值（scores一定大于3）     public  static double average(int[]  array)
//4.二分查找   前提：数组已经有序  
// 1.在有序数组中查找key，如果找到，返回下标，如果没有找到，返回-1，public  static int binarySearch(int [] array,int key)
//5.冒泡排序，交换两个数字的方法：public static void swap (int []array,int i,int j)
//     public static void bubbleSort(int []  array)
import java.util.Arrays;
public class Practice5{
	//1.找最大值
	public static int max(int [] array){
		int max=0;
		int i=0;
		for(i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
		}
		return max;	
	}
	//2.在数组中寻找值
	public static int indexOf(int [] array,int key){
		int i=0;
		for(i=0;i<array.length;i++){
			if(key==array[i]){
				return i;
			}
		}
		return -1;	
	}
	//3.评分标准，求平均分，去掉一个最高分，去掉一个最低分，返回平均值（scores一定大于3）
	public  static double average(int[]  array){
		int max=array[0];
		int min=array[0];
		int i=0;
		int sum=0;
		for(i=0;i<array.length;i++){
			if(array[i]>max){
				max=array[i];
			}
			if(array[i]<min){
				min=array[i];
			}
			sum+=array[i];
		}	
		return (double) (sum-min-max)/(array.length-2);
	}
	//4.二分查找   前提：数组已经有序
	public  static int binarySearch(int [] array,int key){
		int left=0;
		int right=array.length-1;
		while(left<=right){
			int mid=left+(right-left)/2;    //防止溢出
			if(key>array[mid]){
				left=mid+1;
			}
			else if(key<array[mid]){
				right=mid-1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	//5.冒泡排序
	//交换两个数字的方法：
    public static void swap (int []array,int i,int j){
		int c=0;
		if(array[i]>array[j]){
			c=array[i];
			array[i]=array[j];
			array[j]=c;
		}
	}
	public static void bubbleSort(int []  array){
		int i=0;
		int j=0;
		for(i=0;i<array.length;i++){
			boolean isSwapped=false;
			for(j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					swap(array,j,j+1);
					isSwapped=true;
				}
			}
			if(!isSwapped){
				return;
			}
		}
	}
	public static void main(String[] args){
		int [] array={2,5,6,8,4,7};
		int [] array1={1,2,3,4,5,6,7};
		System.out.println("最大值为:"+max(array));
		int x=indexOf(array,7);
		if(x==-1){
			System.out.println("没有找到这个数");
		}
		else{
			System.out.println("下标为:"+x);
		}
		double average=average(array);
		System.out.println("平均分为:"+average);
		int y=binarySearch(array1,2);
		if(y==-1){
			System.out.println("没有找到这个数");
		}
		else{
			System.out.println("下标为:"+y);
		}
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}
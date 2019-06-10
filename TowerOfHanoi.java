//汉罗塔问题，有A,B,C三个根柱子，在A上从上往下按照从大到小的顺序放着N个盘子，以B为中心，将A上的盘子全放到C上去，
//移动过程中，要求任意盘子下面要么没盘子，要么只能有比它大的盘子
public class TowerOfHanoi{
	public static void moveDish(int level,char from,char inter,char to){
		if(level==1){     //如果有一个盘子就退出迭代
			System.out.println("从"+from+"移动盘子1号到"+to);
		}
		else{             //如果有多余一个盘子就继续迭代
			moveDish(level-1,from,to,inter);
			System.out.println("从"+from+"移动盘子"+level+"号到"+to);
			moveDish(level-1,inter,from,to);
		}
	}
	public static void main(String [] args){
		int disks=3;
		moveDish(disks,'A','B','C');
	}
}
public class HelloWordApp {
	public static void main(String[] args){
		System.out.println("你好中国");
		int i=0;
		int j=0;
		int sum=0;
		for(i=1;i<10;i++){
		  for(j=1;j<=i;j++){
			System.out.printf(" %d  *  %d = %d\t",j,i,i*j);
		  }	
		  System.out.println();
		}
	}
}
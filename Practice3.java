//1.计算n的位数    public static int calcDigitNum(long n) {}
//2.求n的阶乘      法1.通过阶乘：public static long factorial1(int n){}
//2.求n的阶乘      法2.通过循环：public static long factorial1(int n){}
//3.利用公式 e=1+1/2!+1/3!+……，计算e    public static double calcE(int n){}
//4.利用公式 pi/4=1-1/3+1/5-1/7+……，计算pi的值        public static double calcPi(int n){} n代表多少项
//5.反转字符       public  static String reverse (String s){}
//6.10进制转16进制，  public static String decTOHex(int n)
//计算公式为：1958转16进制：1958%16==6  1958/16==122  122%16==10也就是A   122/16==7  7《16  1958的16进制为7A6
public class Practice3{
	//1.计算n的位数  
	public static int calcDigtNum(long n){
		int DigtNum = 0;
		for( ;n>0;n=n/10 ){
			DigtNum++;
		}
		return DigtNum;
	}
    //2.求n的阶乘    法1.通过阶乘 公式：n!==(n-1)*n
    public static long factorial1(int n){
		if(n==0||n==1){
			return 1;
		}
		else{
			return factorial1(n-1)*n;
		}
	}
	//2.求n的阶乘    法2：通过循环  n!=1*2*3*……*n
	public static long factorial2(int n){
		if(n==0){
			return 1;
		}
		else{
		long fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
		}
	}
	//3.利用公式 e=1+1/2!+1/3!+……，计算e
	public static double calcE(int n){
		double e=0;
		for(int i=0;i<n;i++){
			e=e+((double)1/factorial1(i));
		}
		return e;
	}
	//4.利用公式 pi/4=1-1/3+1/5-1/7+……，计算pi的值
	public static double calcPi(int n){
		double pi=0;
		for(int i=0;i<n;i++){
			int m=2*i+1;
			if(i%2==0){
				pi=pi+1.0/m;
				
			}
			else{
				pi=pi-1.0/m;
			}
		}
		return pi*4;
	} 
	//5.反转字符      
	public  static String reverse (String s){
		int length=s.length();
		String r="";
		for(int i=length-1;i>=0;i--){
			char ch=s.charAt(i);
			r=r+ch;
		}
		return r;
	}
	//6.10进制转16进制，  
	public static String decTOHex(int n){
		String hex=" ";
		while (n>=16){
			int m=n%16;
			n=n/16;
			if(m<10){
				hex=hex+m;//字符串+int类型仍是字符串类型
			}
			else{
				char ch=(char)('A'+(m-10));
				hex=hex+ch;
			}
		}
		if(n !=0){
			hex=hex+n;
		}
		return reverse (hex);
	}
   public static void main(String [ ] args){
	System.out.printf("一共有%d位%n",calcDigtNum(142385));
	System.out.printf("阶乘为%d%n",factorial1(10));
	System.out.printf("阶乘为%d%n",factorial2(10));
	System.out.printf("e=%f%n",calcE(10));
	System.out.printf("pi=%f%n",calcPi(10));
	System.out.println(reverse("Hello"));
	System.out.println(decTOHex(13656));
}
}
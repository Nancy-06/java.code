//如何设计一个类（日期类）
//1.根据需求列出功能
// 1.传年月日，构造日期类  
// 2.在当前日期上增加多少天  
// 3.在当前日期上减多少天    
// 4.可以返回字符串String  的方法   “2019-05-20”
// 5.加一些限制，年支持的范围为[1900,2100]
// 6.如果给定两个日期，希望计算两个日期之间相差的天数
//2.设计属性
// 1.年、月、日
 class Date{
	private int year;
	private int month;
	private int day;
	//构造方法
	public Date(int year,int month,int day){
		if(year<1900||year>2100){
			System.out.println("年不合法"+year);
			return;
		}
		if(month<1||month>12){
			System.out.println("月不合法"+month);
			return;
		}
		if(day<1||day>getDayOfMonth(year,month)){
			System.out.println("日不合法"+day);
		}
		this.year=year;
		this.month=month;
		this.day=day;
	}
	private Date(Date other){
		this(other.year,other.month,other.day);
	}
	//在当前日期上增加多少天
	public void Add(int days){
		//day必须为整数
		if(day<0){
			System.out.println("day不合法"+day);
			return;
		}
		day+=days;
		while(day>getDayOfMonth(year,month)){
			day-=getDayOfMonth(year,month);
			month++;
			if(month>12){
				month=1;
				year++;
			}
		}
	}
	//在当前日期上减少多少天
	public void Sub(int days){
		//day必须为整数
		if(days<0){
			System.out.println("day不合法"+day);
		}
		day-=days;
		while(day<1){
			month--;
			if(month<1){
				month=12;
				year--;
			}
			day+=getDayOfMonth(year,month);
		}
	}
	//可以返回字符串String  的方法   “2019-05-20”
	public String toString(){
		return String.format("%04d-%02d-%02d",year,month,day);
	}
	//如果给定两个日期，希望计算d1与d2之间相差的天数,要求d1>d2
	public static int Differ(Date d1,Date d2){
		if(!isGreatThan(d1,d2)){
			System.out.println("必须d1大于d2");
			return -1;
		}
		int days=0;
		Date tmp=new Date(d1);
		while(isGreatThan(tmp,d2)){
			tmp.Sub(1);
			days++;
		}
		return days;
	}
	private static final int [] DAY_OF_MONTH={31,28,31,30,31,30,31,31,30,31,30,31};
    private static int getDayOfMonth(int year,int month){
		 
	    int days=DAY_OF_MONTH[month-1];
	    if(month==2&&isLeapYear(year)){
		    days=29;
	    }
	    return days;
        }
     private static boolean isLeapYear(int year){
	    if((year%4==0&&year%100!=0)||year%400==0){
		    return true;
		}
	    return false;
    }
	private static boolean isGreatThan(Date d1,Date d2){
		if(d1.year>d2.year){
			return true;
		}
		if(d1.year==d2.year && d1.month>d2.month){
			return true;
		}
		if(d1.year==d2.year && d1.month == d2.month && d1.day>d2.day){
			return true;
		}
		return false;
	}
}

public class Practice6{
	public static void main(String[] args){
		Date date=new Date(2019,5,20);
		System.out.println(date.toString());
		date.Add(10);
		System.out.println(date.toString());
		date.Add(10);
		System.out.println(date.toString());
		date.Sub(10);
		System.out.println(date.toString());
		Date date1=new Date(2019,5,21);
		Date date2=new Date(2019,5,30);
		System.out.printf("两个日期之间相差%d天%n",Date.Differ(date2,date1));
		
	}
}








import java.util.Scanner;
//
public class ex64
{
	
	public static int get_digit(int number)
	{
		/*
		确定位数
		digit  保存输入数的位数
		tester 每次循环扩大10，来让输入数除它
		dummy  计数器，在这里用于保存商，循环判断商是否到0了来确定实际位数
		*/
		int digit=0;
		int dummy=-1;
		int tester=10;
		while(dummy!=0)
		{
			dummy=number/tester;
			digit=digit+1;
			tester=tester*10;
		}
		//System.out.println("the digit is："+digit);	
		return digit;
	}
	
	public static void reverse_int(int number)
	{
		/*
		反向数字
		*/
		int digit=get_digit(number);   //获得位数
		int dummy=0;                   //计数器
		int result=0;                  //反向数字
		while(dummy<digit)
		{
			//反向数字=之前循环的反向数字+（原数字剩余的位数/当前循环对应的位数_从大到小）*（当前循环对应的位数_从小到大）
			result=result  +  (number/(int)Math.pow(10,digit-dummy-1))  *  ((int)Math.pow(10,dummy));
			//System.out.println(number/((int)Math.pow(10,digit-dummy-1)));
			number=number%((int)Math.pow(10,digit-dummy-1));
			dummy=dummy+1;
		}
		System.out.println(result);
	}
	
    public static void main(String[] args) 
	{
	   Scanner inputint= new Scanner(System.in);
	   System.out.println("请输入一个整数");
	   
	   int number=inputint.nextInt();
	   
	   reverse_int(number);
    }
}

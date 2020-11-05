//练习9.3
import java.util.Scanner;
import java.util.Date;  //**

public class ex93
{
    public static void main(String[] args) 
	{
		while(true)
		{
			System.out.println("请输入一个正毫秒数，输入-1退出");
			Scanner inputint=new Scanner(System.in);
			long msec=inputint.nextLong();
			if(msec<0)
			{
				break;
			}
			Date which_date= new Date(msec);
			System.out.println(which_date.toString());
		}
    }
}

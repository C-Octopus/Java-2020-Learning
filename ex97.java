//练习9.7
import java.util.Scanner;
import java.util.Date;

class Account
{
	private int id;
	private double balance;
	private double annualInterestRate=0.02;
	private Date dateCreated;
	
	Account(){}
	Account(int inid,int inbalance)
	{
		id=inid;
		balance=inbalance;
		dateCreated= new Date(System.currentTimeMillis());//获得账户建立的时间
	}
	
	int getID()
	{
		return id;
	}

	double getBalance()
	{
		return balance;
	}	
	
	double getAnInterest()
	{
		return annualInterestRate;
	}	
	
	Date getDate()
	{
		return dateCreated;
	}
	
	//取款，并返回是否成功
	boolean withDraw(double withDrawAmount)
	{
		if((balance-withDrawAmount)>=0)
		{
			balance=balance-withDrawAmount;
			return true;
		}
		else
			return false;
	}
	
	//存款
	void deposit(double depositAmount)
	{
		balance=balance+depositAmount;
	}
}

public class ex97
{
    public static void main(String[] args) 
	{
	   //System.out.println("请输入一个账户号");
	   //Scanner inputint= new Scanner(System.in);
	   
	   Account test=new Account(20000227,10000);
	   System.out.println("账户号："+test.getID());
	   System.out.println("当前余款："+test.getBalance());
	   System.out.println("年利率："+test.getAnInterest());
	   
	   test.withDraw(5000);
	   test.deposit(2500);
	   System.out.println("存取后余款："+test.getBalance());
    }
}

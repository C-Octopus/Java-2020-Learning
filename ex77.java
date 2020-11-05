import java.util.Scanner;
//
public class ex77
{
	public static int random0To9()
	{
		int rnumber = (int)(10*Math.random());
		return rnumber;
	}
	
    public static void main(String[] args) 
	{  
	   int[] array_a=new int[100];
	   
	   int count=0;
	   while(count<100)
	   {
		   array_a[count]=random0To9();
		   count=count+1;
	   }
	   
	   int[] array_hmany=new int[10];
	   count=0;
	   while(count<100)
	   {
		   array_hmany[array_a[count]]=array_hmany[array_a[count]]+1;
		   count=count+1;
	   }
	   
	   count=0;
	   while(count<10)
	   {
		   System.out.println(count+"出现的次数为"+array_hmany[count]);
		   count=count+1;
	   }
    }
}

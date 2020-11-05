import java.util.Scanner;
//
public class ex710
{
	public static int indexOfSmallestElement(double[] array)
	{
	   //double smallest=array[0]; //储存最小的元素
	   int smallest_no=0;          //储存最小元素的下标
	   for(int i=1  ;  i<array.length  ;  i++)
	   {
		   //若遇到多个等值只输出第一个最小的，使用<
		   if(array[i]<smallest)
		   {
			   //smallest=array[i];
			   smallest_no=i;
		   }
	   }
	   return smallest_no;
	}
	
    public static void main(String[] args) 
	{  
	   //手动输入一串数字
	   Scanner inputstr= new Scanner(System.in);
	   System.out.println("请输入一串数，以逗号分隔");
	   String instring = inputstr.next().toString();
	   String[] instring_str= instring.split(",");
	   
	   //转换为double并放入数组
	   double[] instring_double=new double[instring_str.length];
	   for(int i=0  ;  i<instring_double.length  ;  i++)
	   {
		   instring_double[i]= Double.parseDouble(instring_str[i]);
	   }
	   //输出
	   System.out.println("最小的数组元素的下标是（若有重复的以第一个计算）"+indexOfSmallestElement(instring_double));
    }
}

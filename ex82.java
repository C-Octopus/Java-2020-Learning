import java.util.Scanner;

public class ex82
{
    public static void main(String[] args) 
	{  
	   double[][] x4matrix=new double[4][4];
	
	   //手动输入一串数字
	   for(int i=0; i<4;i++)
	   {
		   Scanner inputstr= new Scanner(System.in);
		   System.out.println("请输入4X4矩阵第"+(i+1)+"行数据，以逗号分隔");
		   String instring = inputstr.next().toString();
		   String[] instring_str= instring.split(",");
		   
		   //如果输入的数字少于4个，报告要求重新输入
		   if(instring_str.length<4)
		   {
			   i--;
			   System.out.println("该行数字数量过少，请重新输入");
			   continue;
		   }
		   
		   //转换为double并放入数组
		   for(int j=0  ;  j<4  ;  j++)
		   {
			   x4matrix[i][j]= Double.parseDouble(instring_str[i]);
		   }
	   }
	   //输出
	   System.out.println("该4X4方阵主对角线的和为");
	   System.out.println(x4matrix[0][0]+x4matrix[1][1]+x4matrix[2][2]+x4matrix[3][3]);
    }
}

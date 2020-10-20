import java.util.Scanner;

public class ex617
{
	//随机0,1生成
	public static int randomOfTwo(int a,int b)
	{
		double rnumber=Math.random();
		if(rnumber<0.5)
			return a;
		else
			return b;
	}
	
	//输出nXn的随机0，1矩阵
	public static void printMatrix(int n)
	{
		//int[][] matrix_a=new int[n][n];
		int a=0;
		int b;
		while(a<n)
		{
			b=0;
			while(b<n)
			{
				//matrix_a[a][b]=randomOfTwo(0,1);
				System.out.print(randomOfTwo(0,1)+" ");
				b=b+1;
			}
			a=a+1;
			System.out.println();
		}
	}
	
    public static void main(String[] args) 
	{
	   Scanner inputint= new Scanner(System.in);
	   System.out.println("请输入一个整数n，将显示nxn的0,1矩阵");
	   int n=inputint.nextInt();
	   
	   printMatrix(n);
    }
}

//练习13.13
import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;

public class ex1313
{
    public static void main(String[] args) throws CloneNotSupportedException
	{
		Course VXLDesign=new Course("VXL Design");
		//输入参加课程的学生，输入end或学生人数到达上限，结束输入
		while(true)
		{
			System.out.println("请输入一个学生，输入end结束");
			Scanner input=new Scanner(System.in);
			String instring = input.next().toString();
			if(instring.equals("end") || VXLDesign.getNumberOfStudents()==100)
				break;
			VXLDesign.addStudent(instring);
		}
		
		//测试cloneable，比较两者的地址和实际内容是否相等
		Course VXLDesign_Copy=(Course)VXLDesign.clone();
		//
		System.out.println("if VXLDesign_Copy==VXLDesign is:"+(VXLDesign_Copy==VXLDesign));
		//
		boolean compareResult=false;
		if(VXLDesign.compareTo(VXLDesign_Copy)==1)
			compareResult=true;
		System.out.println("if VXLDesign_Copy equals VXLDesign :"+compareResult);
    }
}

//练习13.3
import java.util.Scanner;
import java.util.ArrayList;
import java.math.*;
//
public class ex133
{
	//排序函数
	public static void sort(ArrayList<Number> list)
	{
		Number temp;
		//起泡排序
		//确定一次排序循环是否发生了排序动作，没有发生说明已经排好，不用进行之后的循环了
		boolean whether_changed=true;
		for(int count_a=0 ; count_a<list.size() && whether_changed != false ; count_a++)
		{
			whether_changed=false;
			//在一次排序循环里进行排序
			for(int count=0 ; count<list.size()-1 ; count++)
			{
				if(list.get(count).doubleValue() > list.get(count+1).doubleValue())
				{
					temp=list.get(count);
					list.set(count,list.get(count+1));
					list.set(count+1,temp);
					whether_changed=true;
				}
			
			}
		}
	}

    public static void main(String[] args) 
	{
	    //System.out.println("请输入一串数字，以逗号分隔");
	    //Scanner input= new Scanner(System.in);
	    //String instring = input.next().toString();
	    //String[] inarray= instring.split(",");
		
		//建立arrayList
	    ArrayList<Number> numberList=new ArrayList<>();
		
		//用不同类型的数值初始化对象并放入arrayList
		numberList.add(3445.53);
		numberList.add(45);
		numberList.add(-15.5);
		numberList.add(new BigInteger("3432323234344343101"));
		numberList.add(new BigDecimal("2.0909090989091343433344343"));
		numberList.add(0.0);
		numberList.add(1500);
		numberList.add(2333333);
		numberList.add(1.5);
		numberList.add(5.55);

	    System.out.println("排序前的arrayList："+numberList);
		
		//排序
	    sort(numberList);
	   
	    System.out.println("排序后的arrayList："+numberList);
    }
}

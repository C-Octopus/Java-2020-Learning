//第八周作业
import java.util.Scanner;
import java.io.*;
import java.security.MessageDigest;
//import java.util.Date;  //**

public class exw8
{
	//SHA1计算哈希值
	public static byte[] SHA1Checksum(InputStream instream) throws Exception
	{
		byte[] buffer = new byte[1024];
		MessageDigest complete=MessageDigest.getInstance("SHA-1");
		int numRead=0;
		do{
			numRead=instream.read(buffer);
			if(numRead>0)
			{
				complete.update(buffer,0,numRead);
			}
			//文件已读完，退出循环
		}while (numRead != -1);
		//关闭输入流
		instream.close();
		//返回SHA1哈希值
		return complete.digest();
	}
	
	//在存入fs列表前，对listFiles()方法取出来的东西进行排序，按照最后修改时间的由新到老*
	public static File[] sortAfter_listFileMeth(File[] fs)
	{
		File temp;
		for(int i=0 ; i<fs.length ; i++)
		{
			for(int j=0 ; j<fs.length ; j++)
			{
				if(fs[i].lastModified() > fs[j].lastModified())
				{
					temp=fs[i];
					fs[i]=fs[j];
					fs[j]=temp;
				}
			}
		}
		return fs;
	}
	
	//深度优先遍历文件夹
	public static void dirDepthFirstTravel(String dirPath)
	{
		File dir=new File(dirPath);
		File[] fs = sortAfter_listFileMeth(  dir.listFiles()  );  //使用了sortAfter_listFileMeth()排序
		String result = "";
		for(int i=0 ; i<fs.length ; i++)
		{
			//如果是文件
			if(fs[i].isFile())
			{
				System.out.println("file-------"+fs[i].getName());
				
				//文件哈希值计算区
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
				try
				{
					FileInputStream instream= new FileInputStream(fs[i]);
					byte[] sha1 = SHA1Checksum(instream);
					for(int count=0 ; count < sha1.length ; count++)
					{
						result+= Integer.toString(sha1[count]&0xFF,16);
					}
				}catch (Exception e)
				{
					e.printStackTrace();
				}
				System.out.println("SHA1:"+result+"\r\n");
				//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++				
			}
			
			//如果是子文件夹
			if(fs[i].isDirectory())
			{
				System.out.println("directory--"+fs[i].getName()+"\r\n");
				//递归，进入子文件夹继续遍历
				dirDepthFirstTravel(dirPath+File.separator +fs[i].getName());
			}
		}
	}

    public static void main(String[] args) 
	{
		System.out.println("请输入文件夹路径");
		Scanner instring=new Scanner(System.in);
		String path = instring.next().toString();
		
		try
		{
			dirDepthFirstTravel(path);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
    }
}

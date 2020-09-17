package day03_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


//2、使用文件流复制myfile.txt文件为myfile_cp.txt
//3、使用缓冲流复制myfile.txt文件为myfile_cp2.txt
public class cyfile {
	public static void main(String[] args) throws Exception {

		try {
			String src = "D:/Test/myfile.txt";
			String bytedest = "D:/Test/myfile_cp.txt";
			//String filedeString = "D:/Test/myfile_cp2";
			
			bytecopy(src, bytedest);
		} catch (Exception e) {
			System.out.println(" ");
		}

	}
	
	

	public static void bytecopy(String src,String dest) throws Exception{
		
		FileInputStream in = new FileInputStream(src);
		File file = new File(dest);
		FileOutputStream out = new FileOutputStream(file);
		int c;
		byte buffer[] = new byte[1024];
		while((c=in.read(buffer))!=-1) {
			for (int i=0;i<c;i++) {
				out.write(buffer[i]);
			}
		}
		System.out.println("利用文件流复制文件复制完成！");
		in.close();
		out.close();
	}
}

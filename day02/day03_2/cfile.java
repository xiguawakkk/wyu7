package day03_2;

import java.io.File;


public class cfile {
	String file_path = "D:/Test";
	
	public static  void CrFile(String path) throws Exception {
		try {
			File f = new File(path);
			if (!f.exists()&&f.isDirectory()) {
				f.mkdirs();
			}
			File f1 = new File(f,"myfile.txt");
			f1.createNewFile();	
			System.out.println("文件创建成功！");
			
			
		} catch (Exception e) {
			System.out.println("文件创建失败！");
		}
		
		
	}

}

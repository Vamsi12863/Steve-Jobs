import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class FileHandling {
	public static void main(String[] args) throws Exception  {
		File newFile = new File("D:\\CODEBEGUN\\JAVA_EXAMPLES\\TextFileFolder");
		File newFile1 = new File("D:\\CODEBEGUN\\JAVA_EXAMPLES\\TextFileFolder");
		
		System.out.println("file created :: "+newFile);
		System.out.println(newFile.canExecute());
		System.out.println(newFile1.canExecute());
		System.out.println(newFile.canRead());
		System.out.println(newFile1.canRead());
		System.out.println(newFile.exists());
		System.out.println(newFile1.exists());
		System.out.println(newFile.equals(newFile1));
		System.out.println(newFile1.getPath());
		System.out.println(newFile.compareTo(newFile1));
		System.out.println(newFile1.getAbsolutePath());
		System.out.println(newFile.getAbsolutePath());
		System.out.println(newFile1.length());
		System.out.println(newFile.length());
	
		//FileReader fileReader = new FileReader(newFile); 
		//FileWriter fileWriter = new FileWriter(newFile1);
		FileReader fr = new FileReader("D:\\CODEBEGUN\\JAVA_EXAMPLES\\TextFileFolder\\Textfile.txt");
		FileWriter fw = new FileWriter("Data.txt");
		BufferedReader b = new BufferedReader(fr);
		BufferedWriter bw = new BufferedWriter(fw);
//		int i;    
//        while((i=fr.read())!=-1)    
             System.out.print((fr));    
             System.out.println(fw);
             System.out.println(b);
             System.out.println(bw);
        fr.close();
        b.close();
        try {  
            FileWriter fwrite = new FileWriter("D:\\CODEBEGUN\\JAVA_EXAMPLES\\TextFileFolder");  
            fwrite.write("Written using FileWriter!!!");   
            fwrite.close(); 
            } catch (IOException e) {  
            System.out.println("Error While Writing!!!");  
            e.printStackTrace();  
            }  
	}

}

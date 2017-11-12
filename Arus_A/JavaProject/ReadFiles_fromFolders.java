import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class read_files_formFolders {
	
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		String path=scanner.next();
		String p[];
				
		System.out.println(fileqanak()[]);
		
	}
	
	public static String[] fileqanak(String path){ 
		File file=new File(path);
		return file.list(); // return a anun file name
	}
	
	public static void writeInfile(String[] text, String path){
		/*String[] text=getNames(path);
		write(text.filename)*/
		
		
		File file =new File(path);
		FileWriter fw=new FileWriter(file);
		BufferedWriter bf=new BufferedWriter(fw);
		
		for (int i=0; i<text.length; i++){
			bf.write(text[i]); bf.newLine();
			
		}
		bf.flush();
	}
	
}

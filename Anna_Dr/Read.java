import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Read {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
				System.out.println("Enter file name");
						String fileName = scanner.nextLine();
						
						
			if (formatVaidation(fileName)) {
				System.out.println("Please input your text...");
				fileWriter(fileName,scanner.nextLine());
				
				String mn = filereader(fileName);
				mn = mn.replaceAll("\\.", ",");
				mn = mn.toUpperCase();
				fileWriter(fileName, mn);
		
			} 
		
	}
	
	
	public static String filereader(String filePath) {
		String line;
		String text = "";
		File l = new File (filePath);
		if(!l.exists()) {
			try {
				l.createNewFile();
			} catch (IOException e) {
				throw new RuntimeException("Something went wrong");
			}
		}
			try (BufferedReader s = new BufferedReader(new FileReader(l))){
				while((line = s.readLine()) != null) {
					text +=line + "\n";
				}
				
			} catch (IOException e) {
				System.out.println("can not proceed");
				}
				return text;
			}
	
	public static boolean formatVaidation(String fileName) {
		String regex = "[A-Za-z0-9]{2,10}\\.[a-z]{3,4}";
		Pattern pattern  = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fileName);
			return matcher.matches();
	}
	
	public static void fileWriter (String filename, String text) {
		File j = new File(filename);
	
		try (BufferedWriter bf 	= new BufferedWriter(new FileWriter(j))){
			bf.write(text);
		} catch (IOException e) {
			System.out.println ("Something went wrong");
		}
	}
}
	
		





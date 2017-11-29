import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileReader {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter File' Name: ");
		String filename = scanner.nextLine();
	
		if (formatvalidation(filename)) {
			
			filereader(filename);
			String a = filereader(filename);
			Scanner wr = new Scanner(System.in);
			System.out.println("Please Write into File:\n");
			String wt = scanner.nextLine();
			a = wt;
			a = a.replaceAll(",","\\.");
			a = a.toUpperCase();
			filewriter(filename, a);
			System.out.println(a);
		} else {
            //Review: Using regexp in message below is not user friendly wat, please avoid using it and just describe the issue in a couple words, e.g. only files with .txt extension are acceptable.  
			System.out.println("Wrong FileName Format. FileName should include [A-Za-z0-9]{2,10}\\.[a-z]{3,4}.");
		}
	}
	//Review: Use camel case format for methods name, e,g, formatValidation
	public static boolean formatvalidation(String filename) {
		String regex = "[A-Za-z0-9]{2,10}\\.[a-z]{3,4}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(filename);
		return matcher.matches();
	}
	
	public static String filereader(String filepath){
		File read = new File (filepath);
        String line;
        String text = "";
        if (!read.exists()) {
        	try{
            	read.createNewFile();
            } catch(IOException e) {
            //Review: Use more informative error messages 
            	throw new RuntimeException("Something went wrong");
            }
       }
        try(BufferedReader br = new BufferedReader(new java.io.FileReader(read))) {
        	while ((line=br.readLine())!=null) {
        		text += line;
        		System.out.println(line);
        	}
        } catch(IOException e){
        	System.out.println("You are wrong");
        }
        return text;
	}
	public static void filewriter(String filename, String tt) {
		File file = new File (filename);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
			bw.write(tt);
		}catch (IOException e) {
			throw new RuntimeException("Something Went Wrong");
		}
	}
}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Chtick {

	int tPrice = 0;
	BufferedWriter output = null;
	File check = new File("Check.txt");
	
	public Chtick() throws IOException {
		output = new BufferedWriter(new FileWriter(check));
	}
	
	public void add(Product product) throws IOException {
		tPrice += product.getPrice();
		setCheck(product);

	}
	
	public void add(Product product, int weight) throws IOException {
		tPrice += product.getPrice() * weight;
		setCheck(product);

	}
	
	public void getCheck() throws IOException {
		output.write("         Total price - " + tPrice);
		output.close();
		tPrice = 0;
	}
	
	public void setCheck(Product product) throws IOException {
         
		if (tPrice == 0) {
	          output = new BufferedWriter(new FileWriter(check));  
		}
		
		output.write(product.getClass().getName());
		output.write(" - " + product.getPrice());
		output.newLine();
	
	}
}

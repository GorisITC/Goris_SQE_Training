
public class Chtick {

	int price = 0;
	
	
	public void add(Product product) {
		price += product.getPrice();
	}
	
	public int getTPrice() {
		return price;
	}
	
	public int getTPrice(boolean end) {
		if (end == true) {
			price = 0;
		}
		return price;
	}
}

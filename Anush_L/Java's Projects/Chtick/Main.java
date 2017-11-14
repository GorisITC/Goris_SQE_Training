
public class Main {
	public static void main (String[] args) {
		
		Product pen = new Product(200);
		Product pencil = new Product(300);
		
		Chtick chtick = new Chtick();
		chtick.add(pen);
		chtick.add(pencil);
		
		System.out.println(chtick.getTPrice());
	}
}

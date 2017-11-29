import java.io.IOException;

public class Main {
	public static void main (String[] args) {
		
		Pen pen = new Pen(200);
		Apple apple = new Apple(300);
		try {
		Chtick chtick = new Chtick();
		chtick.add(pen);
		chtick.add(apple, 10);
		System.out.println(apple.getPrice());
		chtick.getCheck();
		} catch ( IOException e ) {
          e.printStackTrace();
      } 
		
	}
}

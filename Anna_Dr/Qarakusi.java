import static java.lang.Math.*;

public class Qarakusi {

	public static void main(String[] args) {
		int a = 64;
		for(int b=1; b<a; b++) {
			if(a==b*b) {
				System.out.println(b);
				break;
			}else if(b*b > a) {
					System.out.println("not found");
					break;
				}
			}
		}
	}




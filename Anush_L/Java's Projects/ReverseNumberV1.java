public class ReverseNumberV1 {
    public static void main(String[] arg) {
    	int number = 176554;
    	int length = (int)(Math.log10(number)+1);
        for (int n = 1; n <= length; n++) {
            int b = (int) Math.pow(10, n);
        	int i = (number % b) / (b / 10);
        	System.out.print(i);
        }
        
    }   
}

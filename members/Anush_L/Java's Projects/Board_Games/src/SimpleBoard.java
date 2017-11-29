
public class SimpleBoard implements Board {
	
	String color = "white";
	double height = 1000;
	double width = 1000;
	double[] sz = new double[2];
	
	public SimpleBoard(){
		
	}
	
	public SimpleBoard(double height, double width){
		this.height = height;
		this.width = width;
	}

	public String color(String color) {
		this.color = color;
		return color;
	}

	public double[] size() {
		return sz;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight(){
		return height;
	}

}


public class MountainBike extends Bike {

	int lugCount;
	int lugLength;
	
	public MountainBike(double x, double y, double xx, double yy) {
		super(x, y, xx, yy);
	}
	
	public void setLugArea(int lugCount, int lugLength) {
		if (lugCount * lugLength < super.tire) {
			this.lugCount = lugCount;
			this.lugLength = lugLength;
		} else {
			System.out.println("The area of lug should be smaller than the area of the tire.");
		}
	}
	
	public int getLugArea() {
		return lugCount * lugLength;
	}
	
}


public interface MainObject {

	String color();
	
	double[] position();
	
	double area();

	double[] movement(double vx, double vy);
	
	void touchFeature(boolean touch);
	
}

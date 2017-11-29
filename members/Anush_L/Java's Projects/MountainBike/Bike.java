
public class Bike extends Wheel {
	
	boolean stop = true;
//	saddleType true is Women' saddle, false is men' saddle
	boolean saddleType = true;
	boolean pedal = true;
	float speed = 0;
	double tire;
	
	public Bike(double x, double y, double xx, double yy) {
		super(x, y, xx, yy);
	}


	public String getSaddleType() {
		if (saddleType = true) {
			return "Women' saddleType";
		} else {
			return "Men' saddleType";
		}
	}


	public void setSaddleType (boolean saddleType) {
		this.saddleType = saddleType;
	}


	public double tire() {
		this.tire = super.area + 3;
		return tire;
	}


	public boolean isStop() {
		return stop;
	}


	public void setStop(boolean stop) {
		this.stop = stop;
	}


	public float getSpeed() {
		return speed;
	}


	public void setSpeed(float speed) {
		if (isStop() == false) {
			if ((speed < 0 && this.speed > speed * (-1)) || speed >= 0) {
				this.speed+= speed;
			} else {
				System.out.println("Incorrect spped.");
			}
		} else {
			System.out.println("Your bike is stopping.");
		}
	}

}

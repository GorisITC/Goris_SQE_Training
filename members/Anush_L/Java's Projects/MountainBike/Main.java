
public class Main {
	public static void main(String[] args) {
		MountainBike myBike = new MountainBike(20, 20, 40, 40);
		System.out.println(myBike.getArea());
		myBike.setSaddleType(false);
		System.out.println(myBike.getSaddleType());
		myBike.tire();
		myBike.setLugArea(30, 2);
		myBike.setStop(false);
		System.out.println(myBike.isStop());
		myBike.setSpeed(15);
		System.out.println(myBike.getSpeed());
	}
}

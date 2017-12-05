public class Main {
    public static void main(String[] args) {
        Directions dir = Directions.NORTH;
        for (int i = 0; i <8 ; i++) {
            if (dir == Directions.EAST) {
                System.out.println("EAST");
                dir=Directions.NORTH;
            } else if (dir == Directions.WEST) {
                System.out.println("WEST");
                dir=Directions.SOUTH;
            } else if (dir == Directions.NORTH) {
                System.out.println("NORTH");
                dir=Directions.WEST;
            } else {
                System.out.println("SOUTH");
                dir=Directions.EAST;
            }
        }
    }
}

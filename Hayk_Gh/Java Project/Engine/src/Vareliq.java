public class Vareliq extends Engine {
    int qanak;
    boolean k = true;

    Vareliq(int qanak) {
        if (v <= 0) {
            System.out.println("Please input number more than 0");
            k = false;
        } else if (qanak <= 0) {
            System.out.println("Please input positive number");
            k = false;
        } else if (qanak > v) {
            System.out.println("You don't have enough space");
            k = false;
        } else {
            this.qanak = qanak;
            System.out.println("You have " + qanak + " litr petrol");
            k = true;
        }
    }
}

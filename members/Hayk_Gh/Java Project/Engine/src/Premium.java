public class Premium extends Vareliq {
    Premium(int qanak) {
        super(qanak);
    }
    public int Chystqanaki() {
        int chystqanaki = (int) Math.pow(qanak, 3);
        if (k == false) {
            try {
                // TODO - why do we create an exception ourselves here and catch it below?
                return Integer.parseInt(null);
            } catch (NumberFormatException e) {

            }
        } else if (chystqanaki < Chanaparh.erkarutyun) {
            // TODO - wow, this means that we have one single road for all?
            System.out.println("Your petrol was not enough to proceed the road");
            System.out.println("The remaining road is " + (Chanaparh.erkarutyun - chystqanaki));
        } else {
            System.out.println("Your petrol is enough to proceed the " + Chanaparh.erkarutyun + " km road");
        }
        return chystqanaki;
    }
}


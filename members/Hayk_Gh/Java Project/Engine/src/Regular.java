public class Regular extends Premium {
    Regular(int qanak) {
        super(qanak);
    }
    @Override
    public int Chystqanaki() {
        int regchystqanaki = (int) Math.pow(qanak, 2);
        if (k == false) {
            try {
                return Integer.parseInt(null);
            } catch (NumberFormatException p) {

            }
        } else if (regchystqanaki < Chanaparh.erkarutyun) {
            System.out.println("Your petrol was not enough to proceed the road");
            System.out.println("The remaining road is " + (Chanaparh.erkarutyun - regchystqanaki));
        } else {
            System.out.println("Your petrol is enough to proceed the " + Chanaparh.erkarutyun + " km road");
        }
        return regchystqanaki;
    }
}

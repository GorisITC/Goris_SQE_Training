package SimCards;

public abstract class Card {

    protected int balans = 0;
    int arjeq;
    int arjeqSomeOperator;
    int arjeqDiffOperator;
    boolean a;

    public void stugelhashivy() {


        System.out.println("Dzer hashivy kazmum e" + " " + balans + " " + "dram");
    }

    double koder[] = {0.99, 0.91, 0.43, 0.77, 0.94, 0.98, 0.96};

    public void licqavorel(int pox) {
        if (pox > 0) {
            balans += pox;

            System.out.println("Dzer hashivy licqavorvec " + " " + pox + " " +"dramov");
        } else {
            System.out.println("Dzer gorcarqy merjvac e");
        }

    }


    public abstract void zangel(double operatorCode, int hamar, int jamanak);


}

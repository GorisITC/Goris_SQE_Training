package SimCards;

// TODO - is this class really abstract?
public abstract class Card {

    protected int balans=0;
    int arjeq;

    public void stugelhashivy(){

        System.out.println("Dzer hashivy kazmum e" + " " +balans);
    }

    public void licqavorel(int pox){
       if (pox >0){
        balans+=pox;

           System.out.println("Dzer hashivyc kazmum e"+ " " + balans);
       }
        else {
           System.out.println("Dzer gorcarqy merjvac e");
       }

    }


    public void zangel(int jamanak){

    }

}

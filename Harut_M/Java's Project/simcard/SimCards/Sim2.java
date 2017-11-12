package SimCards ;

public class Sim2 extends Card {
    int arjeqy = 30;

    @Override
    public void zangel(int jamanak) {
        if (balans >= jamanak * arjeq) {
            balans -= jamanak * arjeq;
            System.out.println("Dzer zangy katarvac e nerkayis balansy kazmum e" + " " + balans);

        } else System.out.println("Duq cheq karox zangaharel");
    }
}

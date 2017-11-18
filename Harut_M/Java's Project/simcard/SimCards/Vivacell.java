package SimCards;
// Viva

public class Vivacell extends Card {
    int arjeqSomeOperator = 7;
    int arjeqDiffOperator = 35;


    @Override
    public void zangel(double operatorCode, int hamar, int jamanak) {
        for (int i = 0; i < koder.length; i++) {
            if (operatorCode == koder[i]) {
                a = false;
            }
        }
        if (!a) {
            if (operatorCode == 0.77 || operatorCode == 0.94 || operatorCode == 0.98) {
                if (balans >= jamanak * arjeqSomeOperator) {
                    balans -= jamanak * arjeqSomeOperator;
                    System.out.println("Dzer zangy katarvac e nerkayis balansy kazmum e" + " " + balans + " " + "dram");

                } else System.out.println("Duq cheq karox zangaharel");
            }

            if (operatorCode == 0.99 || operatorCode == 0.96 || operatorCode == 0.43 || operatorCode == 0.91) {
                if (balans >= jamanak * arjeqDiffOperator) {
                    balans -= jamanak * arjeqDiffOperator;
                    System.out.println("Dzer zangy katarvac e nerkayis balansy kazmum e" + " " + balans + " " + "dram");

                } else System.out.println("Duq cheq karox zangaharel");
            }
        } else System.out.println("Dzer havaqac hamary sxal e");
    }

}

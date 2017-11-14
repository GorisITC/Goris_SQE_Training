package Cards;

public class MasterCard extends Qart {

    @Override
    public double takemoney(double money) {
        // TODO - did we cover all the possible cases?
        if (money < myMoney &&  money > 0){
            // TODO - lets think of an easier way to compute the needed amount of money
            myMoney -= (money + (money*1)/100);
        }
        System.out.println("You thake  "+ money);
        return myMoney;
    }
}

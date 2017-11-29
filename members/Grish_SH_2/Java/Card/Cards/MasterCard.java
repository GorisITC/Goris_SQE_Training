package Cards;

public class MasterCard extends Card {

    @Override
    public double takemoney(double money) {
        if (money < myMoney &&  money > 0){
            myMoney -= (money + (money*1)/100);
        }
        System.out.println("You thake  "+ money);
        return myMoney;
    }
}

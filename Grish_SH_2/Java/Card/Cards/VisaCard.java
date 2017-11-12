package Cards;

public class VisaCard extends Qart {
    @Override
    public double takemoney(double money) {
        if (money < myMoney &&  money > 0){
            myMoney -= (money + (money*2)/100);
        }
        System.out.println("You thake  "+ money);
        return myMoney;
    }
}

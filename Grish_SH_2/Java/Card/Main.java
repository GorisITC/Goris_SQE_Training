import Cards.MasterCard;
import Cards.VisaCard;

public class Main {
    public static void main(String[] args) {
        // TODO - think about keeping a list of cards, doing the same operations on all of them and comparing the results
       MasterCard masterCard = new MasterCard();
       masterCard.addMoney(2000);
       masterCard.balance();
       masterCard.takemoney(1000);
       masterCard.balance();
       VisaCard vc = new VisaCard();
       vc.addMoney(50000);
       vc.balance();
       vc.takemoney(5000);
       vc.balance();
    }
}

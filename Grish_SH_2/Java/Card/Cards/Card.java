package Cards;

public abstract class Card {
  protected double myMoney = 0;

    public void balance(){
        System.out.println("Your balance is " + myMoney );
    }
    public void addMoney(double money){
        if (money > 0) {
            myMoney += money;
            System.out.println("You added " + money + " on your balance");
        }
        else{
            System.out.println("Something went wrong");
        }

    }
    public abstract double takemoney(double money);

}

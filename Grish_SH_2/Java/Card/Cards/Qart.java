package Cards;

// TODO - why not Card like the rest? :)
public abstract class Qart {
  protected double myMoney = 0;

    public void balance(){
        System.out.println("Your balance is " + myMoney );
    }
    public void addMoney(double money){
        if (money > 0) {
            myMoney += money;
        }
        // TODO - will the message make sence if user tries to add negative amount of money?
        System.out.println("You added " + money + " on your balance");
    }
    public abstract double takemoney(double money);

}

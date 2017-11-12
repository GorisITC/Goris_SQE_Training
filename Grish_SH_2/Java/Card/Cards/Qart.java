package Cards;

public abstract class Qart {
  protected double myMoney = 0;

    public void balance(){
        System.out.println("Your balance is " + myMoney );
    }
    public void addMoney(double money){
        if (money > 0) {
            myMoney += money;
        }
        System.out.println("You added " + money + " on your balance");
    }
    public abstract double takemoney(double money);

}

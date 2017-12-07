public abstract class BankCard {
    double currentCount=0.0;
    double money=0.0;

    public abstract void GetMoney(double money);

    public void AddMoney(double money){
        currentCount=currentCount+money;
        System.out.println("Successfully added: "+money+" dram");
    }
    public void CurrentCount(){
            System.out.println("Your currennt count is: "+currentCount);
        }
}

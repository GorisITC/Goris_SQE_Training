public class Master implements BankCards{
    double currentCount=0.0;
    double money=0.0;

    @Override
    public void AddMoney(double money) {
        money=money-money*0.1/100;
        currentCount=currentCount+money;
        System.out.println("Successfully added: "+money+" dram");
    }

    @Override
    public void GetMoney(double money) {
        money=money-money*0.2/100;
        currentCount=currentCount-money;
        System.out.println(money+"dram is get from your account.");
    }

    @Override
    public void CurrentCount() {
        System.out.println("Your currennt count is: "+currentCount);
    }
}

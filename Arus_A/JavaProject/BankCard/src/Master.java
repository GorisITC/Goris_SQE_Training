public class Master extends BankCard implements BankomatIsEmpty{

    @Override
    public void GetMoney(double money) {
        if(money>currentCount){
            System.out.println("There is not enough money in your account");
        }
        else if(currentCount!=0) {
            System.out.println(money + " dram is get from your account.");
            currentCount = currentCount - money * 0.2 / 100;
        }
        else{
            System.out.println("There is no money in your account");
        }
    }

    public void BankomatIsEmpty(){

    }

}

public class Visa extends BankCard{

        @Override
        public void GetMoney(double money) {
            if(money>currentCount){
                System.out.println("There is not enough money in your account");
            }
            else if(currentCount!=0) {
                currentCount = currentCount - money;
                System.out.println(money + " dram is get from your account.");
            }
            else {
                System.out.println("There is no maney in your account");
            }
        }
}

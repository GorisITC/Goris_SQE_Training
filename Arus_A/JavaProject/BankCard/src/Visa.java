public class Visa implements BankCards{
    double currentCount=0.0;
    double money=0.0;

        @Override
        public void AddMoney(double money) {
            currentCount=currentCount+money;
            System.out.println("Successfully added: "+money+" dram");
        }

        @Override
        public void GetMoney(double money) {
            currentCount=currentCount-money;
            System.out.println(money+"dram is get from your account.");
        }

        @Override
        public void CurrentCount() {
            System.out.println("Your currennt count is: "+currentCount);
        }
    }

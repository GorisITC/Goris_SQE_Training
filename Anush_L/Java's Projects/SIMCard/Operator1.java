
public class Operator1 implements SIMCard {
	
	static int tariffSO = 3;
	static int tariffDO = 30;
	final static int code = 111;
	final Integer number;
	int balance = 0;
	boolean call = false;
	boolean operator = false;
	
	public Operator1(int number) {
			this.number = Integer.valueOf(String.valueOf(code) + String.valueOf(number));
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public int getTariffSO() {
		return tariffSO;
	}
	
	public int getTariffDO() {
		return tariffDO;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void addBalance(int balance) {
		if (balance > 0) {
			this.balance += balance;
		} else {
			System.out.println("Խնդրում ենք մուտքագրել դրական գումար։");
		}
	}
	
	public void call(int code, int number) {
		call = true;
		if (code == this.code) {
			operator = true;
		}
	}

	public void talk(int minute) {
		if (minute > 0) {
			if (call == true) {
				if (balance - (minute * tariffSO) >= 0 && operator == true) {
					balance -= minute * tariffSO;
				} else if (balance - (minute * tariffDO) >= 0) {
					balance -= minute * tariffDO;
				} else {
					System.out.println("Ձեր հաշիվը բավարար չէ զանգ կատարելու համար։");
				}
				call = false;
				operator = false;
			} else {
				System.out.println("Խոսելուց առաջ խնդրում ենք զանգ կատարել։");
			}
		} else {
			System.out.println("Խնդրում ենք մուտքագրել դրական թիվ։");
		}
	}

}

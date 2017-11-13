
public class Operator2 extends SIMCard {
	
	static int tariffSO = 4;
	static int tariffDO = 40;
	final static int code = 222;
	final Integer number;
	int balance = 0;
	boolean call = false;
	boolean operator = false;
	int bonus = 0;
	
	public Operator2(int number) {
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
			validNumber();
		}
	}
	
	public void call(int code, int number) {
		call = true;
		if (code == this.code) {
			operator = true;
		}
	}

	@Override
	public void talk(int minute) {
		if (minute > 0) {
			if (call == true) {
				if (balance - (minute * tariffSO) >= 0 && operator == true) {
					balance -= minute * tariffSO;
					bonus += minute / 10;
				} else if (balance - (minute * tariffDO) >= 0) {
					balance -= minute * tariffDO;
					bonus += minute / 20;
				} else {
					noBalance();
				}
				call = false;
				operator = false;
			} else {
				noCall();
			}
		} else {
			validNumber();
		}
	}
	
	public int getBonus() {
		return bonus;
	}
	
	public void useBonus() {
		if (bonus > 0) {
			balance += bonus;
		} else {
			System.out.println("Ցավոք, Դուք բոնուս չունեք։");
		}
	}

}

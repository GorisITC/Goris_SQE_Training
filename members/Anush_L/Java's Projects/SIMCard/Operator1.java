
public class Operator1 extends SIMCard {
	
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
				} else if (balance - (minute * tariffDO) >= 0) {
					balance -= minute * tariffDO;
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

}

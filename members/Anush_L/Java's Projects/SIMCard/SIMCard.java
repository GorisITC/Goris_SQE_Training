
public abstract class SIMCard {
	
	public abstract Integer getNumber();

	public abstract int getBalance();

	public abstract void addBalance(int balance);
	
//	Tariff with same operator
	public abstract int getTariffSO();
		
//	Tariff with different operator
	public abstract int getTariffDO();
	
	public abstract void call(int code, int number);
	
	public abstract void talk(int minute);
	
	public void emergencyCall(int number) {
		if (number == 101 || number == 102 || number == 103) {
			System.out.println("Դուք կապնվել եք․․․");
		} else {
			System.out.println("Խնդրում ենք մուտքագրել ճիշտ համար։");
		}
	}
	
	public void noBalance() {
		System.out.println("Ձեր հաշիվը բավարար չէ զանգ կատարելու համար։");
	}
	
	public void noCall() {
		System.out.println("Խոսելուց առաջ խնդրում ենք զանգ կատարել։");
	}
	
	public void validNumber() {
		System.out.println("Խնդրում ենք մուտքագրել դրական թիվ։");
	}
	
}

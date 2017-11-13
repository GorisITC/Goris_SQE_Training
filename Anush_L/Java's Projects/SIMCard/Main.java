
public class Main {
	
	public static void main (String[] args) {
		try {
			Operator1.tariffDO = 50;
			Operator1.tariffSO = 5;
			Operator2.tariffSO = 4;
			Operator1 sim1 = new Operator1(546554);
			Operator2 sim2 = new Operator2(656555);
			System.out.println(sim1.getNumber());
			System.out.println(sim1.getTariffSO());
			sim1.addBalance(500);
			sim1.call(111, 655465);
			sim1.talk(500);
			System.out.println(sim1.getBalance());
			System.out.println(sim2.getTariffSO());
		} catch (NumberFormatException e) {
			System.out.println("Խնդրում ենք ընտրել վավեր համար։");
		}
	}

}

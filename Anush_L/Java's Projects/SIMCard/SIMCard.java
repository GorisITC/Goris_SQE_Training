
public interface SIMCard {
	
	public Integer getNumber();

	public int getBalance();

	public void addBalance(int balance);
	
//	Tariff with same operator
	public int getTariffSO();
		
//	Tariff with different operator
	public int getTariffDO();
	
	public void call(int code, int number);
	
	public void talk(int minute);
	
}

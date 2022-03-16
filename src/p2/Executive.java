package p2;

public class Executive extends Employee{
	
	private double bonus;
	
	public Executive(String n, String a, String p, String numeroSSarg, double sueldoarg, double bonusarg) {
		super(n,a,p,numeroSSarg,sueldoarg);
		bonus=bonusarg;
	}
	
	public double pay() {
		System.out.println(toString());
		return 3000 + bonus;
	}
	
	public void awardBonus(double execBonus) {
		bonus=execBonus;
	}

}

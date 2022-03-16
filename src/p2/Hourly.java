package p2;

public class Hourly extends Employee{
	
	protected int horasTrabajadas;
	
	public Hourly(String n, String a , String p, String numeroSSarg , double sueldoarg , int horasTrabajadasarg) {
		
			super(n,a,p,numeroSSarg,sueldoarg);
			horasTrabajadas=horasTrabajadasarg;
		
	}

	
	public double pay() {
		System.out.println(toString());
		return 8*horasTrabajadas;
	}
	
	public void añadirHoras(int horasExtra) {
		
		horasTrabajadas += horasExtra;
		
	}
	
	public String toString() {
		
		return super.toString() + "\nHoras que ha trabajado : "
				+ horasTrabajadas;
		
	}
	
}

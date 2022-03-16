package p2;

public abstract class Employee extends StaffMember {
	
	protected String numeroSS;
	protected double sueldo;
	
	public Employee(String n, String a, String p, String numeroSSarg, double sueldoarg) {
	
		super(n,a,p);
		numeroSS=numeroSSarg;
		sueldo=sueldoarg;
	}
	
	public String toString() {
		return super.toString() + "\nNumero seguridad social: " + numeroSS + "\nSueldo: " + sueldo;
	}

	public double pay() {
		return 2100;
	}
}

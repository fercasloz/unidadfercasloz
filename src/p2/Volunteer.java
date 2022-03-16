package p2;

public class Volunteer extends StaffMember {
	
	public Volunteer(String n, String a, String p) {
		
		super(n,a,p);
	}

	public double pay() {
		
		System.out.println(toString());
		
		return 600;
	}
	
	
	
	
}

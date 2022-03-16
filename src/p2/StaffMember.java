package p2;

public abstract class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	public StaffMember(String n , String a , String p) {
		name = n;
		address = a;
		phone = p;
		
	}
	
	public String toString() {
		
		return "\nDatos: \n" + "Nombre:" + name + "\nDireccion : " + address + "\nTelefono: " + phone  ;
	}
	
	public abstract double pay();

}

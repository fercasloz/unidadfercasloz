package p2;

public class Firm{

	public static void main(String[]args) {
		
		Staff Aux_StaffMember = new Staff();
		
		StaffMember Voluntario= new Volunteer ("Guille", "C/Torrepachecho" , "655854520");
				Aux_StaffMember.añadir(Voluntario);
				
		StaffMember Ejecutivo= new Executive ("JuanVicente", "C/Olimpo","666555111","001122", 800, 1000);
				Aux_StaffMember.añadir(Ejecutivo);
				
		StaffMember Temporal= new Hourly("Jose","C/Murcia","654789123","457896",300,400);
				Aux_StaffMember.añadir(Temporal);
				
	    Aux_StaffMember.payday();
		
		
	}
	
	
	
}

package p2;

public class Staff {
	
	private StaffMember[] staffList;
	private int NumeroMiembroStaff;
	
	
	public Staff() {
		
		NumeroMiembroStaff = 0;
		staffList = new StaffMember[100];

	}
	
	//metodo para a�adir miembros
	
	public void a�adir(StaffMember aux) {
		
		staffList[NumeroMiembroStaff]=aux;
		NumeroMiembroStaff++;
	}
	
	public void payday() {
		for(int i=0; i<NumeroMiembroStaff; i++) {
			staffList[i].pay();
		}
	}

}

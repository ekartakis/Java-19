import java.util.Scanner;

public class Staff {

	private String name; //όνομα καθηγητή/εργαζομένου
	private String status;
	public static Staff[] emploees = new Staff[500]; //Στατικός Πίνακας 500 θέσεων για τα αντικείμενα Staff
	static int count = 0;

	//Δημιουργία κατασκευαστή της κλάσης για τη δημιουργία των αντικειμένων Staff
	public Staff(String name, String status) {
		emploees[count] = this;
		count++;
		this.name = name;
		this.status = status;
	} //Τέλος Κατασκευαστή
	
	//Δημιουργία μεθόδου get για την τιμή της μεταβλητής String name
	public String getName() {
		return name;
	} //Τέλος Μεθόδου
	
	//Δημιουργία μεθόδου get για την τιμή της μεταβλητής String status
	public String getStatus() {
		return status;
	} //Τέλος Μεθόδου
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public void setName(String name) {
		this.name=name;
	}

	public static void newEmploee() {
		
		Scanner input = new Scanner(System.in);
		boolean found=false;
		int pos_found = 0;
		
		System.out.print("Εισάγετε το όνομα του μέλους του προσωπικού: ");
		String name=input.nextLine();
		
		for (int i=0; i<emploees.length; i++) {
			if (emploees[i].getName()==name) {
				found=true;
				pos_found=i;
				break;
			}
		}
		
		Scanner input2 = new Scanner(System.in);
		String result;
		do {
			System.out.print("Εισάγετε το αποτέλεσμα του καθηγητή (Θ/Α): ");
			result=input2.nextLine();
		} while (result!="Θ" || result!="Α");
		
		if(found==true) {
			emploees[pos_found].setStatus(result);
		}
		else {
			Staff st = new Staff(id, name, result);
		}
			
	}
	
} //Τέλος Κλάσης
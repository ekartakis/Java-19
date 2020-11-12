import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		int choice;
		
		displayMenu(); //Εμφάνιση μενού
		choice=input1.nextInt();
			
		//Έλεγχος εγκυρότητας επιλογής χρήστη
		while (choice<0 || choice>2) {
			System.out.println("Η επιλογή που εισάγατε δεν είναι έγκυρη. Παρακαλώ προσπαθήστε πάλι.");
			displayMenu(); //Εμφάνιση μενού
			choice = input1.nextInt();
		}
		
		switch(choice) {

		case 0:
			break; //Έξοδος από το μενού επιλογών
		case 1:
			Student.newStudent(); 
			break;
		case 2:
			Staff.newEmploee();
			break;
		
		}

	}
	
	public static void displayMenu() {
		System.out.println("0. Έξοδος");
		System.out.println("1. Καταχώρηση αποτελέσματος φοιτητή");
		System.out.println("2. Καταχώρηση αποτελέσματος εργαζομένου");
		System.out.print("Εισάγετε επιλογή [0-2]: ");
	}

	Student s1 = new Student(8190064, "Ελευθέριος Καρτάκης", "Α");
	Student s2 = new Student(8190021, "Αλέξανδρος Γεωργούλιας", "Α");
	Student s3 = new Student(8190036, "Φρατζέσκος Δαφερέρας", "Α");
	Student s4 = new Student(8190044, "Ανδρέας Δρόσος", "Α");
	Student s5 = new Student(8190106, "Δημήτριος Μαυροειδής", "Α");
	Student s6 = new Student(8190132, "Ιωάννα-Σωτηρία Παπαδημούλη", "Α");
	Student s7 = new Student(8190325, "Κωνσταντίνος Τζιαφέτας", "Α");
	
}

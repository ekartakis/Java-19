import java.util.Scanner;

public class Student {

	private int id; //ID μαθητή
	private String name; //όνομα μαθητή
	private String status;
	public static Student[] students = new Student[10000]; //Στατικός Πίνακας 10000 θέσεων για τα αντικείμενα Student
	static int count = 0;
	public static int total_neg = 0;
	public static int total_pos = 0;

	//Δημιουργία κατασκευαστή της κλάσης για τη δημιουργία των αντικειμένων Student
	public Student(int id, String name, String status) {
		students[count] = this;
		count++;
		this.id = id;
		this.name = name;
		this.status = status;
	} //Τέλος Κατασκευαστή

	//Δημιουργία μεθόδου get για την τιμή της μεταβλητής int ID
	public int getID() {
		return id;
	} //Τέλος Μεθόδου

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

	public void setID(int id) {
		this.id=id;
	}

	//Δημιουργία μεθόδου για συμπλήρωση αποτελέσματος από μαθητές που έχουν κάνει τεστ ανίχνευσης COVID19.
	public static void newStudent() {
        String name;
		Scanner input = new Scanner(System.in);
		String result;

			do {
				System.out.print("Εισάγετε το αποτέλεσμα του φοιτητή (Θ/Α): ");
				result=input.nextLine();
			} while (result != "Θ" || result != "Α");
			if (result == "Θ") {
				positive();
			} else {
				System.out.println("Εισάγετε όνομα φοιτητή.");
				name = input.nextLine();
				negative();
		    }


	 }
	
	 //Δημιουργία κλάσης για αρνητικά τεστ
	 public static void negative() {
	 total_neg++;
	 System.out.println("Stay safe and protect yourself");
     }
	 
	 //Δημιουργία κλάσης για θετικά τεστ
	 public static void positive() {
		 changeStatus("P");
		 String answer;
		 String answer_2;
		 String connection;
		 total_pos++;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Πρέπει να μείνετε σε καραντίνα για 14 μέρες." + "Μπορείτε να επιστρέψετε στο πανεπιστήμιο όταν τα συμπτώματα υποχωρήσουν.");
		 System.out.println("Έχετε έρθει σε επαφή με μέλη της πανεπιστημιακής κοινότητας τις τελευταίες 48 ώρες;");
		 
		 do {
		 answer = scan.nextLine();
	     } while(answer!="Ναι" || answer!="Οχι");
	    	 
		 if (answer=="Ναι") {
		 do {
			 System.out.println("Γράψτε το όνομα της επαφής.");
			 connection = scan.nextLine();
             positive_contacts();
             System.out.println("Υπάρχει κάποια άλλη επαφή;");
             
             do {
             answer_2 = scan.nextLine();
             } while(answer_2 != "Ναι" || answer != "Οχι");
             
	     } while (answer_2 != "Οχι");
	     }

    }
	 
     //Δημιουργία κλάσης για τις ενδοπανεπιστημιακές επαφές των επιβεβαιωμένων κρουσμάτων
     public static void positive_contacts() {
		changeStatus("/");
		Scanner dm = new Scanner(System.in);
		int p = 0;
		int n = 0;
		String an1;
		System.out.println("Έχετε εκδηλώσει κάποιο από τα παρακάτω συμπτώματα");
		System.out.println("Πυρετός:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
	    if (an1 == "Ναι") {
			p = p + 1;
		}
		System.out.println("Fever:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
	    if (an1 == "Ναι") {
			p = p + 1;
		}
		System.out.println("Βήχας:");
	    do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
	    if (an1 == "Ναι") {
			p = p + 1;
		}
		System.out.println("Δύσπνοια:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
		if (an1 == "Ναι") {
			p = p + 1;
		}
		System.out.println("Ανοσμία:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
		if (an1 == "Ναι") {
			p = p + 1;
		}
		System.out.println("Αγευσία:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "Ναι" || an1 != "Οχι");
		if (an1 == "Ναι") {
			p = p + 1;
		}
		if (p > 1) {
			System.out.println("Πρέπει να κάνετε τεστ ανίχνευσης COVID19 και να μείνετε σε καραντίνα για τις επόμενες 14 μέρες ανεξάρτητα από το αποτέλεσμα.");
		} else {
		    System.out.println("Πονοκέφαλος:");
		    do {
		        an1 = dm.nextLine();
	        } while (an1 != "Ναι" || an1 != "Οχι");
		    if (an1 == "Ναι") {
			    n = n + 1;
		    }
		    System.out.println("Ρίγος:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "Ναι" || an1 != "Οχι");
		    if (an1 == "Ναι") {
			    n = n + 1;
		    }
		    System.out.println("Μυαλγίες:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "Ναι" || an1 != "Οχι");
		    if (an1 == "Ναι") {
			    n = n + 1;
		    }
		    System.out.println("Ναυτίες:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "Ναι" || an1 != "Οχι");
		    if (an1 == "Ναι") {
		        n = n + 1;
		    }
		    System.out.println("Διάρροια:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "Ναι" | an1 != "Οχι");
		    if (an1 == "Ναι") {
			    n = n + 1;
		    }
		    if (n > 1) {
				System.out.println("Πρέπει να μείνετε σε καραντίνα για τις επόμενες 10 μέρες. Εάν τα συμπτώματα δεν υποχωρήσουν πρέπει να κάνετε τεστ ανίχνευσης COVID19.");
			}
	    }
	    if (p <=1 || n<=1) {
			System.out.println("Εφόσον έχετε έρθει σε επαφή με επιβεβαιωμένο κρούσμα, πρέπει να μείνετε σε καραντίνα για τις επόμενες 7 μέρες. Εάν παρουσιάσετε κάποιο από τα προαναφερθέντα συμπτώματα πρέπει να κάνετε test ανίχνευσης COVID19.");
		}

    }
     
    //Δημιουργία κλάσης για την αλλαγή του status ασθένειας φοιτητή
    public static void changeStatus(String status) {
	    Scanner input = new Scanner(System.in);
	    int id2;
	    boolean found_sc=false;
	    int con_found_sc = 0;
	    do {
			System.out.print("Πληκτρολογήστε ΑΜ φοιτητή. ");
		    id2=input.nextInt();
		} while (id2<1000000 || id2>9999999);

	        for (int i=0; i<students.length; i++) {
	            if (students[i].getID()==id2) {
	                found_sc=true;
	                con_found_sc=i;
	                break;
	            }
		    }

	if(found_sc == true) {
	    students[con_found_sc].setStatus(status);

	}



}

}
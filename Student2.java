import java.util.Scanner;

public class Student {

	private int id; //ID μαθητή
	private String name; //όνομα μαθητή
	private String status;
	public static Student[] students = new Student[10000]; //Στατικός Πίνακας 10000 θέσεων για τα αντικείμενα Student
	static int count = 0;
	public int total_pos = 0;

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

	public static void newStudent() {

		Scanner input = new Scanner(System.in);


		Scanner input2 = new Scanner(System.in);
		String result;

			do {
				System.out.print("Εισάγετε το αποτέλεσμα του φοιτητή (Θ/Α): ");
				result=input2.nextLine();
			} while (result!="P" || result!="N");
			if (result == "P") {
				positive();
			} else {
				negative();
		    }


	 }
	 public static void negative(); {
	 total_neg++;
	 System.out.println("The student is: " +Student(a, b, c));
	 System.out.println("Stay safe and protect yourself");

     }
	 public static void positive() {
		 changeStatus("P");
		 String answer;
		 String answer_2;
		 String connection;
		 total_pos++;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("You must stay in quarantine for fourteen days." + "You can only return to the university campus after the symptoms have passed.");
		 System.out.println("Have you had any close contacts with other members of the university community the past 48 hours?");
		 do {
		 answer = scan.nextLine();
	     } while(answer!="yes" | answer!="no")
		 if (answer=="yes") {
		 do {
			 System.out.println("Write the name of the contact.");
			 connection = scan.nextLine();
             positivecontacts();
             System.out.println("Any other contacts related to the University?")
             do {
             answer_2 = scan.nextLine();
             } while(answer_2 != "yes" | answer! = "no")
	     } while (answer_2 == "yes")
	     }

    }

     public static void positive_contacts() {
		changeStatus("/");
		Scanner dm = new Scanner(System.in);
		int p = 0;
		int n = 0;
		String an1;
		System.out.println("Do you have any of the following symptoms?");
		System.our.ptintln("Fever:");
		do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
	    if (an1 == "yes") {
			p = p + 1;
		}
		System.our.ptintln("Fever:");
		do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
	    if (an1 == "yes") {
			p = p + 1;
		}
		System.our.ptintln("Cough:");
	    do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
	    if (an1 == "yes") {
			p = p + 1;
		}
		System.our.ptintln("Βreathlessness:");
		do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
		if (an1 == "yes") {
			p = p + 1;
		}
		System.our.ptintln("Anosmia:");
		do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
		if (an1 == "yes") {
			p = p + 1;
		}
		System.our.ptintln("Τastelessness:");
		do {
		an1 = dm.nextLine;
	    } while (an1 != "yes" | an1 != "no")
		if (an1 == "yes") {
			p = p + 1;
		}
		if (p > 1) {
			System.out.println("You must have a covid-19 test and stay in 14-days quarantine no matter the result.")
		} else {
		    System.our.ptintln("Headache:");
		    do {
		        an1 = dm.nextLine;
	        } while (an1 != "yes" | an1 != "no")
		    if (an1 == "yes") {
			    n = n + 1;
		    }
		    System.our.ptintln("Shiver:");
		    do {
		        an1 = dm.nextLine;
		    } while (an1 != "yes" | an1 != "no")
		    if (an1 == "yes") {
			    n = n + 1;
		    }
		    System.our.ptintln("Myalgias:");
		    do {
		        an1 = dm.nextLine;
		    } while (an1 != "yes" | an1 != "no")
		    if (an1 == "yes") {
			    n = n + 1;
		    }
		    System.our.ptintln("Nautia:");
		    do {
		        an1 = dm.nextLine;
		    } while (an1 != "yes" | an1 != "no")
		    if (an1 == "yes") {
		        n = n + 1;
		    }
		    System.our.ptintln("Diarrhea:");
		    do {
		        an1 = dm.nextLine;
		    } while (an1 != "yes" | an1 != "no")
		    if (an1 == "yes") {
			    n = n + 1;
		    }
		    if (n > 1) {
				System.out.println("You must stay in quarantine for the following 10 days. In case the symptoms do not subside, you must have the covid test.")
			}
	    }
	    if (p <=1 || n<=1) {
			System.out.println("Since you have come into contact with a confirmed case, you have to stay in quarantine for the next 7 days. In case any more of the symptoms mentioned above appear, you must have the covid test."

		}

    }
    public static void changeStatus(String status) {
	    Scanner input = new Scanner(System.in);
	    int contact_id;
	    boolean found_sc=false;
	    int con_found_sc = 0;
	    do {
			System.out.print("Enter the student's academic id: ");
		    id=input.nextInt();
		} while (id<1000000 || id>9999999);

	        for (int i=0; i<students.length; i++) {
	            if (students[i].getID()==id) {
	                found_sc=true;
	                con_found_sc=i;
	                break;
	            }
		    }

	if(con_found_sc == true) {
	    Students[con_found_sc].setStatus(status);

	}



}
}
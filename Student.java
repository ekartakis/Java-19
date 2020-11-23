import java.util.Scanner;

public class Student {

	private int id; //Student AM 
	private String name; //Student name
	private String status; //Student status
	private boolean cl_contact; //indicates if Student object is a close contact of a positive case
	public static Student[] students = new Student[10000]; //Static array of 10000 Student objects
	static int count = 0;
	public static int total_neg = 0;
	public static int total_pos = 0;

	//Creation of Student objects constractor
	public Student(int id, String name, String status, boolean cl_contact) {
		students[count] = this;
		count++;
		this.id = id;
		this.name = name;
		this.status = status;
		this.cl_contact=cl_contact;
	} //End of constractor

	//Method get for int ID
	public int getID() {
		return id;
	} //End of method

	//Method get for String name
	public String getName() {
		return name;
	} //End of method

	//Method get for String status
	public String getStatus() {
		return status;
	} //End of method
	
	//Method get for boolean cl_contact
	public boolean cl_contact() {
		return cl_contact;
	} //End of method

	public void setStatus(String status) {
		this.status=status;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setID(int id) {
		this.id=id;
	}

	//Method for new entry of Student covid-19 test result by the secretariat
	public static void newStudent() {
        String name;
		Scanner input = new Scanner(System.in);
		String result;
		System.out.print("Enter the name of the student: ");
		name=input.nextLine();
			
		do {
			System.out.print("Enter the result of the test (P/N): ");
			result=input.nextLine();
		} while (result != "P" || result != "N");
		if (result == "P") {
			positive();
		} 
		else {
			negative();
		}

	}
	
	//Method for negative tests
	public static void negative() {
		total_neg++;
     }
	 
	//Method for positive cases
	public static void positive() {
		changeStatus("P");
		String answer;
		String answer_2;
		int num;
		String connection;
		total_pos++;
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("You need to stay in quarantine for 14 days. You may return back to the university after all the symptoms resolve");
		
		System.out.println("Have you come in close contact with other AUEB students within the last 14 days?");
		 
		do {
			answer = scan1.nextLine();
	     	} while(answer!="Yes" || answer!="No");
	    	 
		if (answer=="Yes") {
			System.out.println("How many students have you come in close contact with?");
			num=scan1.nextInt();
			
			for(int i=0; i<num; i++) {
				System.out.println("Enter student id: ");
				close_contacts();
			}
		}
			
		System.out.println("Have you come in close contact with any AUEB staff members within the last 14 days?");
		 
		do {
			answer = scan2.nextLine();
		} while(answer!="Yes" || answer!="No");
	    	 
		if (answer=="Yes") {
			System.out.println("How many emploees have you come in close contact with?");
			num=scan1.nextInt();
			
			for(int i=0; i<num; i++) {
				System.out.println("Enter emploee name: ");
				close_contacts();
			}
		}
		
	}
	 
	//Method for close contacts
    public static void close_contacts() {
    	
    	boolean cl_contact = true;
		Scanner dm = new Scanner(System.in);
		int p = 0;
		int n = 0;
		String an1;
		System.out.println("Have you manifested any of the symptoms mentioned below?");
		
		System.out.print("Fever: ");
		do {
			an1 = dm.nextLine();
	   	} while (an1 != "Yes" || an1 != "No");
	    if (an1 == "Yes") {
			p = p + 1;
		}
		
		System.out.print("Cough: ");
	    	do {
			an1 = dm.nextLine();
	    	} while (an1 != "Yes" || an1 != "No");
	    	if (an1 == "Yes") {
			p = p + 1;
		}
	    	
		System.out.print("Dyspnea: ");
		do {
			an1 = dm.nextLine();
	    	} while (an1 != "Yes" || an1 != "No");
		if (an1 == "Yes") {
			p = p + 1;
		}
		
		System.out.print("Anosmia: ");
		do {
			an1 = dm.nextLine();
	    	} while (an1 != "Yes" || an1 != "No");
		if (an1 == "Yes") {
			p = p + 1;
		}
		
		System.out.println("Ageusia: ");
		do {
			an1 = dm.nextLine();
	    } while (an1 != "Yes" || an1 != "No");
		if (an1 == "Yes") {
			p = p + 1;
		}
		
		if (p > 1) {
			System.out.println("You need to do the covid-19 test, as well as stay in quarantine for 14 days");
		} 
		else {
			System.out.print("Headaque: ");
		    	do {
		        	an1 = dm.nextLine();
	        	} while (an1 != "Yes" || an1 != "No");
		    	if (an1 == "Yes") {
		    		n = n + 1;
		    	}
		    
		    System.out.print("Shiver: ");
		   	do {
		        an1 = dm.nextLine();
		    } while (an1 != "Yes" || an1 != "No");
		    if (an1 == "Yes") {
			   	n = n + 1;
		    }
		    
		    System.out.print("Myalgias: ");
		    do {
		       	an1 = dm.nextLine();
		    } while (an1 != "Yes" || an1 != "No");
		    if (an1 == "Yes") {
			   	n = n + 1;
		    }
		    
		    System.out.print("Queasiness: ");
		    do {
		       	an1 = dm.nextLine();
		    } while (an1 != "Yes" || an1 != "No");
		    if (an1 == "Yes") {
		       	n = n + 1;
		    }
		    
		    System.out.print("Diarrhea: ");
		    do {
		       	an1 = dm.nextLine();
		    } while (an1 != "Yes" | an1 != "No");
		    if (an1 == "Yes") {
			   n = n + 1;
		    }
		    if (n > 1) {
				System.out.println("You need to stay in quarantine for at least 10 days and, in case the symptoms do not resolve, you should then be tested for covid-19.");
			}
	    	 
		    if (p <=1 || n<=1) {
		    	System.out.println("Since you have come in contact with a positive case, you should stay safe and, if you manifest any of the symptoms mentioned above, you may do the covid-19 test");
		    }

    	}
		
    }
     
    //Method for status change
	public static void changeStatus(String status) {
		
		Scanner input = new Scanner(System.in);
	    int id2;
	   	boolean found_sc=false;
	    int con_found_sc = 0;
	    
	    do {
			System.out.print("Enter student id: ");
		    id2=input.nextInt();
		} while (id2<8100000 || id2>8199999);

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


//The class creates 2500 (AUEB) emails for Student objects
public class EmailGenerator {
	
	//Prints 2500 emails in "insert" SQL format, so that, by copying the print of the method and pasting it to the window where SQL code is executed, those 2500 emails are created in the database
	public static void dataBase() {
		int AM = 8190001;
		for(int i=1 ; i<= 1250; i++) {
			System.out.println("UPDATE Student SET Email='t"+ AM + "@aueb.gr' WHERE AM=" + AM + ";");
			AM++;
			System.out.println("UPDATE Student SET Email='t"+ AM + "@aueb.gr' WHERE AM=" + AM + ";");
			AM++;
		}
	}

}

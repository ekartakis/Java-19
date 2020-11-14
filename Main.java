import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input1 = new Scanner(System.in);
		int choice;
		
		displayMenu(); //ÅìöÜíéóç ìåíïý
		choice=input1.nextInt();
			
		//¸ëåã÷ïò åãêõñüôçôáò åðéëïãÞò ÷ñÞóôç
		while (choice<0 || choice>2) {
			System.out.println("Ç åðéëïãÞ ðïõ åéóÜãáôå äåí åßíáé Ýãêõñç. Ðáñáêáëþ ðñïóðáèÞóôå ðÜëé.");
			displayMenu(); //ÅìöÜíéóç ìåíïý
			choice = input1.nextInt();
		}
		
		switch(choice) {

		case 0:
			break; //¸îïäïò áðü ôï ìåíïý åðéëïãþí
		case 1:
			Student.newStudent(); 
			break;
		case 2:
			Staff.newEmploee();
			break;
		
		}

	}
	
	public static void displayMenu() {
		System.out.println("0. ¸îïäïò");
		System.out.println("1. Êáôá÷þñçóç áðïôåëÝóìáôïò öïéôçôÞ");
		System.out.println("2. Êáôá÷þñçóç áðïôåëÝóìáôïò åñãáæïìÝíïõ");
		System.out.print("ÅéóÜãåôå åðéëïãÞ [0-2]: ");
	} //hi

	Student s1 = new Student(8190064, "ÅëåõèÝñéïò ÊáñôÜêçò", "Á");
	Student s2 = new Student(8190021, "ÁëÝîáíäñïò Ãåùñãïýëéáò", "Á");
	Student s3 = new Student(8190036, "ÖñáôæÝóêïò ÄáöåñÝñáò", "Á");
	Student s4 = new Student(8190044, "ÁíäñÝáò Äñüóïò", "Á");
	Student s5 = new Student(8190106, "ÄçìÞôñéïò ÌáõñïåéäÞò", "Á");
	Student s6 = new Student(8190132, "ÉùÜííá-Óùôçñßá Ðáðáäçìïýëç", "Á");
	Student s7 = new Student(8190325, "Êùíóôáíôßíïò ÔæéáöÝôáò", "Á");
	
}

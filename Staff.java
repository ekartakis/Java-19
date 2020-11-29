import java.util.Random;

//The class creates 50 AUEB Staff members
public class StaffGenerator {
	
	// The method prints 2.500 Staff members in object creation format (Staff AM = new Staff(AM, name, surname, status, closecontact), so that, 
	// by copying the print of the method and pasting it to the class of the creation of Staff objects, the Staff members are automatically created. 
	// In this way, we will have the same elements for every execution of the program.
	public static void genStaff() {
	
	
	int counter = 1;
	String namesmen[] = new String [50];
	String surnamemen[] = new String [60];
	String nameswomen[] = new String [50];
	String surnamewomen[] = new String [60];
	Random rand = new Random();
	
	//Creation of 50 male names	
	namesmen[0] = "Νικόλαος";
	namesmen[1] = "Γεώργιος";
	namesmen[2] = "Δημήτριος";
	namesmen[3] = "Κωνσταντίνος";
	namesmen[4] = "Μάριος";
	namesmen[5] = "Παρασκευάς";
	namesmen[6] = "Βασίλης";
	namesmen[7] = "Μιχαήλ";
	namesmen[8] = "Ιωάννης";
	namesmen[9] = "Θεόδωρος";
	namesmen[10] = "Χρήστος";
	namesmen[11] = "Σπυρίδων";
	namesmen[12] = "Παναγιώτης";
	namesmen[13] = "Αντώνιος";
	namesmen[14] = "Βασίλειος";
	namesmen[15] = "Εμμανουήλ";
	namesmen[16] = "Αθανάσιος";
	namesmen[17] = "Εμμανουήλ";
	namesmen[18] = "Ευάγγελος";
	namesmen[19] = "Φρατζέσκος";
	namesmen[20] = "Ηλίας";
	namesmen[21] = "Αλέξανδρος";
	namesmen[22] = "Άγγελος";
	namesmen[22] = "Απόστολος";
	namesmen[23] = "Χαράλαμπρος";
	namesmen[24] = "Σταύρος";
	namesmen[25] = "Πέτρος";
	namesmen[26] = "Στυλιανός";
	namesmen[27] = "Σωτήριος";
	namesmen[28] = "Ανδρέας";
	namesmen[29] = "Θωμάς";
	namesmen[30] = "Στέφανος";
	namesmen[31] = "Ελευθέριος";
	namesmen[32] = "Παύλος";
	namesmen[33] = "Κυριάκος";
	namesmen[34] = "Λεωνίδας";
	namesmen[35] = "Αχιλλέας";
	namesmen[36] = "Σωκράτης";
	namesmen[37] = "Ορέστης";
	namesmen[38] = "Ανάργυρος";
	namesmen[39] = "Γρηγόριος";
	namesmen[40] = "Λάζαρος";
	namesmen[41] = "Γεράσιμος";
	namesmen[42] = "Δήμος";
	namesmen[43] = "Αργύριος";
	namesmen[44] = "Νεκτάριος";
	namesmen[45] = "Χριστόφορος";
	namesmen[46] = "Φίλιππός";
	namesmen[47] = "Θεοχάρης";
	namesmen[48] = "Ζαχαρίας";
	namesmen[49] = "Ανέστης";
	
	//Creation of 60 male surnames
	surnamemen[0] = "Αλεξίου";
	surnamemen[1] = "Δημητρακόπουλος";
	surnamemen[2] = "Διαμαντόπουλος";
	surnamemen[3] = "Αθανασίου";
	surnamemen[4] = "Ελευθερόπουλος";
	surnamemen[5] = "Αναγνωστάκης";
	surnamemen[6] = "Ευθιμιάδης";
	surnamemen[7] = "Ζέρβας";
	surnamemen[8] = "Ανδρέου";
	surnamemen[9] = "Ζαφειρόπουλος";
	surnamemen[10] = "Αντωνόπουλος";
	surnamemen[11] = "Ηλιόπουλος";
	surnamemen[12] = "Αναγνώστου";
	surnamemen[13] = "Θεοδορίδης";
	surnamemen[14] = "Αποστολάκης";
	surnamemen[15] = "Θεοδοσίου";
	surnamemen[16] = "Ιωαννίδης";
	surnamemen[17] = "Βαμβακάς";
	surnamemen[18] = "Ιωάννου";
	surnamemen[19] = "Βασιλείου";
	surnamemen[20] = "Καλογεράς";
	surnamemen[21] = "Βασιλειάδης";
	surnamemen[22] = "Καλογιάννης";
	surnamemen[23] = "Βασιλόπουλος";
	surnamemen[24] = "Καραμάνος";
	surnamemen[25] = "Βογιατζής";
	surnamemen[26] = "Κατράκης";
	surnamemen[27] = "Βιτάλης";
	surnamemen[28] = "Κεχαγιάς";
	surnamemen[29] = "Γαλάνης";
	surnamemen[30] = "Γαλανόπουλος";
	surnamemen[31] = "Κεφαλογιάννης";
	surnamemen[32] = "Κοκκινάκης";
	surnamemen[33] = "Γεωργίου";
	surnamemen[34] = "Γεωργιάδης";
	surnamemen[35] = "Κοτζιάς";
	surnamemen[36] = "Γιαννόπουλος";
	surnamemen[37] = "Γιαννακόπουλος";
	surnamemen[38] = "Κουβέλης";
	surnamemen[39] = "Γιάνναρης";
	surnamemen[40] = "Κουντουριώτης";
	surnamemen[41] = "Γιαννούλης";
	surnamemen[42] = "Κυριακίδης";
	surnamemen[43] = "Γούναρης";
	surnamemen[44] = "Κωσταντίνου";
	surnamemen[45] = "Κωσταντινόπουλος";
	surnamemen[46] = "Δασκαλόπουλος";
	surnamemen[47] = "Δασκαλάκης";
	surnamemen[48] = "Δρόσος";
	surnamemen[49] = "Κατσιγιάννης";
	surnamemen[50] = "Ανδρεάδης";
	surnamemen[51] = "Γεωργούλιας";
	surnamemen[52] = "Μαυροειδής";
	surnamemen[53] = "Τζιαφέτας";
	surnamemen[54] = "Δαφερέρας";
	surnamemen[55] = "Δρόσος";
	surnamemen[56] = "Καρτάκης";
	surnamemen[57] = "Αργυρός";
	surnamemen[58] = "Ασλανίδης";
	surnamemen[59] = "Παπαδόπουλος";
	
	//Creation of 50 female names
	nameswomen[0] = "Μαρία";
	nameswomen[1] = "Ελένη";
	nameswomen[2] = "Αικατερίνη";
	nameswomen[3] = "Βασιλική";
	nameswomen[4] = "Γεωργία";
	nameswomen[5] = "Σοφία";
	nameswomen[6] = "Αναστασία";
	nameswomen[7] = "Ευαγγελία";
	nameswomen[8] = "Ιωάννα";
	nameswomen[9] = "Δήμητρα";
	nameswomen[10] = "Ειρήνη";
	nameswomen[11] = "Παναγιώτα";
	nameswomen[12] = "Χριστίνα";
	nameswomen[13] = "Κωνσταντίνα";
	nameswomen[14] = "Αννα";
	nameswomen[15] = "Αγγελική";
	nameswomen[16] = "Δέσποινα";
	nameswomen[17] = "Παρασκευή";
	nameswomen[18] = "Φωτεινή";
	nameswomen[19] = "Αλεξάνδρα";
	nameswomen[20] = "Κυριακή";
	nameswomen[21] = "Θεοδώρα";
	nameswomen[22] = "Σταυρούλα";
	nameswomen[23] = "Χρυσούλα";
	nameswomen[24] = "Καλλιόπη";
	nameswomen[25] = "Αθανασία";
	nameswomen[26] = "Ελευθερία";
	nameswomen[27] = "Αθηνά";
	nameswomen[28] = "Στυλιανή";
	nameswomen[29] = "Ολγα";
	nameswomen[30] = "Ζωή";
	nameswomen[31] = "Ελισάβετ";
	nameswomen[32] = "Ευγενία";
	nameswomen[33] = "Μαρίνα";
	nameswomen[34] = "Αντωνία";
	nameswomen[35] = "Ουρανία";
	nameswomen[36] = "Μαγδαληνη";
	nameswomen[37] = "Χρυσάνθη";
	nameswomen[38] = "Αφροδίτη";
	nameswomen[39] = "Νικολέτα";
	nameswomen[40] = "Αμαλία";
	nameswomen[41] = "Ασπασία";
	nameswomen[42] = "Μάρθα";
	nameswomen[43] = "Ευδοκία";
	nameswomen[44] = "Αντιγόνη";
	nameswomen[45] = "Αρετή";
	nameswomen[46] = "Ελπίδα";
	nameswomen[47] = "Τριανταφυλλιά";
	nameswomen[48] = "Δάφνη";
	nameswomen[49] = "Άρτεμις";
	
	//Creation of 60 male surnames
	surnamewomen[0] = "Αβαγιανέλλη";
	surnamewomen[1] = "Βαγοπούλου";
	surnamewomen[2] = "Αγαδάκη";
	surnamewomen[3] = "Αβραμάκου";
	surnamewomen[4] = "Βαγκαλιώτου";
	surnamewomen[5] = "Βαζακίδη";
	surnamewomen[6] = "Βαρθιωτάκη";
	surnamewomen[7] = "Γαβαλάκη";
	surnamewomen[8] = "Γαζηδέλλη";
	surnamewomen[9] = "Γαβρεηλίδου";
	surnamewomen[10] = "Γαλαζοπούλου";
	surnamewomen[11] = "Παπαδημούλη";
	surnamewomen[12] = "Δαβάκη";
	surnamewomen[13] = "Δαδάκου";
	surnamewomen[14] = "Δαβλιάκου";
	surnamewomen[15] = "Δαλδάρη";
	surnamewomen[16] = "Ελβατζή";
	surnamewomen[17] = "Ελευθεριάδη";
	surnamewomen[18] = "Εδιπίδη";
	surnamewomen[19] = "Κοντιζά";
	surnamewomen[20] = "Εκμετζίδου";
	surnamewomen[21] = "Ζαβαλιάδου";
	surnamewomen[22] = "Ζαγκίδου";
	surnamewomen[23] = "Ζακουμίδη";
	surnamewomen[24] = "Ηγουμενάκη";
	surnamewomen[25] = "Ηλιαδάκη";
	surnamewomen[26] = "Ηλιοπούλου";
	surnamewomen[27] = "Θαμνοπούλου";
	surnamewomen[28] = "Θαναηλάκη";
	surnamewomen[29] = "Θανιώτη";
	surnamewomen[30] = "Ικαριώτου";
	surnamewomen[31] = "Ιατράκη";
	surnamewomen[32] = "Καβελάκη";
	surnamewomen[33] = "Λαγοθμάκη";
	surnamewomen[34] = "Λαγωγιάννη";
	surnamewomen[35] = "Μαγγανιώτου";
	surnamewomen[36] = "Μαγωγιάννη";
	surnamewomen[37] = "Νανιοπούλου";
	surnamewomen[38] = "Ναζαρίδη";
	surnamewomen[39] = "Νασιώτη";
	surnamewomen[40] = "Ξανθάκη";
	surnamewomen[41] = "Ξενογιαννάκη";
	surnamewomen[42] = "Παπαγεωργακοπούλου";
	surnamewomen[43] = "Παντουβεράκη";
	surnamewomen[44] = "Παπαγιαννάτου";
	surnamewomen[45] = "Παπαγιαννούλη";
	surnamewomen[46] = "Αβαγιανέλλη";
	surnamewomen[47] = "Σακελλάρη";
	surnamewomen[48] = "Σαμαρίνη";
	surnamewomen[49] = "Σεϊνταρίδη";
	surnamewomen[50] = "Σειραδάκη";
	surnamewomen[51] = "Σιάκου";
	surnamewomen[52] = "Σιββοπούλου";
	surnamewomen[53] = "Ταβλαρίδη";
	surnamewomen[54] = "Ταγανίδου";
	surnamewomen[55] = "Χαλαμανίδου";
	surnamewomen[56] = "Χανίδου";
	surnamewomen[57] = "Θεολογίτη";
	surnamewomen[58] = "Θανογιάννη";
	surnamewomen[59] = "Θεοχάρη";
	
	
	for(int i=1 ; i<= 25; i++) {
		int randname = rand.nextInt(50);
		int randsurname = rand.nextInt(60);
		
	
		System.out.println("INSERT INTO Staff (name,surname,status,closecontact)\nValues ('" + namesmen[randname] + "', '"+ surnamemen[randsurname] + "','n','false');" );
		//counter++;
		System.out.println("INSERT INTO Staff (name,surname,status,closecontact)\nValues ('" + nameswomen[randname] + "', '"+ surnamewomen[randsurname] + "','n','false');" );
		//counter++;
		
		
	}
	}

}

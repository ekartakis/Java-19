//for now its just reader
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CsvReaderWriter {
	
	public static void main (String[] args) {
		Student[] students = new Student[10000];
		Scanner sc = new Scanner(System.in);	
		System.out.println("Import csv file path :"); //C:\Users\andreas\Desktop\Students.csv
		String filepath = sc.nextLine();
		String line = "";
			try {
				BufferedReader br = new BufferedReader(new FileReader(filepath));
				while((line = br.readLine()) != null) {
				String [] values = line.split(",");
				System.out.println(values[1]);
				if (values[1] == "Ανέστης") {
					break;
				}
				//int id = Integer.parseInt(values[0]);
				//students[] = new Student(id, values[1], values[3]);
				}
			} catch (FileNotFoundException e) {
				System.out.println("The files path is wrong");
			} catch (IOException e) {
				e.printStackTrace();
			}
	
	}
	
} //ioanna was here

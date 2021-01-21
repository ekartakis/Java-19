import java.util.Scanner;

public class Student {

	private int id; //ID ������
	private String name; //����� ������
	private String status;
	public static Student[] students = new Student[10000]; //�������� ������� 10000 ������ ��� �� ����������� Student
	static int count = 0;
	public static int total_neg = 0;
	public static int total_pos = 0;

	//���������� ������������ ��� ������ ��� �� ���������� ��� ������������ Student
	public Student(int id, String name, String status) {
		students[count] = this;
		count++;
		this.id = id;
		this.name = name;
		this.status = status;
	} //����� ������������

	//���������� ������� get ��� ��� ���� ��� ���������� int ID
	public int getID() {
		return id;
	} //����� �������

	//���������� ������� get ��� ��� ���� ��� ���������� String name
	public String getName() {
		return name;
	} //����� �������

	//���������� ������� get ��� ��� ���� ��� ���������� String status
	public String getStatus() {
		return status;
	} //����� �������

	public void setStatus(String status) {
		this.status=status;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setID(int id) {
		this.id=id;
	}

	//���������� ������� ��� ���������� ������������� ��� ������� ��� ����� ����� ���� ���������� COVID19.
	public static void newStudent() {
        String name;
		Scanner input = new Scanner(System.in);
		String result;

			do {
				System.out.print("�������� �� ���������� ��� ������� (�/�): ");
				result=input.nextLine();
			} while (result != "�" || result != "�");
			if (result == "�") {
				positive();
			} else {
				System.out.println("�������� ����� �������.");
				name = input.nextLine();
				negative();
		    }


	 }
	
	 //���������� ������ ��� �������� ����
	 public static void negative() {
	 total_neg++;
	 System.out.println("Stay safe and protect yourself");
     }
	 
	 //���������� ������ ��� ������ ����
	 public static void positive() {
		 changeStatus("P");
		 String answer;
		 String answer_2;
		 String connection;
		 total_pos++;
		 Scanner scan = new Scanner(System.in);
		 System.out.println("������ �� ������� �� ��������� ��� 14 �����." + "�������� �� ����������� ��� ������������ ���� �� ���������� �����������.");
		 System.out.println("����� ����� �� ����� �� ���� ��� ��������������� ���������� ��� ���������� 48 ����;");
		 
		 do {
		 answer = scan.nextLine();
	     } while(answer!="���" || answer!="���");
	    	 
		 if (answer=="���") {
		 do {
			 System.out.println("������ �� ����� ��� ������.");
			 connection = scan.nextLine();
             positive_contacts();
             System.out.println("������� ������ ���� �����;");
             
             do {
             answer_2 = scan.nextLine();
             } while(answer_2 != "���" || answer != "���");
             
	     } while (answer_2 != "���");
	     }

    }
	 
     //���������� ������ ��� ��� ������������������� ������ ��� �������������� ����������
     public static void positive_contacts() {
		changeStatus("/");
		Scanner dm = new Scanner(System.in);
		int p = 0;
		int n = 0;
		String an1;
		System.out.println("����� ��������� ������ ��� �� �������� ����������");
		System.out.println("�������:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
	    if (an1 == "���") {
			p = p + 1;
		}
		System.out.println("Fever:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
	    if (an1 == "���") {
			p = p + 1;
		}
		System.out.println("�����:");
	    do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
	    if (an1 == "���") {
			p = p + 1;
		}
		System.out.println("��������:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
		if (an1 == "���") {
			p = p + 1;
		}
		System.out.println("�������:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
		if (an1 == "���") {
			p = p + 1;
		}
		System.out.println("�������:");
		do {
		an1 = dm.nextLine();
	    } while (an1 != "���" || an1 != "���");
		if (an1 == "���") {
			p = p + 1;
		}
		if (p > 1) {
			System.out.println("������ �� ������ ���� ���������� COVID19 ��� �� ������� �� ��������� ��� ��� �������� 14 ����� ���������� ��� �� ����������.");
		} else {
		    System.out.println("�����������:");
		    do {
		        an1 = dm.nextLine();
	        } while (an1 != "���" || an1 != "���");
		    if (an1 == "���") {
			    n = n + 1;
		    }
		    System.out.println("�����:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "���" || an1 != "���");
		    if (an1 == "���") {
			    n = n + 1;
		    }
		    System.out.println("��������:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "���" || an1 != "���");
		    if (an1 == "���") {
			    n = n + 1;
		    }
		    System.out.println("�������:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "���" || an1 != "���");
		    if (an1 == "���") {
		        n = n + 1;
		    }
		    System.out.println("��������:");
		    do {
		        an1 = dm.nextLine();
		    } while (an1 != "���" | an1 != "���");
		    if (an1 == "���") {
			    n = n + 1;
		    }
		    if (n > 1) {
				System.out.println("������ �� ������� �� ��������� ��� ��� �������� 10 �����. ��� �� ���������� ��� ����������� ������ �� ������ ���� ���������� COVID19.");
			}
	    }
	    if (p <=1 || n<=1) {
			System.out.println("������ ����� ����� �� ����� �� ������������� �������, ������ �� ������� �� ��������� ��� ��� �������� 7 �����. ��� ������������ ������ ��� �� �������������� ���������� ������ �� ������ test ���������� COVID19.");
		}

    }
     
    //���������� ������ ��� ��� ������ ��� status ��������� �������
    public static void changeStatus(String status) {
	    Scanner input = new Scanner(System.in);
	    int id2;
	    boolean found_sc=false;
	    int con_found_sc = 0;
	    do {
			System.out.print("�������������� �� �������. ");
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
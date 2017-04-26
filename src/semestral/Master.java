package semestral;

import java.util.Scanner;

public class Master {
	public static void main(String[] args) {
		DB db = new DB();
		Scanner sc = new Scanner(System.in);
		int option;

		while(true) {
			System.out.println("Select an action:");
			System.out.println("1.) Add a machine");
			System.out.println("2.) Add a new task");
			System.out.println("3.) Remove a task");
			System.out.println("4.) Remove a machine");
			System.out.println("5.) Kill machine");
			System.out.println("6.) Repair machine");
			System.out.println("7.) View all machines");
			System.out.println("8.) View machines energetic usage");
			System.out.println("9.) View all tasks");
			System.out.println("10.) Export DB");
			System.out.println("11.) Import DB");
			
			option = onlyInteger(sc);
			switch (option) {
				case 1:
					System.out.println("Type machine type: [Integer (1|2|3)] and index [Integer]");
					int type 	= onlyInteger(sc);
					int index 	= onlyInteger(sc);
					
					boolean result = db.addMachine(type, index);
					
					if(result) {
						System.out.println("Machine has been added successfully on index [" + index + "]");
					} else {
						System.out.println("Machine is in the database already!");
					}
						
					break;
				/*case 2:
					System.out.println("Zadejte jmeno a prumer studenta");
					jmeno=sc.next();
					prumer = pouzeCisla(sc);
					if (!mojeDatabaze.setPrumer(jmeno,prumer))
						System.out.println("Prumer nezadan");
					
					break;
				case 3:
					System.out.println("Zadejte jmeno studenta");
					jmeno=sc.next();
					Student info = null;
					info=mojeDatabaze.getStudent(jmeno);
					if (info!=null)
						System.out.println("Jmeno: " + info.getJmeno() + " rok narozeni: " + info.getRocnik() + " prumer: " + info.getStudijniPrumer());
					else
						System.out.println("Vybrana polozka neexistuje");
					break;
				case 4:
					System.out.println("Zadejte jmeno studenta k odstraneni");
					jmeno=sc.next();
					if (mojeDatabaze.vymazStudenta(jmeno))
						System.out.println(jmeno + " odstranen ");
					else
						System.out.println(jmeno + " neni v databazi ");
					break;
				case 5:
					mojeDatabaze.vypisDatabaze();
					break;
				case 6:
					run=false;
					break;*/
			}
			
		}
	}
	
	public static int onlyInteger(Scanner sc) {
		int num = 0;
		
		try {
			num = sc.nextInt();
		} catch(Exception e) {
			System.out.println("Exception " + e.toString());
			System.out.println("Please type an integer");
			sc.nextLine();
			
			num = onlyInteger(sc);
		}
		
		return num;
	}
}
package semestral;

import java.util.HashMap;

public class DB {
	public HashMap<Integer, Machine> db;
	
	DB() {
		db = new HashMap<Integer, Machine>();
	}
	
	public boolean addMachine(int type, int id) {
		Machine current = db.get(id);
		
		if (current == null) {
			Machine machine = new Machine(type);
			db.put(id, machine);
			
			return true;
		} 
		
		return false;
	}
}
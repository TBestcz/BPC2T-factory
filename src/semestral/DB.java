package semestral;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class DB {
	private HashMap<Integer, Machine> machine_db;
	private HashMap<Integer, Machine> task_db;
	private boolean type_3 = false;
	
	DB() {
		machine_db = new HashMap<Integer, Machine>();
		task_db = new HashMap<Integer, Machine>();
	}
	
	public boolean addMachine(int type, int id) {
		Machine current = machine_db.get(id);
		
		if (current == null) {
			Machine machine = new Machine(type);
			machine_db.put(id, machine);
			
			return true;
		} 
		
		return false;
	}
	
	public boolean addTask(int type, int count) {
		if(this.isCapacity(count)) {
			HashMap<Integer, Machine> machines = this.getMachinesAbleToDoThisShit(type);
			int actual_used = 0;
			
			for(Entry<Integer, Machine> entry : machines.entrySet()) {
				Machine machine = entry.getValue();
				actual_used += machine.getUsedCapacity();
			}
			
			int needed = actual_used + count;
			
			/**
			 * A ted pyco to zkurvene peklo s modulo vole
			 */
			int residue = 
		}
			
			
			
			int needed = count;
			
			for(Entry<Integer, Machine> entry : machine_db.entrySet()) {
				Machine machine = entry.getValue();
				int free = machine.getFreeCapacity();
			}
		
		
		return false;
	}
	
	public boolean isCapacity(int needed) {
		int current = this.currentFreeCapacity();
		
		return (current > needed) ? true : false;
	}
	
	public HashMap getMachinesAbleToDoThisShit(int type) {
		HashMap machines = new HashMap<Integer, Machine>();
		int index = 0;
		
		if(type == 2) { // sroubek
			for(Entry<Integer, Machine> entry : machine_db.entrySet()) {
				Machine machine = entry.getValue();
				
				if(machine.getType() == 2) { // only this can make screws
					machines.put(index, machine);
					index++;
				}
			}
			
			return machines;
		} else {
			return this.machine_db;
		}
	}
	
	public int currentFreeCapacity(int type) {
		int current = 0;
		
		for(Entry<Integer, Machine> entry : machine_db.entrySet()) {
			Machine machine = entry.getValue();
			
			if(type == 1) { // podlozka
				
			} else { // sroubek
				
			}
		
			current += machine.getFreeCapacity();
		}
		
		return current;
	}
}
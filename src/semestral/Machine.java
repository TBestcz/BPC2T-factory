package semestral;

import java.util.HashMap;

public class Machine {
	private int type, usage, capacity, capacity_used;
	private boolean screw, multiple, faulty;
	
	Machine(int type) {
		switch(type) {
			case 1:
				this.type = type;
				this.usage = 4;
				this.capacity = 70;
				this.capacity_used = 0;
				this.screw = false;
				this.multiple = true;
				this.faulty = false;
				
			break;
			
			case 2:
				this.type = type;
				this.usage = 3;
				this.capacity = 50;
				this.capacity_used = 0;
				this.screw = true;
				this.multiple = true;
				this.faulty = true;
				
			break;
				
			case 3:
				this.type = type;
				this.usage = 2;
				this.capacity = 150;
				this.capacity_used = 0;
				this.screw = false;
				this.multiple = false;
				this.faulty = true;
				
			break;
		}
	}
	
	public int getUsedCapacity() {
		return this.capacity_used;
	}
	
	public void addToUsedCapacity(int num) {
		this.capacity_used += num;
	}
	
	public int getFreeCapacity() {
		return (this.capacity - this.capacity_used);
	}
	
	public int getType() {
		return this.type;
	}
}
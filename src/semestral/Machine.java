package semestral;

import java.util.HashMap;

public class Machine {
	private int type, usage, capacity;
	private boolean screw, multiple, faulty;
	
	Machine(int type) {
		switch(type) {
			case 1:
				this.type = type;
				this.usage = 4;
				this.capacity = 70;
				this.screw = false;
				this.multiple = true;
				this.faulty = false;
				
			break;
			
			case 2:
				this.type = type;
				this.usage = 3;
				this.capacity = 50;
				this.screw = true;
				this.multiple = true;
				this.faulty = true;
				
			break;
				
			case 3:
				this.type = type;
				this.usage = 2;
				this.capacity = 150;
				this.screw = false;
				this.multiple = false;
				this.faulty = true;
				
			break;
		}
	}
}
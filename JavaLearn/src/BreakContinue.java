
public class BreakContinue {

	public static void main(String[] args) {
		// break statement used to jump out of a loop 
		
		for (int i = 0; i<10; i++) {
			if(i==4) {
				break;
			}
			
			System.out.println(i);
		}
		
	//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
		for (int i = 0; i<10; i++) {
			if(i==4) {
				continue;
			}
			
			System.out.println(i);
		}
		
		// break and continue in while loop
		int i = 0; // break example 
		while(i<10) {
			System.out.println(i);
			i++;
			if (i==4) {
				break;
			}
		}
		// continue example 
		int j = 0; 
		while(j<10) {
			if (j==4) {
				continue;
			}
			System.out.println(j);
			j++;
		}
	}
	
	
	}



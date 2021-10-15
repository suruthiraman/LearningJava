
public class ALLLoops {

	public static void main(String[] args) {
		//for loop instead of a while loop
		for(int i=0; i<3; i++) {
		System.out.println(i);
		}
        // another example 
		for(int j=0; j <=10; j=j+2) {
			System.out.println(j);
		}
		
		//for-each loop
		String[] cars = {"Audi", "BMW", "volvo", "TESla"};
		for (String i : cars) {
			System.out.println(i);
		}
	}
}


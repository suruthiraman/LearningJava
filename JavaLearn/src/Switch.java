 // switch statement to select one of many code blocks to be executed 
public class Switch {

	public static  void main(String[] args) {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("montag");
			break;
		case 2:
			System.out.println("dienstag");
			break;
		case 3:
			System.out.println("mittwoch");
			break;
		case 4:
			System.out.println("donnerstag");
			break;
		case 5:
			System.out.println("freitag");
			break;
			// default keyword specifies some code to run insted of 3 ,we put it 6
			default :
				System.out.println("looking forward to wochende");
		}
	}

}

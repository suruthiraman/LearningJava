
public class Arrays {

	public static void main (String[] args) {
		String [] cars = {"AUdi", "Tesla","BMW"}; // access the element of an array 
		cars[0]="opel"; // change the array 
		for (int i = 0; i < cars.length; i++) {
			  System.out.println(cars[i]);
			}
		System.out.println(cars[0]);
		System.out.println(cars.length); // array length
	}

}

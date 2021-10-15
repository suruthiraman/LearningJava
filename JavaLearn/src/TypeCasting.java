// two types of casting 
// Widening Casting - Converting a smaller type to larger type 
    // -->byte-->short-->char-->int-->long-->float-->double
// Narrowing Casting - Converting larger  to smaller size type 
    //-->double-->float-->long-->int-->char-->short-->byte
public class TypeCasting {
	
	public static void main (String[] args) {
		int myInt =10;               // Widening Casting 
		double myDouble =myInt;     // Automatic casting: int to double

		
		System.out.println(myInt);
		System.out.println(myDouble);
		
		 double myDoub = 5.43d;     // Narrow Casting
		 int myInte = (int) myDoub; // Manual casting: double to int
		 
		 System.out.println(myDoub);   
		    System.out.println(myInte);      
	}

}

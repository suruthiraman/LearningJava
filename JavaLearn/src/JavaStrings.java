 // Strings are used for storing text
public class JavaStrings {
	
	public static void main (String[] args) {
		String greetings = "Guten Tag";  // storing text 
		System.out.println(greetings);
		
		String txt = " Sakthijanani"; // string length
		System.out.println("The length of the text string is: "  + txt.length());
		
		String text = "Hallo zussammen"; // More string methods
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		
		String text1 = "please Beachlove where 'Beachlove' occurs!!!";  ///Find character string ,using indexof()method returns index position.
		System.out.println(text1.indexOf("Beachlove"));
		
		String firstname = "Sruthi"; // string Concatenation (+ used b/w strings to combine them)
		String lastname = "Ram";
		System.out.println(firstname +"  " + lastname);
		System.out.println(firstname.concat(lastname)); //Concat 
		
		String text2 = "some  \"Friends\" are crazzyyyy!!!!!."; // \" insert a double quote in string
		System.out.println(text2);
		
		String text3 = "It\'s over"; // \' insert single quote in string 
		System.out.println(text3);
		
		String text4 = "These dogs are \\  funny."; // \\ insert single backslash in a string 
		System.out.println(text4);
		
		String text5 = "Hello \n German "; // newline 
		System.out.println(text5);
		
		String text6 = " Herzlich \r willkommen!!!!!"; // carriage return
		System.out.println(text6);
		
		String text7 = "dog\tcat"; // Tab
		System.out.println(text7);
		
		String text8 =  "Hel\blo World!";// backspace
		System.out.println(text8);
		
		String d= "33";  // adding two Strings
		String e= "34";
		String f=d+e;
		System.out.println(f);
		
		String g= "55";
		int h = 20;
		String i = g+h;
		System.out.println(i);
		
		
				
	}

}

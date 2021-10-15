// primitive Datatypes - byte(1byte),short(2 byte),int(4 byte),long(8bytes),float(4),double(8),boolean(1bit),char(2)
//Non-Primitive Datatypes- String, Array,Classes.

public class DataTypes {
     public static void main (String[] args) {
    	 byte myNum = 100; // store whole numbers from -128 to 127
    	 short myNumm = 3000; // store whole numbers from -32768 to 32767
    	 int Num = 31000; //store whole numbers from -2147483648 to 2147483647
    	 long Numm = 15900000L; //store whole numbers from -9223372036854775808 to 9223372036854775807 // always end with L
    	 float Numb = 3.75f; //store fractional numbers from 3.4e−038 to 3.4e+03 and  always end with f  
    	 double myNumber = 19.99d; // store fractional numbers from 1.7e−308 to 1.7e+308. end the value with a "d":
    	 float f1 = 35e3f; // scientific number with an "e" to indicate the power of 10:
    	 double d1 = 12E4d;
    	 boolean iscrazy = true; // boolean keyword and can only take the values true or false:
    	 boolean iscandy = false;
    	 char myGrade = 'S'; // single character & single quotes, like 'A' or '
    	 char myVar1 = 65, myVar2 = 66, myVar3 = 67; //use ASCII values to display certain characters:
    	 
    	 System.out.println(myNum);
    	 System.out.println(myNumm);
    	 System.out.println(Num);
    	 System.out.println(Numm);
    	 System.out.println(Numb);
    	 System.out.println(myNumber);
    	 System.out.println(f1);
    	 System.out.println(d1);
    	 System.out.println(iscrazy);     
    	 System.out.println(iscandy); 
    	 System.out.println(myGrade);
    	 System.out.println(myVar1);
    	 System.out.println(myVar2);
    	 System.out.println(myVar3);
     }
}

public class StringTester {

 

public static void main(String[] args) {

// FIRST try to predict what each line of code prints.

// Then uncomment each line to test the code 

 

String s = "Johnny can't read";

 

String str = "a";

 

char ch = 'a';

 

 

 

//System.out.println(str + str);
//aa

 

//System.out.println((1 == 1) + str);
//truea

 

//System.out.println(ch + str);
//aa

 

//System.out.println(ch);
//a

 

//System.out.println(ch + ch);
//194

 

//System.out.println(s.length());
//17

 

//System.out.println(s.charAt(2));
//h

 

//System.out.println("" + s.charAt(7) + s.charAt(8) + s.charAt(9));
//can

 

//System.out.println(s.charAt(7) + s.charAt(8) + s.charAt(9));
//306

 

//System.out.println((char) ('A' + 1));
//B

 

//System.out.println(s.substring(7));
//can't read
 

//System.out.println(s.substring(7,10));
//can

 

//System.out.println(s.indexOf("a"));
//8

 

//System.out.println(s.indexOf("a",9));
//15
 

//System.out.println(s.charAt(s.length()));
//Error

 

// produces an error 

 

String t = "Fred can't read";

 

//System.out.println(s.compareTo(t));
//4

 

//System.out.println(s.charAt(6));
//

 

System.out.println(t.compareTo(s));
//-4

 

} 

}

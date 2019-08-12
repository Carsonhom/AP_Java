
public class Sorter {
	private static String s1 = "4";
	private static String s2 = "9";
	private static String s3 = "2.5";
	//When you get the results there are no spaces between the numbers

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(s1.compareTo(s2) < 0){ // prints s1 s2
			if(s2.compareTo(s3) < 0){ // prints s1 s2 s3
				System.out.println(s1 + s2 + s3);
			}
			else if(s2.compareTo(s3) > 0 && s1.compareTo(s3) < 0){//prints s1 s3 s2
				System.out.println(s1 + s2 + s3);
			}
			else if(s1.compareTo(s2) < 0 && s1.compareTo(s3) > 0){//prints s3 s1 s2
				System.out.println(s3 + s1 + s2);
			}
		}
		else{ //prints s2 s1
			if(s1.compareTo(s3) < 0){ //prints s2 s1 s3
				System.out.println(s2 + s1 + s3);
			}
			else if(s1.compareTo(s3) > 0 && s2.compareTo(s3) < 0){//prints s2 s3 s1
				System.out.println(s2 + s3 + s1);
			}
			else if(s1.compareTo(s3) > 0 && s2.compareTo(s3) > 0){//prints s3 s2 s1
				System.out.println(s3 + s2 + s1);
			}
			
		}
		
		

	}

}

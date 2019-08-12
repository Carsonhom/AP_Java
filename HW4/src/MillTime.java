import javax.swing.JOptionPane;

public class MillTime {
	
	public String t1;
	public String t2;
	public double dif;
	public String hrs;
	public String mins;
	public String sDif = Double.toString(dif);
	public double minutes = Double.parseDouble(mins);
	public double hours = Double.parseDouble(hrs);
	
	
	public MillTime(String time1, String time2){
		t1 = time1;
		t2 =  time2;
		
	}
	
	public double getDif(){
		dif = Integer.parseInt(t2) - Integer.parseInt(t1);
		return dif;
		
	}
	
	public String getHrs(){
		if (dif > 999){
			hrs = sDif.charAt(0) + sDif.charAt(1) + "hours";
		} else {
			hrs = sDif.charAt(0) + "hours";
		}
		return hrs;
		
	}
	
	public String getMins(){
		if (dif > 999){
			mins = sDif.charAt(2) + sDif.charAt(3) + "minutes";
		} else {
			mins = sDif.charAt(2) + "minutes";
		}
		return mins;
		
	}
	
	public static void main(String[] args) {
		JOptionPane jpane = new JOptionPane();
		String input = JOptionPane.showInputDialog("What is the first time");
		String input2 = JOptionPane.showInputDialog("What is the second time");
		
		
		MillTime time = new MillTime(input, input2);
		//System.out.println(input + input2);
		//time.getDif();
		//time.getHrs();
		//time.getMins();
		//System.out.println(hrs + mins);
		
		//Gives error Cannot make a static reference to the non-static field
		
		System.exit(0);
	}

}

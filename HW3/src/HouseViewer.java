/**

 * 

 * @author chrisbell -- borrowed by (your name here)

 *This class will make the JFrame to view the house in

 */

 

import javax.swing.JFrame;

 

public class HouseViewer {

public static void main(String[] args){

JFrame frame = new JFrame();

 

final int FRAME_WIDTH = 600;  //can't be changed

final int FRAME_HEIGHT = 600;  //capitalized tells reader they can't change that variable

 

frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 

HouseComponent component = new HouseComponent();

frame.add(component);

 

frame.setVisible(true);

 

}

 

}

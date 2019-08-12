//By Drake and Carson

//need this to use ArrayLists

import java.util.ArrayList;

 

public class ArrayListExplore {

 

public static void main(String[] args) {

 

 

// TASK 1: ArrayList methods that you will need to use:  add, get, set, remove, size

 

 

// Create an ArrayList called "names" that holds references to String

 ArrayList<String> names = new ArrayList<String>();

 

    // Print out the initial size of names.  How does that differ from the initial capacity?

 System.out.println(names.size());
 //It differs from the initial array because when the arraylist is first created its size is null but that amount is changed to null

 

    // Add the following String references to the ArrayList: Amy, Bob, Cindy.  

 names.add("Amy");
 names.add("Bob");
 names.add("Cindy");

 

//Print out the new size of names

 System.out.println(names.size());

     

// Print out the array list

 System.out.println(names);

 

    // Access and print out the Objects using a for loop (hint: use the get method)

for(int i = 0; i < names.size(); i++){
	System.out.println(names.get(i));
}

 

    // Replace "Amy" with "Zoe"

 names.set(0, "Zoe");

   

    // Print out the array list again

 System.out.println(names);

 

    // Insert "Valerie" at index 1

 names.add(1, "Valerie");

 

 

     //System.out.println("\nAfter adding at index 1:");
 System.out.println(names);

   

 

  // Would the following statement work?   names.add(5, "Gertrude");
     //names.add(5, "Gertrude");
   

   

  // Remove the second element
names.remove(1);
 

 

  // Print the updated ArrayList

 System.out.println(names);

   

   

//TASK 2    

   

    //The value null in a cell counts as data!  An empty cell is not the same as a cell that contains null.

    //INSTRUCTIONS:  Type what gets printed out in each case.  Just add in comments.  

   

   

    ArrayList guitars = new ArrayList();

 

     System.out.println( "Case A:" + guitars.isEmpty() );

//    Case A:true

     guitars.add( null );    

     System.out.println( "Case B:" + guitars.isEmpty() );

//    Case B:false

     guitars.remove( 0 );  

     System.out.println( "Case C:" + guitars.isEmpty() );

//    Case C:true

     guitars.add( "" );    

     System.out.println( "Case D:" + guitars.isEmpty() );

//    Case D:false

     guitars.clear( );    

     System.out.println( "Case E:" + guitars.isEmpty() );

//    Case E:true

//    

//    

    ArrayList roster = new ArrayList();

 

    roster.add( "Amy" );     

    roster.add( "Bob" );

    roster.add( "Chris" );   

    roster.add( "Deb" );

    roster.add( "Elaine" );  

    roster.add( "Joe" );

 

     System.out.println( "First Search: " + roster.indexOf( "Elaine" ) ); 

     System.out.println( "Second Search: " + roster.indexOf( "Zoe" ) ); 

   

// TASK 3 use an enhanced for loop to print out the names of the students in the CS Club

    ArrayList<String> csClub = new ArrayList<String>();

 

    csClub.add( "Amy" );    csClub.add( "Bob" ); 

    csClub.add( "Chris" );  csClub.add( "Deb" ); 

    csClub.add( "Elaine" ); csClub.add( "Frank" );

    csClub.add( "Gail" );   csClub.add( "Hal" );

 

    //your code here

 for(int i = 0; i < csClub.size(); i++){
	 System.out.println(csClub.get(i));
 }

 int x = 5;
 System.out.println(x / 2);

}

//

}
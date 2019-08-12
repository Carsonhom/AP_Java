// The variable state is used to determine whether or not to do animation.
// When the program starts, state is set to 0 because there is no active animation.
// When Step or Start are clicked, then animation needs to take place and changing 
// the variable state will result in animation taking place inside of draw().
//
// Remember that draw() is like a paint method inside an infinite loop; 
// there is a conditional that looks at the value of state and will 
// initiate animation. (go and look at draw() to see what is there!) 
//
// state:
//   0 -> No animation
//   1 -> Step one iteration
//   2 -> Play continuous iterations
int state = 0;

// Constants referring to the grid
final int ROWS = 40;
final int COLS = 60;
final int CELL_WIDTH = 15;
final int CELL_HEIGHT = 15;
final int LEFT_OFFSET = 12;
// From top of window to top of grid
final int TOP_OFFSET = 12;
// From top of window to bottom of grid
final int BOTTOM_GRID_OFFSET = TOP_OFFSET + (CELL_HEIGHT+1)*ROWS;
// From top of window to top of buttons
final int BUTTON_Y_OFFSET = BOTTOM_GRID_OFFSET + 12;
final int BUTTON_WIDTH = 100;
final int BUTTON_HEIGHT = 40;

// Create an array of cell references
// Remember: no cells have yet been put into memory, the new operator
// with parentheses is required to put an object into memory
//
// For example: 
// cell[row][col] = new Cell(row, col);
Cell[][] cell = new Cell[ROWS][COLS];

void setup() {
  // The one obnoxious line of code.  It turns out that numeric literals have
  // to be entered into the first two arguments of the size() procedure.
  // The size cannot be determined by defined constants.
  size(1024, 768, P3D);
  
  // Initialize grid of cells
  initGrid();  
  
  // Creating a glider on the corners of the grid
  setUpCells();
  
  // Set up the font for button display
  textSize(32);
  PFont font = createFont("ComicSansMS-Bold", 32);
  textFont(font);
  textAlign(CENTER, CENTER);
}

// draw() is effectively inside an infinite loop.
void draw() {
  background(#FFFFFF); //white (complete saturation of red, green, and blue --> white)
  stroke(#000000);     //black (no red, green, or blue --> black)
  
    // 1: step, 2: start
    if (state == 1 || state == 2){
    // Each cell determines how many neighbors it has
    calcNeighborsForAllCells();
    
    // Each cell updates its alive/dead status
    updateAliveForAllCells();
    
    if (state == 2) delay(50); //50ms delay between animation updates
    if (state == 1) state = 0; //step completed, return to original state
    }
  // Have all of the cells draw themselves as alive/dead on the grid
  displayCells();
  
  // Draw buttons
  drawButtons();
}

void drawButtons(){
  // Start, Stop, Clear rectangles in gray
  fill(#DDDDDD);
  for (int i = 0; i < 3; i++) {
    rect(LEFT_OFFSET+i*(BUTTON_WIDTH+12), BUTTON_Y_OFFSET, BUTTON_WIDTH, BUTTON_HEIGHT);
  }
  
  // Set text color on the buttons to blue
  fill(#0000FF);
  // Draw Start/Stop, Step, Clear text onto the gray buttons
  text((state == 2) ? "Stop" : "Start", LEFT_OFFSET+50, BUTTON_Y_OFFSET+12); 
  text("Step", LEFT_OFFSET+50+BUTTON_WIDTH+12, BUTTON_Y_OFFSET+12); 
  text("Clear", LEFT_OFFSET+50+2*(BUTTON_WIDTH+12), BUTTON_Y_OFFSET+12); 
}

void setUpCells() {
  //Creating a glider on the corners of the grid
  cell[ROWS-1][COLS-1].setAlive(true);
  cell[ROWS-1][0].setAlive(true);
  cell[ROWS-1][1].setAlive(true);
  cell[0][1].setAlive(true);
  cell[1][0].setAlive(true);
}

void initFont() {
  textSize(32);
  PFont font = createFont("ComicSansMS-Bold", 32);
  textFont(font);
  textAlign(CENTER, CENTER);
}